package br.com.foodworks.foodservice.di.notificacao;

import br.com.foodworks.foodservice.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
    
}
