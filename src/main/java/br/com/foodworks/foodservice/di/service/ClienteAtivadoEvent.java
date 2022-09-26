package br.com.foodworks.foodservice.di.service;

import br.com.foodworks.foodservice.di.modelo.Cliente;

public class ClienteAtivadoEvent {
    
    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
