package org.example;

public class Livro extends Produto{
    private String autor;

    public Livro(String nomeloja, double preco, String autor) {
        super(nomeloja, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Autor: " + autor;
    }
}
