package controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {

    public static void mensages(String titulo, String conteudo) {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful",  titulo) );
        context.addMessage(null, new FacesMessage("Second Message", conteudo));
    }
}
