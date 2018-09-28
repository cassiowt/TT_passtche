package dao;


import model.PaisED;

import java.util.List;

public class PaisDAO extends GenericDAO<PaisED>{
    @Override
    public long save(PaisED entity) {
        long id;
        return id = super.save(entity);
    }

    @Override
    public void delete(PaisED entity) {
        super.delete(entity);
    }

    @Override
    public void merge(PaisED entity) {
        super.merge(entity);
    }

    @Override
    public Object find(Class classe, long id) {
        return super.find(classe, id);
    }

    public List findAll() {
        return super.findAll(PaisED.class);
    }
}
