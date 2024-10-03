package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;



public class PersonaTest {
    private static final Logger LOG = Logger.getLogger(PersonaTest.class.getName());

@Test
public void datosVacios(){
    LOG.info("Iniciando test datos vacios");
    assertThrows(Throwable.class, ()-> new Estudiante("Nelson", "12345", "54321","Nc@"));
    LOG.info("Finalizando test datos vacios");
}

@Test
public void datosNulos(){
    LOG.info("Iniciando datos nulos");
    assertThrows(Throwable.class, ()-> new Estudiante("Nelson", "12345", "54321","Nc@"));
    LOG.info("Finalizando test datos nulos");
}
@Test
public void DatosIguales(){
    LOG.info("iniciando test nombre igual");
    var estudiante = new Estudiante("Nelson", "12345", "54321","Nc@");
    assertEquals("Nelson", estudiante.getNombre());
    assertEquals("12345", estudiante.getCedula());
    assertEquals("54321", estudiante.getTelefono());
    assertEquals("Nc@", estudiante.getTelefono());
    LOG.info("finalizando test nombre igual");
}
    

