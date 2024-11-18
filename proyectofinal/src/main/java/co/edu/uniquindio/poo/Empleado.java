package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Empleado extends Persona {
    private String usuario;
    private String contraseña;
    LinkedList<Transaccion> transacciones;




    public Empleado(String nombre, String apellido, String dni, String email, String telefono, String usuario,
            String contraseña) {
        super(nombre, apellido, dni, email, telefono);
        this.usuario = usuario;
        this.contraseña = contraseña;
        assert email.contains("@");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        // Registrar vehículo (esto es solo un ejemplo, realmente puedes extenderlo más)
        System.out.println("Vehículo registrado por " + nombre);
    }

    public void realizarVenta(Vehiculo vehiculo) {
        System.out.println("Venta realizada por " + nombre + " para el vehículo: " + vehiculo.getMarca());
    }

    public void realizarAlquiler(Vehiculo vehiculo) {
        System.out.println("Alquiler realizado por " + nombre + " para el vehículo: " + vehiculo.getMarca());
    }
}
