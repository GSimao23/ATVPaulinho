
package br.gabriel.at4p;

import java.time.LocalDate;
import java.util.Scanner;


public class At4P {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deposito deposito = new Deposito();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto ao depósito");
            System.out.println("2. Retirar produto do depósito");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
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
                    deposito.adicionarProduto(produto);
                    break;
                case 2:
                    deposito.retirarProduto();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
    

