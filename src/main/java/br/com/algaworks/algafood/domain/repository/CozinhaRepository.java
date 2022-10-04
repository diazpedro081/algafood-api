package br.com.algaworks.algafood.domain.repository;

import java.util.List;

import br.com.algaworks.algafood.domain.model.Cozinha;

public interface CozinhaRepository {

    List<Cozinha> listar();
    Cozinha buscar(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Cozinha cozinha);
    
}
