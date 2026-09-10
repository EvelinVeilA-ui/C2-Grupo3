package pe.edu.upeu.sysventas.service;

import java.util.List;
import java.util.Optional;

public interface ICrudGenericoService <T,ID> {
    T save(T t);
    T update(T t,ID id);
    List<T> findAll();
    T findByid(ID id);
    void delete(ID id);


}
