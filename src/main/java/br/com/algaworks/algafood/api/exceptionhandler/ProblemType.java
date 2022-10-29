package br.com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido"),

    MENSAGEM_INCOMPREENSIVEL("/mensagem-incopreensivel", "Mensagem inconpreensivel"),
    
    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrada", 
    "Recurso não encontrada"),

    ENTIDADE_EM_USO("/entidade-em-uso", 
    "Entidade em uso"),

    ERRO_DE_SISTEMA("/erro-se-sistema", "Erro de sistema"),

    ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio");


    private String title;
    private String uri;

    ProblemType(String path, String title) {
        this.uri = "https://algafood.com.br" + path;
        this.title = title;
    }

}
