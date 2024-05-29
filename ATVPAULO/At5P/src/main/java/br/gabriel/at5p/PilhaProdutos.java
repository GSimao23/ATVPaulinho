
package br.gabriel.at5p;

import java.util.Stack;

public class PilhaProdutos {
    private Stack<Produto> pilhaProdutos;

    public PilhaProdutos() {
        pilhaProdutos = new Stack<>();
    }

    public void adicionarProduto(Produto produto) {
        pilhaProdutos.push(produto);
    }

    public Produto retirarProduto() {
        if (pilhaProdutos.isEmpty()) {
            System.out.println("A pilha de produtos está vazia. Não há produto para retirar.");
            return null;
        }
        return pilhaProdutos.pop();
    }

    public void mostrarPilha() {
        if (pilhaProdutos.isEmpty()) {
            System.out.println("A pilha de produtos está vazia.");
            return;
        }
        System.out.println("Produtos na pilha:");
        for (Produto produto : pilhaProdutos) {
            System.out.println(produto.getDescricao());
        }
    }
}

