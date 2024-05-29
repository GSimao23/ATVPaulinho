
package br.gabriel.at5p;

import java.time.LocalDate;


public class Produto {
    private int codProduto;
    private String descricao;
    private LocalDate dataEntrada;
    private String ufOrigem;
    private String ufDestino;

    public Produto(int codProduto, String descricao, LocalDate dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }
}

