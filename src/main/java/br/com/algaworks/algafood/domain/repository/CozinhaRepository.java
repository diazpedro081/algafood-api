package br.com.algaworks.algafood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository extends CustomJpaRepository<Cozinha, Long> {

    List<Cozinha> nome(String nome);

}
