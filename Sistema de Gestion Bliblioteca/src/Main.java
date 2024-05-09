import biblioteca.Publicacion;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear dos libros con todos sus atributos
        Publicacion libro1 = new Publicacion();
        libro1.setNombre("Introducción a la Programación");
        libro1.setFechaPublicacion(new Date());
        libro1.setEdicion(1);
        libro1.setCodigo("ABC123");
        libro1.setCantidadEjemplares(10);
        libro1.setTipo("Libro de texto");

        System.out.println("Nombre del libro 1: " + libro1.getNombre());
        System.out.println("Fecha de publicación del libro 1: " + libro1.getFechaPublicacion());
        System.out.println("Edición del libro 1: " + libro1.getEdicion());
        System.out.println("Código del libro 1: " + libro1.getCodigo());
        System.out.println("Cantidad de ejemplares del libro 1: " + libro1.getCantidadEjemplares());
        System.out.println("Tipo del libro 1: " + libro1.getTipo());

        Publicacion libro2 = new Publicacion();
        libro2.setNombre("Cien años de soledad");
        libro2.setFechaPublicacion(new Date());
        libro2.setEdicion(1);
        libro2.setCodigo("DEF456");
        libro2.setCantidadEjemplares(5);
        libro2.setTipo("Novela");

        System.out.println("\nNombre del libro 2: " + libro2.getNombre());
        System.out.println("Fecha de publicación del libro 2: " + libro2.getFechaPublicacion());
        System.out.println("Edición del libro 2: " + libro2.getEdicion());
        System.out.println("Código del libro 2: " + libro2.getCodigo());
        System.out.println("Cantidad de ejemplares del libro 2: " + libro2.getCantidadEjemplares());
        System.out.println("Tipo del libro 2: " + libro2.getTipo());
    }
}
