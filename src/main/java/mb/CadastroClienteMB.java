package mb;

import model.ClienteED;
import model.LoginED;
import model.UsuarioED;
import rn.UsuarioRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CadastroClienteMB {

    private ClienteED clienteED;


    public CadastroClienteMB() {
        clienteED = new ClienteED();

    }



}
