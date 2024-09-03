package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       
        Grupo grupo = new Grupo("a");
        

        Contacto contacto = new Contacto("Maria", "Mari", "cra 3", "312 876 0987", "mari.a@gmail.com");
        Contacto contacto2 = new Contacto("Alexander", "alex", "cra 4", "315 876 2345", "alex@gmail.com");
        Contacto contacto3 = new Contacto("Andrea", "Andre", "cra 7", "313 200 5643", "andre.a@gmail.com");
        Contacto contacto4 = new Contacto("Anyelo", "Anye", "cra 9", "315 453 1687", "anyo@gmail.com");
        Contacto contacto5 = new Contacto("Natalia", "Nata", "cra 19", "321 947 7621", "nat.a@gmail.com");
    
       

        grupo.agregarContacto(contacto);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);

        Grupo.mostrarMensaje(grupo.toString());
       

        //verificar contactos duplicados
        String nombre="Maria";
        String telefono="312 876 0987";
        boolean contactoExiste=grupo.validarNombreTelefono("Maria","312 876 0987");
        if(contactoExiste){
            Grupo.mostrarMensaje ("el contacto con el nombre" + nombre +" y numero de telefono "+telefono+ "existe");
        }else{
            Grupo.mostrarMensaje ("el contacto con el nombre" + nombre +" y numero de telefono "+telefono+ " no existe");
        }
      
         //Eliminar contacto
         String nombre1= "Maria";
         grupo.eliminarContacto(nombre1);
         Grupo.mostrarMensaje("El contacto con el "+nombre+" y  fue removido");
         Grupo.mostrarMensaje(grupo.toString());

        //Actualizar estudiante
         String nombre2= "alexander";
         grupo.actualizarContacto("g@mail.com", "1234455", nombre2);
         Grupo.mostrarMensaje("El estudiante "+nombre2+ " ha sido actualizado");

          //grupo actualizado
          Grupo.mostrarMensaje("El grupo ha sido actualizado: \n");
          Grupo.mostrarMensaje(grupo.toString());

    }
    
}
