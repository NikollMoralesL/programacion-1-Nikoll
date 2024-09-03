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

    //elimiar contactos
    public void eliminarContacto(String nombre){
        for (Contacto contacto: asistentes){
            if(contacto.getNombre().equals(nombre)){
                asistentes.remove(contacto);
                break;
            }
        }
}
  
    //actulizar contactos
    public void actualizarContacto(String nombre, String alias, String direccion){
        for (Contacto contacto: asistentes){    
            if (contacto.getNombre().equals(nombre)){
                contacto.setAlias(alias);
                contacto.setDireccion(direccion);
                break;

            }
    
        }
    }
    

        //agregar contacos no repetidos
        public void agregarContacto(Contacto contacto){
            if (validarNombreTelefono(contacto.getNombre(),contacto.getTelefono())){
                mostrarMensaje("Error, el nombre"+contacto.getNombre()+ "y" +contacto.getTelefono()+ "ya esta creado");
            }else{
                asistentes.add(contacto);
            }
        }


        private void mostrarMensaje(String string) {
            throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
        }


    //validar si contactos existen
    public boolean validarNombreTelefono(String nombre, String telefono){
        for(Contacto contacto:asistentes){
            if(contacto.getNombre().equals(nombre)&& contacto.getTelefono().equals(telefono)){
                return true;
            }
        }
        return false;
}

}
