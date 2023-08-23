package hello.services;

import java.util.List;

import org.springframework.stereotype.Service;

import hello.Dao.UsuariosDAO;
import hello.model.Usuario;

@Service
public class UsuariosService {
    private UsuariosDAO usuariosDAO = new UsuariosDAO();

    public List<Usuario> getUsuarios(){
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo){
        return usuariosDAO.getUsuarios().get(codigo);
    }

    public void inserirUsuario(Usuario usuario){
        this.usuariosDAO.inserirUsuario(usuario);
    }
}
