package br.com.foodworks.foodservice.di.notificacao;

import org.springframework.stereotype.Component;

import br.com.foodworks.foodservice.di.modelo.Cliente;

@TipoDoNotificador(value = NivelUrgencia.ALTA_URGENCIA)
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através de SMS, usando o telefone %s: %s \n", 
        cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
