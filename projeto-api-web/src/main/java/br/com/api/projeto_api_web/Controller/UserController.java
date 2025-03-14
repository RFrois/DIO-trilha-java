package br.com.api.projeto_api_web.Controller;

import br.com.api.projeto_api_web.model.Usuario;
import br.com.api.projeto_api_web.reposytory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Usuario> getUser(){
        return repository.finAll();
    }
    @GetMapping("/{username}")
    public Usuario gotOneUser(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping
    public void putUser(@RequestBody Usuario usuario){repository.save(usuario); }

}
