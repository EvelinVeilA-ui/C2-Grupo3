package pe.edu.upeu.sysventas.controller;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sysventas.service.ICategoriaSerrvice;
import pe.edu.upeu.sysventas.service.IMarcaService;
import pe.edu.upeu.sysventas.service.IProductoService;
import pe.edu.upeu.sysventas.service.IUnidMedidaService;

@RequiredArgsConstructor
public class ProductoController {

    private final IMarcaService ms;
    private final ICategoriaSerrvice cs;
    private final IProductoService ps;
    private final IUnidMedidaService us;


}
