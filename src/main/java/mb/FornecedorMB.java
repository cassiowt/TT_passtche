package mb;

import rn.FornecedorRN;
import model.FornecedorED;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FornecedorMB {

    private FornecedorED fornecedor;
    private FornecedorRN fornecedorRN;

    public FornecedorMB() {
        fornecedor = new FornecedorED();
    }

    public FornecedorED getFornecedorED() {
        return fornecedor;
    }

    public void setFornecedorED(FornecedorED fornecedorED) {
        this.fornecedor = fornecedorED;
    }

    public FornecedorMB(FornecedorED fornecedorED) {
        this.fornecedor = fornecedorED;
    }

    public String saveFornecedor() {

        System.out.println(fornecedor);
        return null;
    }
}
