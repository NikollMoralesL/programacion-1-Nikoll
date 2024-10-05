package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;


public class PrestamoTest {
        private static final Logger LOG = Logger.getLogger(PrestamoTest.class.getName());
    
    

    @Test
public void ValorPrestamoNegativo(){
    LOG.info("Iniciando test Prestamo negativo");
    assertThrows(Throwable.class, ()-> new Prestamo("nombre", -5000));
    LOG.info("Finalizando test Prestamo negativo");
}

@Test
public void DatosIguales(){
    LOG.info("iniciando test datos iguales");
    var prestamo = new Prestamo("nombre", 5000);
    assertEquals("nombre", prestamo.getNombre());
    assertEquals(5000, prestamo.getValorPrestamo());
    LOG.info("Finalizando test datos iguales");
}


@Test
public void datosNulos(){
    LOG.info("Iniciando datos nulos");
    assertThrows(Throwable.class, ()-> new Prestamo(null,0
));
    LOG.info("Finalizando test datos nulos");
    }
}

