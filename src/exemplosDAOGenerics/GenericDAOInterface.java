package exemplosDAOGenerics;

import java.util.ArrayList;

public interface GenericDAOInterface<T> {

     public void listAll(ArrayList<T> entityes);

     public T findById( long id);

     public void save(T entity);

     public void delete(T entity);

     public void update(T entity);
 }
