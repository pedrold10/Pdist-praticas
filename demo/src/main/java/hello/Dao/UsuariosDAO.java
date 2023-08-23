package hello.Dao;

import java.util.ArrayList;
import java.util.List;

import hello.model.Usuario;

public class UsuariosDAO {
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public UsuariosDAO(){
        this.usuarios.add(new Usuario(1, "Ana", 20));
        this.usuarios.add(new Usuario(2, "Carlos", 30));
        this.usuarios.add(new Usuario(3, "Pedro", 22));
    }
    
    public void inserirUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
}
