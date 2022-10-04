package br.com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.algaworks.algafood.domain.model.Permissao;
import br.com.algaworks.algafood.domain.repository.PermissaoRespository;

public class PermissaoRepositoryImpl implements PermissaoRespository{
    
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> listar() {
        return manager.createQuery("from Permissao", Permissao.class).getResultList();
    }

    @Override
    public Permissao buscar(Long id) {
        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public Permissao salvar(Permissao cozinha) {
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Permissao cozinha) {
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }
}
