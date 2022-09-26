package br.com.foodworks.foodservice.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.foodworks.foodservice.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
    
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal parta cliente " + event.getCliente().getNome());
    }
        
}
