
package br.gabriel.at1p;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
 
    
    private final Queue<String> patientQueue;
    private int availableTickets;

    public Fila(int totalTickets) {
        patientQueue = new LinkedList<>();
        availableTickets = totalTickets;
    }

    public void addPatient(String patientName) {
        if (availableTickets > 0) {
            patientQueue.offer(patientName);
            availableTickets--;
            System.out.println("Paciente adicionado à fila com sucesso.");
        } else {
            System.out.println("Não há mais senhas disponíveis para hoje.");
        }
    }

    public String callNextPatient() {
        if (!patientQueue.isEmpty()) {
            String nextPatient = patientQueue.poll();
            System.out.println("Próximo paciente na fila: " + nextPatient);
            return nextPatient;
        } else {
            System.out.println("Não há mais pacientes na fila.");
            return null;
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

