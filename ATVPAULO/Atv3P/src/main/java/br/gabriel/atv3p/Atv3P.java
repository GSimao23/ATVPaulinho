
package br.gabriel.atv3p;

import java.util.Scanner;

public class Atv3P {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PilhaLivros pilhaLivros = new PilhaLivros();

            int opcao;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar livro");
                System.out.println("2. Listar livros");
                System.out.println("3. Retirar livro");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do livro a adicionar: ");
                        scanner.nextLine(); // Consumir a quebra de linha
                        String titulo = scanner.nextLine();
                        Livro livro = new Livro(titulo);
                        pilhaLivros.adicionarLivro(livro);
                        break;
                    case 2:
                        pilhaLivros.listarLivros();
                        break;
                    case 3:
                        pilhaLivros.retirarLivro();
                        break;
                    case 4:
                        System.out.println("Encerrando o programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } while (opcao != 4);

            scanner.close();
    }

}