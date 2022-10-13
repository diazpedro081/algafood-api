package br.com.algaworks.algafood.domain.repository;

import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.Estado;

@Repository
public interface EstadoRepository extends CustomJpaRepository<Estado, Long>{
    
}
