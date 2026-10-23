package br.com.exemplo.avl.repository;

import java.util.List;
import br.com.exemplo.avl.model.Solicitacao;

public interface SolicitacaoRepository {
    void inserir(Solicitacao solicitacao);
    Solicitacao buscar(int numero);
    boolean alterar(int numero, String solicitante, String descricao);
    boolean remover(int numero);
    List<Solicitacao> listar();
    String exibirArvore();
}
