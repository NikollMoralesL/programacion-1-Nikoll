package co.edu.uniquindio.poo;
import java.util.LinkedList;



public class Prestamo {
    private String nombre;
    private double valorPrestamo;
    private LinkedList<DetallePrestamo> detallePrestamos;

    Prestamo(String nombre, double valorPrestamo) {
        this.nombre = nombre;
        this.valorPrestamo = valorPrestamo;
        detallePrestamos=new LinkedList<>();

   
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
        detallePrestamo.add(detallePrestamo);
    }



    
}