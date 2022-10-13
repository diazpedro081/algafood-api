package br.com.algaworks.algafood.domain.repository;

import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.Cidade;

@Repository
public interface CidadeRepository extends CustomJpaRepository<Cidade, Long> {
	
}
