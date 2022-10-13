package br.com.algaworks.algafood.domain.repository;

import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.Permissao;

@Repository
public interface PermissaoRespository extends CustomJpaRepository<Permissao, Long>{

}
