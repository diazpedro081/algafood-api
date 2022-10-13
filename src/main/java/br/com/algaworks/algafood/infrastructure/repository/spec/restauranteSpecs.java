package br.com.algaworks.algafood.infrastructure.repository.spec;

import org.springframework.data.jpa.domain.Specification;

import br.com.algaworks.algafood.domain.model.Restaurante;

public class restauranteSpecs {
    
    public static Specification<Restaurante> comFreteGratis() {
        return new RestauranteComFreteGratisSpec();
    }

    public static Specification<Restaurante> comNomeSemelhante(String nome) {
        return new RestauranteComNomeSemelhanteSpec(nome);
    }
}
