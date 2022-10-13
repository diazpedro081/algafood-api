package br.com.algaworks.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.algaworks.algafood.infrastructure.repository.CustomJpaReposirotyImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaReposirotyImpl.class)
public class AlgafoodApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgafoodApiApplication.class, args);
    }
}
