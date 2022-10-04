package br.com.algaworks.algafood.domain.repository;

import java.util.List;

import br.com.algaworks.algafood.domain.model.Cozinha;

public interface CozinhaRepository {

    List<Cozinha> todas();
    Cozinha porID(Long id);
    Cozinha adicionar(Cozinha cozinha);
    void remover(Cozinha cozinha);
    
}
