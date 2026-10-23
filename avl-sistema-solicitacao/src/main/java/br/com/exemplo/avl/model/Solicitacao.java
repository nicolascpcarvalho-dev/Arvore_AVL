package br.com.exemplo.avl.model;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Solicitacao {
    private final int numero;
    private String solicitante;
    private String descricao;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private final LocalDateTime dataAbertura;

    public Solicitacao(int numero, String solicitante, String descricao) {
        this.numero = numero;
        this.solicitante = solicitante;
        this.descricao = descricao;
        this.dataAbertura = LocalDateTime.now();
    }

    public int getNumero() { return numero; }
    public String getSolicitante() { return solicitante; }
    public String getDescricao() { return descricao; }
    public LocalDateTime getDataAbertura() { return dataAbertura; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
