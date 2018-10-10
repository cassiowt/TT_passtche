package mb;

import model.LoginED;
import model.UsuarioED;
import rn.UsuarioRN;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LoginMB {

    private LoginED loginED;
    private UsuarioED usuarioED;
    private UsuarioRN usuarioRN;


    public LoginMB() {
        loginED = new LoginED();
        usuarioED = new UsuarioED();
        usuarioRN = new UsuarioRN();
    }

    public LoginED getLoginED() {
        return loginED;
    }

    public void setLoginED(LoginED loginED) {
        this.loginED = loginED;
    }

    public String valida() {
        System.out.println(loginED);
        UsuarioED usuarioIformado = usuarioRN.findUsuarioByEmaul(loginED.getUsuarioED().getEmail());
        if (usuarioIformado == null) {
            System.out.println("Usuario desconhecido");
            return "erro";
        }
        if (usuarioIformado.getEmail().equals(loginED.getUsuarioED().getEmail())
                && usuarioIformado.getSenha().equals(loginED.getUsuarioED().getSenha())) {

            System.out.println("Ok");
            return "index";
        }
        System.out.println("erro");
        return "erro";
    }
}
