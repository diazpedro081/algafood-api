package br.com.foodworks.foodservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.foodworks.foodservice.di.modelo.Cliente;
import br.com.foodworks.foodservice.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("Joao", "joao@xyz.com", "2345678");

        ativacaoClienteService.ativar(joao);

        return "Hello!";
    }

}
