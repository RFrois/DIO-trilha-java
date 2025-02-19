package com.br.dio.primeiros_passos.Singleton_Prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Autowired
    private Mensagens msg;
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println(msg.getObjotoCriado());
        Remetente remetente = new Remetente();
        remetente.setEmail("noreplay@tech.com.br");
        remetente.setNome("Rafael Frois");
        return remetente;
    }

    // na classe de Configeration adicionado o Scope("Prototype"), o padrão é singleton, caso não declare nada, fica no padrão
}
