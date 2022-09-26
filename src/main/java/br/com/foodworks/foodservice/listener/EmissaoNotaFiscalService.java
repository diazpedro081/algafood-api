package br.com.foodworks.foodservice.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.foodworks.foodservice.di.notificacao.NivelUrgencia;
import br.com.foodworks.foodservice.di.notificacao.Notificador;
import br.com.foodworks.foodservice.di.notificacao.TipoDoNotificador;
import br.com.foodworks.foodservice.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {

    @TipoDoNotificador(NivelUrgencia.ALTA_URGENCIA)
    @Autowired
    private Notificador notificador;
    
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
    }
        
}
