package co.edu.uniquindio.poo;


public class Trabajador extends Persona {
    private String horario;
    public Trabajador (String nombre, String apellido, String horario, String cedula, String email, String direccion, String telefono) {
        super(nombre, apellido, cedula, email, direccion,telefono);
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Trabajador [nombre=" + nombre + ", horario=" + horario + ", apellido=" + apellido + ", cedula=" + cedula
                + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + "]";
    }


    
}
