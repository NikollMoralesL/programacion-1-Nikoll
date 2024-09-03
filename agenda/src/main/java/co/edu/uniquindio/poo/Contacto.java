package co.edu.uniquindio.poo;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String alias, String direccion, String telefono, String correo){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        assert nombre != null && !nombre.isBlank();
        assert alias != null && !alias.isBlank();
        assert direccion != null && !direccion.isBlank();
        assert telefono != null && !telefono.isBlank();
        assert correo != null && !correo.isBlank();   
        assert correo.contains("@");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }


    
}
