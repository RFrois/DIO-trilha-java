package br.com.dio.security.JWT.spring_security_jwt.controller;

import br.com.dio.security.JWT.spring_security_jwt.model.Users;
import br.com.dio.security.JWT.spring_security_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public void postUser(@RequestBody Users users){
        service.criarUsuario(users);
    }
}
