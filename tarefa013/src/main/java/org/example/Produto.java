package org.example;

public class Produto {
    private String nomeloja;
    private double preco;
    private String descricao;

    public Produto(String nomeloja, double preco) {
        this.nomeloja = nomeloja;
        this.preco = preco;
        this.descricao = "Produto de informática";
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
