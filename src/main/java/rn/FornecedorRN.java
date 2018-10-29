package rn;

import dao.FornecedorDAO;
import model.FornecedorED;

import java.util.ArrayList;
import java.util.List;

public class FornecedorRN {

    private FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public long createFornecedor(FornecedorED Fornecedor) {
        long id = 0;
        try {
            if (Fornecedor.getNome().length() > 5)
                id = fornecedorDAO.save(Fornecedor);
            else throw new Exception("Fornecedor invalido");
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return id;
    }

    public void alterFornecedor(FornecedorED fornecedor) {
        try {
            fornecedorDAO.update(fornecedor);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void deleteFornecedor(FornecedorED Fornecedor) {
        try {
            fornecedorDAO.delete(Fornecedor);
        } catch (Exception e) {

            e.getMessage();
        }
    }

    public FornecedorED findFornecedor(long id) {
        FornecedorED Fornecedor = new FornecedorED();
        try {
            Fornecedor = (FornecedorED) fornecedorDAO.find(FornecedorED.class, id);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return Fornecedor;
    }

    public List<FornecedorED> findAllFornecedor() {
        List<FornecedorED> Fornecedores = new ArrayList<FornecedorED>();
        try {
            Fornecedores = fornecedorDAO.findAll(FornecedorED.class);
        } catch (Exception e) {

            e.getMessage();
            e.printStackTrace();
        }
        return Fornecedores;
    }
}
