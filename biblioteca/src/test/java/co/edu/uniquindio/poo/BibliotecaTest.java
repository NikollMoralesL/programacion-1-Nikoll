package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    private static final Logger LOG = Logger.getLogger(BibliotecaTest.class.getName());

    
@Test
public void nombreIgual(){
    LOG.info("iniciando test nombre igual");
    var biblioteca = new Biblioteca("Los books");
    assertEquals("Los books", biblioteca.getNombre());
    LOG.info("finalizando test nombre igual");

}
@Test
public void datosVacios(){
    LOG.info("Inicviando test datos vacios");
    assertThrows(Throwable.class, ()-> new Biblioteca(""));
    LOG.info("Finalizando test datos vacios");
}

@Test
public void datosNulos(){
    LOG.info("Iniciando datos nulos");
    assertThrows(Throwable.class, ()-> new Biblioteca(null));
    LOG.info("Finalizando test datos nulos");




}
}
