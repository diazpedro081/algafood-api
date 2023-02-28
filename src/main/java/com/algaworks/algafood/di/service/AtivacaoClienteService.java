package com.algaworks.algafood.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

    public void ativar(Cliente cliente) {
        cliente.ativar();
        NotificadorEmail notificador = new NotificadorEmail();
        notificador.notificar(cliente, "Seu cadastro esta ativo!");
    }
}
