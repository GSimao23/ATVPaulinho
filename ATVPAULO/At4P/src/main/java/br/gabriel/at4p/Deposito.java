
package br.gabriel.at4p;

import java.util.Stack;


public class Deposito {
    private final Stack<Produto> pilhaProdutos;

    public Deposito() {
        pilhaProdutos = new Stack<>();
    }

    public void adicionarProduto(Produto produto) {
        if (pilhaProdutos.size() >= 10) {
            System.out.println("O depósito está cheio. Não é possível adicionar mais produtos.");
            return;
        }
        pilhaProdutos.push(produto);
        System.out.println("Produto adicionado ao depósito: " + produto.getDescricao());
        mostrarPilha();
    }

    public Produto retirarProduto() {
        if (pilhaProdutos.isEmpty()) {
            System.out.println("O depósito está vazio. Não há produto para retirar.");
            return null;
        }
        Produto produtoRetirado = pilhaProdutos.pop();
        System.out.println("Produto despachado: " + produtoRetirado.getDescricao());
        mostrarPilha();
        return produtoRetirado;
    }

    public void mostrarPilha() {
        if (pilhaProdutos.isEmpty()) {
            System.out.println("O depósito está vazio.");
            return;
        }
        System.out.println("Produtos no depósito:");
        for (Produto produto : pilhaProdutos) {
            System.out.println(produto.getDescricao());
        }
    }
}

