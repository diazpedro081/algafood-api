package com.algaworks.algafood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    @Autowired // define o construtor primario
    public AtivacaoClienteService(NotificadorEmail notificador) {
        this.notificador = notificador;
    }

    public AtivacaoClienteService(String qualquer) {
        System.out.println("Qualquer coisa '-'");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro esta ativo!");
    }
}
