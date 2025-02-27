package br.com.bot.dio.spring_data_jpa;

import br.com.bot.dio.spring_data_jpa.model.UserTeste;
import br.com.bot.dio.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        UserTeste user = new UserTeste();
        user.setNome("Rafael");
        user.setApelido("rfrois1");
        user.setSenha("123mudar");

        repository.save(user);

        for(UserTeste u: repository.findAll()){
            System.out.println(u);
        }
    }
}
