package imp;

import java.util.ArrayList;
import java.util.List;

public interface GenericImpDAO<T> {

    public T find(long id);

    public void listAll(ArrayList<T> entityes);

    public long save(T entity);


}
