package co.edu.uniquindio.poo;
import java.util.LinkedList;


public class Biblioteca {
    private String nombre;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Libro> libros;
    private LinkedList<Estudiante>estudiantes;
    private LinkedList<Prestamo> prestamos;
    
    Biblioteca(String nombre){
        this.nombre=nombre;
        bibliotecarios=new LinkedList<>();
        libros=new LinkedList<>();
        estudiantes=new LinkedList<>();
        prestamos=new LinkedList<>();
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public void agregarBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

}
