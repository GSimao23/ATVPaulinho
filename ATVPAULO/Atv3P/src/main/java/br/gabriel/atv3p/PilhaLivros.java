
package br.gabriel.atv3p;

import java.util.Stack;

public class PilhaLivros {
    private Stack<Livro> pilhaLivros;

    public PilhaLivros() {
        pilhaLivros = new Stack<>();
    }

    public void adicionarLivro(Livro livro) {
        pilhaLivros.push(livro);
        System.out.println("Livro adicionado à pilha: " + livro.getTitulo());
    }

    public void listarLivros() {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha de livros está vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (Livro livro : pilhaLivros) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public Livro retirarLivro() {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha de livros está vazia. Não há livro para remover.");
            return null;
        } else {
            Livro livroRemovido = pilhaLivros.pop();
            System.out.println("Livro removido da pilha: " + livroRemovido.getTitulo());
            return livroRemovido;
        }
    }
}
