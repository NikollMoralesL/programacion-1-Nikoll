package co.edu.uniquindio.poo;


public class Prestamo {
    private String nombre;
    private double valorPrestamo;

    public Prestamo(String nombre, double valorPrestamo) {
        this.nombre = nombre;
        this.valorPrestamo = valorPrestamo;
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

    

}