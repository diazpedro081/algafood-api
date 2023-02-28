package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component // Aqui informamos que essa classe é um componente do Spring
public class NotificadorEmail {

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atraves do email %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
