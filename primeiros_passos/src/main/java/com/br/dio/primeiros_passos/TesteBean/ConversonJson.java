package com.br.dio.primeiros_passos.TesteBean;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversonJson {

    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json){
       ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}

/*Classe usada para converter Json, usando o @Component para realizar um Bean do projeto e injetar em qualquer parte do projeto
* usando CommandLineRunner ou um Bean
* no curso ele criou uma Classe para declarar o @Bean fazer ua instância do Gson, aqui está funcionando sem, mais tem caso der erro tem que colocar */
