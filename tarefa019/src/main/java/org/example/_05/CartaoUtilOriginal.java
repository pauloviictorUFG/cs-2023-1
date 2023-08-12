//https://www.devmedia.com.br/artigo-java-magazine-46-refactoring-da-teoria-a-pratica/10169
package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal  {
    public static final int VISA = 1;
    public static final int MASTERCARD = 2;
    public static final int AMEX = 3;
    public static final int DINERS = 4;
    public static final String CARD_OK = "Valid card";
    public static final String CARD_ERROR = "Invalid card";

    public String validate(int cardType, String number, String expirationDate) {
        // ----- EXPIRATION DATE -----
        boolean expirationDateOK = false;
        Date dateExpiration;
        try {
            dateExpiration = new SimpleDateFormat("MM/yyyy").parse(expirationDate);
        } catch (ParseException e) {
            return CARD_ERROR;
        }

        Calendar calExpiration = new GregorianCalendar();
        calExpiration.setTime(dateExpiration);

        // Only month and year are used in the validation
        Calendar calToday = Calendar.getInstance();
        calToday.set(Calendar.DAY_OF_MONTH, 1);
        calToday.set(Calendar.HOUR_OF_DAY, 0);
        calToday.set(Calendar.MINUTE, 0);
        calToday.set(Calendar.SECOND, 0);
        calToday.set(Calendar.MILLISECOND, 0);

        expirationDateOK = calToday.before(calExpiration);

        if (!expirationDateOK) {
            return CARD_ERROR;
        } else {
            // ---- PREFIX AND LENGTH -----
            String formatted = number.replaceAll("[^0-9]", "");

            boolean formatOK = false;

            switch (cardType) {
                case VISA: // Lengths 13 or 16, prefix 4
                    formatOK = formatted.matches("^4\\d{12}(\\d{3})?$");
                    break;
                case MASTERCARD: // Length 16, prefixes 51 to 55
                    formatOK = formatted.matches("^5[1-5]\\d{14}$");
                    break;
                case AMEX: // Length 15, prefixes 34 and 37
                    formatOK = formatted.matches("^3[47]\\d{13}$");
                    break;
                case DINERS: // Length 14, prefixes 300 to 305, 36, and 38
                    formatOK = formatted.matches("^3(?:0[0-5]|[68]\\d)\\d{11}$");
                    break;
                default:
                    formatOK = false;
                    break;
            }

            if (!formatOK) {
                return CARD_ERROR;
            } else {
                // ----- NUMBER -----
                // Luhn algorithm (http://www.merriampark.com/anatomycc.htm)
                int sum = 0;
                int digit;
                boolean multiply = false;

                for (int i = formatted.length() - 1; i >= 0; i--) {
                    digit = Character.getNumericValue(formatted.charAt(i));
                    if (multiply) {
                        digit *= 2;
                        if (digit > 9) {
                            digit -= 9;
                        }
                    }
                    sum += digit;
                    multiply = !multiply;
                }

                if (sum % 10 == 0) {
                    return CARD_OK;
                } else {
                    return CARD_ERROR;
                }
            }
        }
    }
}


