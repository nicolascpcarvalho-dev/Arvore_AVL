package br.com.exemplo.avl.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.exemplo.avl.model.Solicitacao;
import br.com.exemplo.avl.repository.SolicitacaoRepository;

@Service
public class SolicitacaoService {
    private final SolicitacaoRepository repository;

    public SolicitacaoService(SolicitacaoRepository repository) { this.repository = repository; }

    public void cadastrar(int numero, String solicitante, String descricao) {
        validar(solicitante, descricao);
        repository.inserir(new Solicitacao(numero, solicitante.trim(), descricao.trim()));
    }

    public boolean alterar(int numero, String solicitante, String descricao) {
        validar(solicitante, descricao);
        return repository.alterar(numero, solicitante.trim(), descricao.trim());
    }

    private void validar(String solicitante, String descricao) {
        if (solicitante == null || solicitante.isBlank()) throw new IllegalArgumentException("Informe o nome do solicitante.");
        if (descricao == null || descricao.isBlank()) throw new IllegalArgumentException("Informe a descrição da solicitação.");
    }

    public Solicitacao buscar(int numero) { return repository.buscar(numero); }
    public boolean remover(int numero) { return repository.remover(numero); }
    public List<Solicitacao> listar() { return repository.listar(); }
    public String exibirArvore() { return repository.exibirArvore(); }
}
