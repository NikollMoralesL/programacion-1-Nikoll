package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String direccion;
    LinkedList<Transaccion> transacciones;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getDireccion() {
        return direccion;
    }




    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }




    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }




    public void comprarVehiculo(Vehiculo vehiculo) {
        System.out.println("Cliente " + nombre + " ha comprado el vehículo: " + vehiculo.getMarca());
    }

    public void alquilarVehiculo(Vehiculo vehiculo) {
        System.out.println("Cliente " + nombre + " ha alquilado el vehículo: " + vehiculo.getMarca());
    }
}