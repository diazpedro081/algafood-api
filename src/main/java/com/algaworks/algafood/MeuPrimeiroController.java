package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Informa que essa é uma classe responsavel por receber requisições web
@Controller
public class MeuPrimeiroController {
    
    //Modelo padrão para requisitar itens
    @GetMapping("/hello") //caminho
    @ResponseBody //Indica que a String deve ser a resposta para requisição
    public String hello(){
        return "Hello!";
    }
}
