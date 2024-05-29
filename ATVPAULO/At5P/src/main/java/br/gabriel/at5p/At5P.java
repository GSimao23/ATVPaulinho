
package br.gabriel.at5p;

import java.time.LocalDate;
import java.util.Scanner;


public class At5P {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deposito deposito = new Deposito(5);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto a uma pilha");
            System.out.println("2. Retirar produto de uma pilha");
            System.out.println("3. Mostrar pilhas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da pilha para adicionar o produto (1 a 5): ");
                    int numPilhaAdicionar = scanner.nextInt();
                    if (numPilhaAdicionar < 1 || numPilhaAdicionar > 5) {
                        System.out.println("Número de pilha inválido.");
                        break;
                    }
                    System.out.print("Digite o código do produto: ");
                    int codProduto = scanner.nextInt();
                    System.out.print("Digite a descrição do produto: ");
                    scanner.nextLine(); // Consumir a quebra de linha
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a UF de origem do produto: ");
                    String ufOrigem = scanner.next();
                    System.out.print("Digite a UF de destino do produto: ");
                    String ufDestino = scanner.next();
                    Produto produto = new Produto(codProduto, descricao, LocalDate.now(), ufOrigem, ufDestino);
                    deposito.adicionarProduto(numPilhaAdicionar, produto);
                    break;
                case 2:
                    System.out.print("Digite o número da pilha para retirar o produto (1 a 5): ");
                    int numPilhaRetirar = scanner.nextInt();
                    if (numPilhaRetirar < 1 || numPilhaRetirar > 5) {
                        System.out.println("Número de pilha inválido.");
                        break;
                    }
                    deposito.retirarProduto(numPilhaRetirar);
                    break;
                case 3:
                    deposito.mostrarPilhas();
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
    