package br.com.algaworks.algafood.domain.repository;

import java.util.List;

import br.com.algaworks.algafood.domain.model.Permissao;

public interface PermissaoRespository {
    
    List<Permissao> listar();
    Permissao buscar(Long id);
    Permissao salvar(Permissao permissao);
    void remover(Permissao permissao);

}
