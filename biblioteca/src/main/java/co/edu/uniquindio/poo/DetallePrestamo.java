package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;

public class DetallePrestamo {
    private String nombreEstudiante;
    private String nombreLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private int cantidadLibros;
    private String bibliotecarioAsignado;
    private LinkedList<Libro>libros;



    DetallePrestamo(String nombreEstudiante, String nombreLibro, LocalDate fechaPrestamo, LocalDate fechaDevolucion, int cantidadLibros, String bibliotecarioAsignado){
        this.nombreEstudiante = nombreEstudiante;
        this.nombreLibro=nombreLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.cantidadLibros=cantidadLibros;
        this.bibliotecarioAsignado=bibliotecarioAsignado;
        libros=new LinkedList<Libro>();
        assert nombreEstudiante != null;
        assert nombreLibro != null;
        assert fechaPrestamo != null;
        assert fechaDevolucion != null;
        assert cantidadLibros < 0;
    }


    public String getNombreEstudiante() {
        return nombreEstudiante;
    }


    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }


    public String getNombreLibro() {
        return nombreLibro;
    }


    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }


    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }


    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }


    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }


    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }


    public int getCantidadLibros() {
        return cantidadLibros;
    }


    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }


    public LinkedList<Libro> getLibros() {
        return libros;
    }


    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }


    public String getBibliotecarioAsignado() {
        return bibliotecarioAsignado;
    }


    public void setBibliotecarioAsignado(String bibliotecarioAsignado) {
        this.bibliotecarioAsignado = bibliotecarioAsignado;
    }
    

}
    


    

