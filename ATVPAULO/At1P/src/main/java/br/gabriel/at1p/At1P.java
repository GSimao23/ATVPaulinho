
package br.gabriel.at1p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class At1P {

    public static void main(String[] args) {
        Queue<String> filaDeEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPaciente(filaDeEspera, scanner);
                    break;
                case 2:
                    chamarProximoPaciente(filaDeEspera);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarPaciente(Queue<String> filaDeEspera, Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Informe o nome do paciente: ");
        String nome = scanner.nextLine();
        filaDeEspera.offer(nome); // Adicionar paciente à fila
        System.out.println("Paciente " + nome + " adicionado à fila com sucesso.");
    }

    private static void chamarProximoPaciente(Queue<String> filaDeEspera) {
        if (!filaDeEspera.isEmpty()) {
            String proximoPaciente = filaDeEspera.poll(); // Remover e obter próximo paciente da fila
            System.out.println("Próximo paciente: " + proximoPaciente);
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }
}
    
