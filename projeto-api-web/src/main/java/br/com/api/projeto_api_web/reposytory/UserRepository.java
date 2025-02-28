package br.com.api.projeto_api_web.reposytory;

import br.com.api.projeto_api_web.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - recebendo o id: %d para escluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> finAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuario = new ArrayList<>();
        usuario.add(new Usuario("rafael", "123mudar"));
        usuario.add(new Usuario("gabriel", "123mudar"));
        usuario.add(new Usuario("isaac", "123mudar"));
        return usuario;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebe o id: %d para localizar um usuário", id));
        return new Usuario("rafael", "123mudar");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebe o username: %s para localizar um usuário", username));
        return new Usuario(username, "123mudar");
    }
}
