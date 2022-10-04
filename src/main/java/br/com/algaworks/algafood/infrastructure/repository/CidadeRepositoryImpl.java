package br.com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.algaworks.algafood.domain.model.Cidade;
import br.com.algaworks.algafood.domain.repository.CidadeRepository;

public class CidadeRepositoryImpl implements CidadeRepository{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> listar() {
        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Override
    public Cidade buscar(Long id) {
        return manager.find(Cidade.class, id);
    }

    @Transactional
    @Override
    public Cidade salvar(Cidade cozinha) {
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Cidade cozinha) {
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }
    
}
