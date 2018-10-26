package mb;


import model.TipoLogradouroED;
import model.TipoTelefoneED;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Arrays;
import java.util.EnumSet;

@ManagedBean
@SessionScoped
public class TiposMB {

    private TipoTelefoneED tipoTelefoneED;

    public TiposMB() {

    }

    public EnumSet<TipoTelefoneED> getTipoTelefoneED() {
        return EnumSet.allOf(TipoTelefoneED.class);
    }

    public EnumSet<TipoLogradouroED> getTipoLogradouroED() {
        return EnumSet.allOf(TipoLogradouroED.class);
    }

    public void setTipoTelefoneED(TipoTelefoneED tipoTelefoneED) {
        this.tipoTelefoneED = tipoTelefoneED;
    }
}
