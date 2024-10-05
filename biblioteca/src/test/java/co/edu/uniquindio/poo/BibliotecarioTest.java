package co.edu.uniquindio.poo;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;




public class BibliotecarioTest {
    private static final Logger LOG = Logger.getLogger(BibliotecarioTest.class.getName());



@Test
public void datosVacios(){
    LOG.info("Iniciando test datos vacios");
    assertThrows(Throwable.class, ()-> new Bibliotecario("Juan", "12345", "54321","Jm@", 4.000));
    LOG.info("Finalizando test datos vacios");
}

@Test
public void datosNulos(){
    LOG.info("Iniciando datos nulos");
    assertThrows(Throwable.class, ()-> new Bibliotecario("juan", "12345", "54321","Jm@", 4.000));
    LOG.info("Finalizando test datos nulos");
}

@Test
public void DatosIguales(){
    LOG.info("iniciando test datos iguales");
    var bibliotecario = new Bibliotecario("Juan", "12345", "54321","Jm@", 5000);
    assertEquals("Juan", bibliotecario.getNombre());
    assertEquals("12345", bibliotecario.getCedula());
    assertEquals("54321", bibliotecario.getTelefono());
    assertEquals("Jm@", bibliotecario.getCorreo());
    assertEquals(5000, bibliotecario.getSalario());
    LOG.info("finalizando test datos iguales");
}
}
