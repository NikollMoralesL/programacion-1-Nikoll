package co.edu.uniquindio.poo;

public class Administrador extends Empleado {

    public Administrador(String nombre, String apellido, String dni, String email, String telefono, String usuario, String contraseña) {
        super(nombre, apellido, dni, email, telefono, usuario, contraseña);
    }

    public void generarReporte() {
        // Aquí iría la lógica para generar un reporte
        System.out.println("Generando reporte de negocios...");
    }
}