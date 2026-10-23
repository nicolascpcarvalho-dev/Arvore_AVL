package br.com.exemplo.avl.dto;

public class SolicitacaoRequest {
    private int numero;
    private String solicitante;
    private String descricao;

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getSolicitante() { return solicitante; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
