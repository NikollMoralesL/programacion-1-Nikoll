package co.edu.uniquindio.poo;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private LinkedList<Contacto> asistentes;
    



    public Reunion(String descripcion, LocalDate fecha, LocalTime hora, Categoria categoria){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        asistentes = new LinkedList<>();
        
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public LocalTime getHora() {
        return hora;
    }


    public void setHora(LocalTime hora) {
        this.hora = hora;
    }


    public LinkedList<Contacto> getAsistentes() {
        return asistentes;
    }


    public void setAsistentes(LinkedList<Contacto> asistentes) {
        this.asistentes = asistentes;
    }


  
    

}
