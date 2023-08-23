package hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Usuario;
import hello.services.UsuariosService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }

    @GetMapping("/")
    public List<Usuario> getUsuarios(){
        return usuariosService.getUsuarios();
    }

    @GetMapping("/{codigo}")
    public Usuario getUsuarioPorCodigo(@PathVariable int codigo){
        return this.usuariosService.getUsuarioPorCodigo(codigo);
    }

    @PostMapping(path="", consumes = "application/json", produces = "application/json")
    public Integer inserirUsuario(@RequestBody Usuario usuario){
        this.usuariosService.inserirUsuario(usuario);
        return usuario.getCodigo();
    }
}
