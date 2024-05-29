
package br.gabriel.at2p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class At2P {

    public static void main(String[] args) {
        Queue<Cliente> filaPrioritaria = new LinkedList<>();
        Queue<Cliente> filaNormal = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int contadorPrioritario = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar próximo cliente");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Informe o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o ano de nascimento do cliente: ");
                    int anoNascimento = scanner.nextInt();
                    System.out.println("Cliente cadastrado com sucesso.");

                    Cliente cliente = new Cliente(filaPrioritaria.size() + filaNormal.size() + 1, nome, anoNascimento);
                    if (anoNascimento <= 1957) { // Verifica se o cliente tem 65 anos ou mais
                        filaPrioritaria.offer(cliente);
                    } else {
                        filaNormal.offer(cliente);
                    }
                    break;

                case 2:
                    if (!filaPrioritaria.isEmpty() && contadorPrioritario < 2) {
                        Cliente proximoClientePrioritario = filaPrioritaria.poll();
                        System.out.println("Próximo cliente prioritário chamado: " + proximoClientePrioritario.nome);
                        contadorPrioritario++;
                    } else if (!filaNormal.isEmpty()) {
                        Cliente proximoClienteNormal = filaNormal.poll();
                        System.out.println("Próximo cliente normal chamado: " + proximoClienteNormal.nome);
                        contadorPrioritario = 0; // Reinicia o contador de clientes prioritários atendidos
                    } else {
                        System.out.println("Não há mais clientes na fila.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }

            System.out.println();
        }
    }
}
