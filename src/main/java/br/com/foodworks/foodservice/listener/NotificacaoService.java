package br.com.foodworks.foodservice.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;

import br.com.foodworks.foodservice.di.notificacao.NivelUrgencia;
import br.com.foodworks.foodservice.di.notificacao.Notificador;
import br.com.foodworks.foodservice.di.notificacao.TipoDoNotificador;
import br.com.foodworks.foodservice.di.service.ClienteAtivadoEvent;

public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.ALTA_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo!");
    }        

}
