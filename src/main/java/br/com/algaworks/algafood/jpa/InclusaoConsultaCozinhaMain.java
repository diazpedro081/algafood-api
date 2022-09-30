package br.com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.algaworks.algafood.AlgafoodApiApplication;
import br.com.algaworks.algafood.domain.model.Cozinha;

public class InclusaoConsultaCozinhaMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Brasileira");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setNome("Japonesa");

        cozinha1 = cadastroCozinha.adicionar(cozinha1);
        cozinha2 = cadastroCozinha.adicionar(cozinha2);

        System.out.printf("%d - %s \n",cozinha1.getId(), cozinha1.getNome());

        System.out.printf("%d - %s ",cozinha2.getId(), cozinha2.getNome());
    }

}
