package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    Estudiante(String nombre, String cedula, String telefono,String correo){
        super(nombre,cedula,telefono,correo);
        assert nombre != null && !nombre.isBlank();
        assert cedula != null && !cedula.isBlank();
        assert telefono != null && !telefono.isBlank();
        assert correo.contains("@");
    }
    
}
