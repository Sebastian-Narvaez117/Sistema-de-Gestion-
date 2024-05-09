package biblioteca;

import java.util.Date;


public class Publicacion {
    private String nombre;
    private Date fechaPublicacion;
    private int edicion;
    private String codigo;
    private int cantidadEjemplares;
    private String tipo;

    // Constructor, getters y setters

    @Override
    public String toString() {
        return "Publicación{" +
                "nombre='" + nombre + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", edicion=" + edicion +
                ", codigo='" + codigo + '\'' +
                ", cantidadEjemplares=" + cantidadEjemplares +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
}
}
