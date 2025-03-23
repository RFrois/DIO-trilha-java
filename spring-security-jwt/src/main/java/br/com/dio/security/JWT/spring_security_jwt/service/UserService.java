package br.com.dio.security.JWT.spring_security_jwt.service;

import br.com.dio.security.JWT.spring_security_jwt.model.Users;
import br.com.dio.security.JWT.spring_security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

     public void criarUsuario(Users user){
         String pass = user.getPassword();
         //criptografando antes de salvar no banco
         user.setPassword(encoder.encode(pass));
         repository.save(user);
     }

}
