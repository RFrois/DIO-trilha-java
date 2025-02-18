package com.br.dio.primeiros_passos;

import com.br.dio.primeiros_passos.Singleton_Prototype.SistemaMensagem;
import com.br.dio.primeiros_passos.TesteBean.ConversonJson;
import com.br.dio.primeiros_passos.TesteBean.ViaCepResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyApp implements CommandLineRunner {


    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado é: " + calculadora.somar(5,6));

        log.info("Executou com sucesso");
        log.info("Recebeu o Json");
    }

    @Bean
    public CommandLineRunner run(ConversonJson converter) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-001\", \"logradouro\": \"Voith\", \"localidade\": \"nossa casa\"}";
            ViaCepResponse response = converter.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }

    @Bean
    public CommandLineRunner run2(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfimacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfimacaoCadastro();
        };
        // o nome run2 um método, com a classe CommandLineRinner se precisar de criar mais de 1 @Bean com ele, tem que ser de nome diferente
    }


}
