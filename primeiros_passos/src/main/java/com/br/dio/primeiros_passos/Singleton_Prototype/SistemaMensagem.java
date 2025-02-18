package com.br.dio.primeiros_passos.Singleton_Prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SistemaMensagem {
@Autowired
    private Remetente noreplay;
@Autowired
    private Remetente techTeam;
@Value("${mensagemBoasVindas}")
private String mensagem;

    public void enviarConfimacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi aprovado");
        log.info("Cadastro aprovado");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@tech.com.br");
        System.out.println(techTeam);
        System.out.println(mensagem);
        log.info("mensagem enviada");
    }

    // Foi criado 2 instâncias da classe Remetente,
    // Criado um variável no Application.properties para validar o conhecimento ddp properties value sendo declarado no @Velue 
}
