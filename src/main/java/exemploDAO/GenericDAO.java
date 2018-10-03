package exemploDAO;



import java.util.ArrayList;

public class GenericDAO implements GenericDAOInterface {



    @Override
    public void listAll(ArrayList entityes) {

        entityes.forEach(item -> System.out.println(item));

    }

    public void listCount(ArrayList entityes) {
        System.out.println( "O numero de estados é "+ entityes.size());

    }

    @Override
    public Object findById(long id) {


        return null;
    }


    public Object findByName(String texto) {


        return null;
    }

    @Override
    public void save(Object entity) {
        System.out.println("Salvo");
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }
}