package imp;

import model.PaisED;

import java.util.ArrayList;


public class PaisDAO extends GenericDAO<PaisED>  {

    public int getNumeroPaises(ArrayList<PaisED> paises ){

        return paises.size();
    }

    @Override
    public PaisED find(long id) {



        return null;
    }
}
