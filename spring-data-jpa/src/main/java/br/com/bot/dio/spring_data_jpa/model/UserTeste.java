package br.com.bot.dio.spring_data_jpa.model;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserTeste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 20, nullable = false, unique = true)
    private String apelido;
    @Column(length = 10, nullable = false)
    private String senha;

}
