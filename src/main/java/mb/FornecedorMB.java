package mb;

import rn.FornecedorRN;
import model.FornecedorED;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FornecedorMB {

    private FornecedorED fornecedorED;
    private FornecedorRN fornecedorRN;

    public FornecedorMB() {
        fornecedorED= new FornecedorED();
    }

    public FornecedorED getFornecedorED() {return fornecedorED;}

    public void setFornecedorED(FornecedorED fornecedorED) {
        this.fornecedorED = fornecedorED;
    }

    public FornecedorMB(FornecedorED fornecedorED) {
        this.fornecedorED = fornecedorED;
    }
  //  public saveFornecedorED
}
