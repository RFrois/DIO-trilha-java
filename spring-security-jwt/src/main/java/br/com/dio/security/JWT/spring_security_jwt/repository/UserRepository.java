package br.com.dio.security.JWT.spring_security_jwt.repository;

import br.com.dio.security.JWT.spring_security_jwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends JpaRepository<Users, Integer> {
    @Query("SELECT e FROM Users e JOIN FETCH e.roles WHERE e.username = (:username)")
    public Users findByUsername(@Param("username") String username);

    boolean existsByUsername(String username);

}
