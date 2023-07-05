package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        ResourceBundle bundlePt = ResourceBundle.getBundle("ApplicationMessages_pt_br");
        ResourceBundle bundleAu = ResourceBundle.getBundle("ApplicationMessages_australia", new Locale("en", "AU"));
        ResourceBundle bundleCh = ResourceBundle.getBundle("ApplicationMessages_ch_md", Locale.CHINA);
        ResourceBundle bundleUs = ResourceBundle.getBundle("ApplicationMessages_en_us", Locale.US);
        ResourceBundle bundleMx = ResourceBundle.getBundle("ApplicationMessages_es_mx", new Locale("es", "MEX"));
        ResourceBundle bundleFr = ResourceBundle.getBundle("ApplicationMessages_fr_fr", Locale.FRANCE);
        ResourceBundle bundleGm = ResourceBundle.getBundle("ApplicationMessages_gm_gm", Locale.GERMANY);
        ResourceBundle bundleJp = ResourceBundle.getBundle("ApplicationMessages_jp_jpn", Locale.JAPAN);
        ResourceBundle bundleRussia = ResourceBundle.getBundle("ApplicationMessages_russia", new Locale("ru", "RU"));
        ResourceBundle bundleIndia = ResourceBundle.getBundle("ApplicationMessages_india", new Locale("hi", "IN"));

        printMessages(bundlePt);
        printMessages(bundleAu);
        printMessages(bundleCh);
        printMessages(bundleUs);
        printMessages(bundleMx);
        printMessages(bundleFr);
        printMessages(bundleGm);
        printMessages(bundleJp);
        printMessages(bundleRussia);
        printMessages(bundleIndia);
    }

    public static  void printMessages(ResourceBundle bundle){
        System.out.println(bundle.getString("CountryName"));
        System.out.println(bundle.getString("Language"));
        System.out.println(bundle.getString("ShortDateFormat"));
        System.out.println(bundle.getString("LongDateFormat"));
        System.out.println(bundle.getString("TimeFormat"));
        System.out.println(bundle.getString("LocalCurrencySymbol"));
        System.out.println(bundle.getString("DecimalSeparator"));
        System.out.println(bundle.getString("ThousandSeparator"));
        System.out.println(bundle.getString("LocalCurrencySymbol2"));
        System.out.println(bundle.getString("WindowsPageCode"));
        System.out.println("****************************");
    }
}