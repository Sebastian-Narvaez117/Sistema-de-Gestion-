package biblioteca;


import java.util.Date;

public class Biblioteca {
    private String nombre;
    private String seccion;
    private Date horarioAtencion;

    // Constructor, getters y setters

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", seccion='" + seccion + '\'' +
                ", horarioAtencion=" + horarioAtencion +'}';}
}
