package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Grupo {
    private String nombre; 
    private Categoria categoria;
    private LinkedList<Contacto> contactos;

    public Grupo(String nombre){
        this.nombre = nombre;
        contactos = new LinkedList<>();

    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombnre() {
        return nombre;
    }

    public void setNombnre(String nombnre) {
        this.nombre = nombnre;
    }

  
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    //agregar contacos no repetidos
    public void agregarContacto(Contacto contacto){
        if (validarNombreTelefono(contacto.getNombre(),contacto.getTelefono())){
            mostrarMensaje("Error, el nombre"+contacto.getNombre()+ "y" +contacto.getTelefono()+ "ya esta creado");
        }else{
            contactos.add(contacto);
        }
    }

    //validar si contactos existen
    public boolean validarNombreTelefono(String nombre, String telefono){
            for(Contacto contacto:contactos){
                if(contacto.getNombre().equals(nombre)&& contacto.getTelefono().equals(telefono)){
                    return true;
                }
            }
            return false;
    }


//elimiar contactos
    public void eliminarContacto(String nombre){
        for (Contacto contacto: contactos){
            if(contacto.getNombre().equals(nombre)){
                contactos.remove(contacto);
                break;
                }
            }
    }
    
    //actulizar contactos
     public void actualizarContacto(String nombre, String alias, String direccion){
        for (Contacto contacto: contactos){    
            if (contacto.getNombre().equals(nombre)){
                contacto.setAlias(alias);
                contacto.setDireccion(direccion);
                break;

            }
    
        }
    }
}