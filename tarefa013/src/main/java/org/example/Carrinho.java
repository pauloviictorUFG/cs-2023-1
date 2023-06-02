package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirDescricaoProdutos() {
        for (Produto produto : produtos) {
            try {
                validarTipoProduto(produto);
                System.out.println(produto.getDescricao());
            } catch (ProdutoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private void validarTipoProduto(Produto produto) throws ProdutoInvalidoException {
        if (!(produto instanceof Mouse || produto instanceof Livro)) {
            throw new ProdutoInvalidoException();
        }
    }

}
