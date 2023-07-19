package org.example._02;

class Human {
    private String contry;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public String obterEnderecoCompleto() {
        StringBuilder resultado = new StringBuilder();
        return resultado
                .append(contry)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter)
                .toString();
    }
}
