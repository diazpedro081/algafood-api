package br.com.foodworks.foodservice.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
    /**
     * Host do servidor de e-mail
     */
    private String hostServidor;
    
    /*
     * Porta do Servidor de E-mail
     */
    private Integer portServidor = 25;

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer getPortServidor() {
        return portServidor;
    }

    public void setPortServidor(Integer portServidor) {
        this.portServidor = portServidor;
    }

}
