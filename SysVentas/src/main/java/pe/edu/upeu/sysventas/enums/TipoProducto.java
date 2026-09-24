package pe.edu.upeu.sysventas.enums;

public enum TipoProducto {
    PRODUCTO("Producto"),
    PREPARADO("Preparado"),
    SERVICIO("Servicio");

    String descripcion;

    TipoProducto(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
