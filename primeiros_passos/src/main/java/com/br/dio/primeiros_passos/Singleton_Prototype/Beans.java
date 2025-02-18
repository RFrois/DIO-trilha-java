package com.br.dio.primeiros_passos.Singleton_Prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um OBJETO remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreplay@tech.com.br");
        remetente.setNome("Rafael Frois");
        return remetente;
    }
}
