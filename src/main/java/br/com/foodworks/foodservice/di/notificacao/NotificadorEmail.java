package br.com.foodworks.foodservice.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.foodworks.foodservice.di.modelo.Cliente;

@TipoDoNotificador(value = NivelUrgencia.MEDIA_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties properties;


    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.println("host: " + properties.getHostServidor());
        System.out.println("porta: " + properties.getPortServidor());

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
