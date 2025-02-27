package br.com.api.projeto_api_web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenvindoController {

    @GetMapping
    public String bemVindo(){
        return "Bem vindo ao Spring boot API";
    }
}
