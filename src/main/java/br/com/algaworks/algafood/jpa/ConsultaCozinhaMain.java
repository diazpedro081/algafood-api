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

        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

        List<Cozinha> cozinhas = cozinhaRepository.listar();

        for (Cozinha cozinha : cozinhas) {
            System.out.println(cozinha.getNome());
        }
    }

}
