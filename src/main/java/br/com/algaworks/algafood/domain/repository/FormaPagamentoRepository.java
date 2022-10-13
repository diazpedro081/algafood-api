package br.com.algaworks.algafood.domain.repository;

import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.FormaPagamento;

@Repository
public interface FormaPagamentoRepository extends CustomJpaRepository<FormaPagamento, Long>{

}
