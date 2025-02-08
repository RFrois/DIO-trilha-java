package com.br.dio.primeiros_passos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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

    }
}
