package br.com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.algaworks.algafood.domain.model.FormaPagamento;
import br.com.algaworks.algafood.domain.repository.FormaPagamentoRepository;

public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository{
    
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> listar() {
        return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
    }

    @Override
    public FormaPagamento buscar(Long id) {
        return manager.find(FormaPagamento.class, id);
    }

    @Transactional
    @Override
    public FormaPagamento salvar(FormaPagamento cozinha) {
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(FormaPagamento cozinha) {
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }
}
