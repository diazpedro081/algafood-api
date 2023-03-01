package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

//Informa que essa é uma classe responsavel por receber requisições web
@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;
    
    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    //Modelo padrão para requisitar itens
    @GetMapping("/hello") //caminho
    @ResponseBody //Indica que a String deve ser a resposta para requisição
    public String hello(){
        Cliente joao = new Cliente("João Arruda", "joaoarruda@321.com", "4444-4444");
        
        ativacaoClienteService.ativar(joao); 
    
        return "Hello!" + joao;
    }
}
