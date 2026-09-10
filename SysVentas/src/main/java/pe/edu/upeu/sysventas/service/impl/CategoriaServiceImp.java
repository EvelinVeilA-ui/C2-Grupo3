package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.repository.CategoriaRepository;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICategoriaSerrvice;
import pe.edu.upeu.sysventas.service.ICrudGenericoService;

import java.util.List;

public class CategoriaServiceImp extends CrudGenericoServiceImp<Categoria,Long> implements ICategoriaSerrvice {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImp(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected ICrudGenericoRepository<Categoria, Long> getRepo() {
        return categoriaRepository;
    }
}
