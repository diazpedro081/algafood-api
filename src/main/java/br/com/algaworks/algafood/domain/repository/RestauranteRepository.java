package br.com.algaworks.algafood.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.algaworks.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository
        extends JpaRepository<Restaurante, Long>,
             RestauranteRepositoryQueries, 
             JpaSpecificationExecutor<Restaurante> {

    List<Restaurante> queryByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);

    List<Restaurante> consultarPorNome(String nome, @Param("id") Long cozinha);

    Optional<Restaurante> findTop2ByNomeContaining(String nome);

    int countByCozinhaId(Long cozinha);

}
