package mb;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.text.SimpleDateFormat;
import java.util.Date;

@ManagedBean
@SessionScoped
public class UtilMB {

    private Date dataSistema;
    private String versaoSistema;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public UtilMB() {
        dataSistema  = new Date();
        versaoSistema = "0.0.1-Beta";
    }

    public String getDataSistema() {
        return simpleDateFormat.format(dataSistema);
    }

    public void setDataSistema(Date dataSistema) {
        this.dataSistema = dataSistema;
    }

    public String getVersaoSistema() {
        return versaoSistema;
    }

    public void setVersaoSistema(String versaoSistema) {
        this.versaoSistema = versaoSistema;
    }
}
