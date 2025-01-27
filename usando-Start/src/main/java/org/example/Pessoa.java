package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa {

    String nome;
    LocalDateTime nascimento;

    String cpf;

    public Pessoa(String nome, LocalDateTime nascimento, String cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int calcularIdade(LocalDateTime nascimento){
        int idade = (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
        return idade;
    }

    public boolean meiorDeIdade(){
        return calcularIdade(nascimento) >= 18;
    }


}
