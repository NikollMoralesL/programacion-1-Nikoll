package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    @Test
    public void DatosNulos(){
        LOG.info("Iniciando prueba datos nulos");

        assertThrows(Throwable.class, ()-> new Contacto(null, null, null, null, null));

        LOG.info("Finalizando prueba datos nulos");
    }

    @Test
    public void DatosVacios(){
        LOG.info("Iniciando prueba datos vacios");

        assertThrows(Throwable.class, ()-> new Contacto("","","","",""));

        LOG.info("finalizando prrueba datos vacios");
    }

    @Test
    public void validarCorreo(){
        LOG.info("Iniciando prueba validar correo");

        assertThrows(Throwable.class, ()-> new Contacto("Carlos", "CarLost", "CD", "1234", "Carlos.luq"));

        LOG.info("finalizando prueba validar correo");

    }
    

        
    
}
