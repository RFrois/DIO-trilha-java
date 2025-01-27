package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Menssagem msn = new Menssagem();
        Cliente cli = new Cliente();
        Pessoa pessoa = new Pessoa("Rafael", LocalDateTime.of(1989,01,16,16,10),"33899778804");
        ConexaoBanco banco = new ConexaoBanco();

        banco.iniciarConexao();
        Date data = new Date();
        msn.ola();
        cli.setNome("Rafael");
        //pessoa.setNascimento(data);
        banco.finalizarConexao();



        System.out.println(cli.getNome());
        System.out.println(cli.getNome() + " " + pessoa.getNascimento());

    }

}