package com.algaworks.algafood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MeuPrimeiroController {
    
    //Modelo padrão para requisitar itens
    @GetMapping("/hello")
    @ResponseBody //Indica que a String deve ser a resposta para requisição
    public String hello(){
        return "Hello!";
    }
}
