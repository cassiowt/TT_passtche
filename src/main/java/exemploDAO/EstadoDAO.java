package exemploDAO;

import model.EstadoED;
import model.PaisED;

import java.util.ArrayList;

public class EstadoDAO {

    static GenericDAO dao = new GenericDAO();

    static PaisED BRASIL = new PaisED("Brasil");


    public static void main(String[] args) {

        dao.listAll(getEstados());

        dao.listCount(getEstados());

    }

    private static ArrayList<EstadoED> getEstados() {
        return new ArrayList<EstadoED>() {

            {   add(new EstadoED("Rio Grande do Sul", "RS", BRASIL));
                add(new EstadoED("Santa Catarina", "RS", BRASIL));
                add(new EstadoED("Paraná", "RS", BRASIL));
                add(new EstadoED("São Paulo", "RS", BRASIL));
            }
        };
    }


}
