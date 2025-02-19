package com.br.dio.primeiros_passos.Singleton_Prototype;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "mensagem")
public class Mensagens {

    private String boasVindas;
    private String objotoCriado;
    private String cadastroAprovado;
}
