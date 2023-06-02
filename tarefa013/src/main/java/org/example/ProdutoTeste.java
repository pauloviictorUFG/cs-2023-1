package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    private List<Produto> carrinho;

    public ProdutoTeste() {
        carrinho = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        carrinho.add(produto);
    }

    public void getDescricaoCarrinho() {
        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
        }
    }
}
