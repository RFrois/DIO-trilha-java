package br.com.api.projeto_api_web.model;

import lombok.Data;

@Data
public class Usuario {

    private Integer id;
    private String login;
    private String password;

    public Usuario() {
    }

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
