
package br.gabriel.at5p;

import java.util.HashMap;
import java.util.Map;

public class Deposito {
    
    private Map<Integer, PilhaProdutos> pilhas;

    public Deposito(int numPilhas) {
        pilhas = new HashMap<>();
        for (int i = 1; i <= numPilhas; i++) {
            pilhas.put(i, new PilhaProdutos());
        }
    }

    public void adicionarProduto(int numPilha, Produto produto) {
        PilhaProdutos pilha = pilhas.get(numPilha);
        if (pilha == null) {
            System.out.println("Pilha inválida. Não foi possível adicionar o produto.");
            return;
        }
        pilha.adicionarProduto(produto);
    }

    public Produto retirarProduto(int numPilha) {
        PilhaProdutos pilha = pilhas.get(numPilha);
        if (pilha == null) {
            System.out.println("Pilha inválida. Não foi possível retirar o produto.");
            return null;
        }
        return pilha.retirarProduto();
    }

    public void mostrarPilhas() {
        if (pilhas.isEmpty()) {
            System.out.println("Não há pilhas no depósito.");
            return;
        }
        System.out.println("Pilhas no depósito:");
        for (Map.Entry<Integer, PilhaProdutos> entry : pilhas.entrySet()) {
            int numPilha = entry.getKey();
            PilhaProdutos pilha = entry.getValue();
            System.out.println("Pilha " + numPilha + ":");
            pilha.mostrarPilha();
        }
    }
}
