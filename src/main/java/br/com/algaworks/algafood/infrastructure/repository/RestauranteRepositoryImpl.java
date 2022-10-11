package br.com.algaworks.algafood.infrastructure.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.Restaurante;
import br.com.algaworks.algafood.domain.repository.RestauranteRepositoryQueries;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepositoryQueries{
    
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal) {

        var jpql = "from Restaurante where nome like :nome and taxaFrete betWeen :taxaInicial and :taxaFinal";

        return manager.createQuery(jpql, Restaurante.class)
            .setParameter("nome", "%" + nome + "%")
            .setParameter("taxaInicial", taxaFreteInicial)
            .setParameter("taxaFinal", taxaFreteFinal)
            .getResultList();
    }
}
