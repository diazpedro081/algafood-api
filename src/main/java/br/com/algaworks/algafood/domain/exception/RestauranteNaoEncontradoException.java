package br.com.algaworks.algafood.domain.exception;

public class RestauranteNaoEncontradoException extends EntidadeEmUsoException {

    private static final long serialVersionUID = 1L;

    public RestauranteNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

    public RestauranteNaoEncontradoException(Long restsauranteId) {
        this(String.format("Nào existe cadastro de restaurante com código: %d", restsauranteId));
    }
}
