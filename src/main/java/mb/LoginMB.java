package mb;

import model.LoginED;
import model.UsuarioED;
import rn.UsuarioRN;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
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
            montaMessage("Error","Usuario desconhecido");

            return "erro";
        }
        if (usuarioIformado.getEmail().equals(loginED.getUsuarioED().getEmail())
                && usuarioIformado.getSenha().equals(loginED.getUsuarioED().getSenha())) {
            montaMessage("Successfull","Login efetuado com sucesso");

            return "home";
        }
        montaMessage("Error","Erro ao logar");
        return "erro";
    }

    public void montaMessage(String title, String msg) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(title, msg));
}
}
