package exemploDAO;

import model.ProdutoED;
import model.TelefoneED;
import model.TipoTelefoneED;

import java.util.ArrayList;

public class ProdutoDAO {

    static GenericDAO dao = new GenericDAO();

    public static void main(String[] args) {
        dao.listAll(getProdutos());

        dao.listCount(getProdutos());
    }

    private static ArrayList<ProdutoED> getProdutos() {
        return new ArrayList<ProdutoED>() {
            {
                add(new ProdutoED("camiseta", "kkk", 30, 1, 100));
                add(new ProdutoED("camiseta", "kkk", 45, 1, 100));
                add(new ProdutoED("camiseta", "kkk", 55, 1, 100));
                add(new ProdutoED("camiseta", "kkk", 25, 1, 100));


            }


        };


    }

}