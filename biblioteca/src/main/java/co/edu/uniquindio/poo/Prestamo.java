package co.edu.uniquindio.poo;
import java.util.LinkedList;



public class Prestamo {
    private String nombre;
    private double valorPrestamo;
    private LinkedList<DetallePrestamo> detallePrestamos;
    private LinkedList<Libro>libros;

    Prestamo(String nombre, double valorPrestamo) {
        this.nombre = nombre;
        this.valorPrestamo = valorPrestamo;
        detallePrestamos=new LinkedList<>();
        libros=new LinkedList<Libro>();
        assert nombre != null;
        assert valorPrestamo < 0;

   
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getValorPrestamo() {
        return valorPrestamo;
    }


    public void setValorPrestamo(double valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public LinkedList<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }


    public void setDetallePrestamos(LinkedList<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    
    public void agregarDetallePrestamo(DetallePrestamo detallePrestamo){
        detallePrestamos.add(detallePrestamo);
    }


public LinkedList<Libro> getLibros() {
    return libros;
}


public void setLibros(LinkedList<Libro> libros) {
    this.libros = libros;
}
    
}