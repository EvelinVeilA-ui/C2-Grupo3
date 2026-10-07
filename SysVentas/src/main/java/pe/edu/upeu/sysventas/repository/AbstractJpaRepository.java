package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.repository.helper.SqlHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractJpaRepository<T,ID> extends SqlHelper<T> implements ICrudGenericoRepository<T,ID>{


}