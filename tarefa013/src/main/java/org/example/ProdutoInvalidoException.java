package org.example;

public class ProdutoInvalidoException  extends Exception{
    public ProdutoInvalidoException() {
        super("Tipo de Produto Inválido");
    }
}
