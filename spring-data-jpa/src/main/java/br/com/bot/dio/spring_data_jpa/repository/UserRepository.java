package br.com.bot.dio.spring_data_jpa.repository;


import br.com.bot.dio.spring_data_jpa.model.UserTeste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserTeste, Integer> {
}
