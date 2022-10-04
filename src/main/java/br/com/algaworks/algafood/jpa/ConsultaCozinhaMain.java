package br.com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.algaworks.algafood.AlgafoodApiApplication;
import br.com.algaworks.algafood.domain.model.Cozinha;
import br.com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {

    public void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);

        List<Cozinha> todasCozinhas = cozinhas.todas();

        for (Cozinha cozinha : todasCozinhas) {
            System.out.println(cozinha.getNome());
        }
    }

}
