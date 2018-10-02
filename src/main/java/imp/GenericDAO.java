package imp;

import java.util.ArrayList;



public abstract class GenericDAO<T> implements GenericImpDAO<T> {
    @Override
    public T find(long id) {
       String s = new String("Retorna um Objeto");
        return (T) s.toString();
    }

    @Override
    public void listAll(ArrayList<T> entityes) {
         entityes.forEach(item->System.out.println(item));

    }

    @Override
    public long save(Object entity) {
        return 1;
    }
}
