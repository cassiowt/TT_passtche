package exemploDAO;

import model.CidadeED;
import model.EstadoED;
import model.PaisED;

import java.util.ArrayList;

public class CidadeDAO {

    static GenericDAO dao = new GenericDAO();
    static PaisED BRASIL = new PaisED("Brasil");
    static EstadoED RS = new EstadoED("Rio Grande do Sul", "RS", BRASIL);

    public static void main(String[] args) {

        dao.listAll(getCidades());

        dao.listCount(getCidades());

    }

    private static ArrayList<CidadeED> getCidades(){
        return new ArrayList<CidadeED>() {
            {
                add(new CidadeED("Porto Alegre", RS));
                add(new CidadeED("Canoas", RS));
                add(new CidadeED("Esteio", RS));
                add(new CidadeED("São Leopoldo", RS));
            }
        };
    }




}
