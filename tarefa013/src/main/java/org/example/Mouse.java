package org.example;

public class Mouse extends Produto{
    private String tipo;

    public Mouse(String nomeloja, double preco, String tipo) {
        super(nomeloja, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Tipo: " + tipo;
    }
}
