package exemplo.exemploDAO;

import model.TelefoneED;
import model.TipoTelefoneED;

import java.util.ArrayList;

public class TelefoneDAO {

    static GenericDAO dao = new GenericDAO();

    public static void main( String[] args) {
        dao.listAll(getTelefones());

        dao.listCount(getTelefones());

    }

    private static ArrayList<TelefoneED> getTelefones(){
        return new ArrayList<TelefoneED>(){
            {
                add(new TelefoneED("92345678", "051", TipoTelefoneED.CELULAR));
                add(new TelefoneED("98203819", "051", TipoTelefoneED.CELULAR));
                add(new TelefoneED("94492919", "051", TipoTelefoneED.CELULAR));
                add(new TelefoneED("38694899", "051", TipoTelefoneED.FIXO));


            }


        };


    }



}
