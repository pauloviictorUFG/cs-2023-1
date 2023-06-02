package org.example;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Mouse mouse1 = new Mouse("Loja A", 19.99, "Óptico");
        Mouse mouse2 = new Mouse("Loja B", 24.99, "Bluetooth");

        Livro livro1 = new Livro("Loja C", 39.99, "Autor X");
        Livro livro2 = new Livro("Loja D", 29.99, "Autor Y");

        carrinho.adicionarProduto(mouse1);
        carrinho.adicionarProduto(mouse2);
        carrinho.adicionarProduto(livro1);
        carrinho.adicionarProduto(livro2);

        carrinho.exibirDescricaoProdutos();
    }
}