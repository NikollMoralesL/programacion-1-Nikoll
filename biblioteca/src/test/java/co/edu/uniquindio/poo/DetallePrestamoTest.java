package co.edu.uniquindio.poo;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DetallePrestamoTest {
    private static final Logger LOG = Logger.getLogger(DetallePrestamo.class.getName());
    

    @Test
public void datosNulos(){
    LOG.info("Iniciando datos nulos");
    assertThrows(Throwable.class, ()-> new DetallePrestamo(null, null, null, null, null,));
    LOG.info("Finalizando test datos nulos");
    }

    @Test
public void DatosIguales(){
    LOG.info("iniciando test datos iguales");
    var detallePrestamo = new DetallePrestamo("Manolo", "El principito", LocalDate(2024-03-03), LocalDate(2024-03-04), 7);
    assertEquals("Manolo", detallePrestamo.getNombreEstudiante());
    assertEquals("El principito", detallePrestamo.getNombreLibro());
    assertEquals(LocalDate(2024-03-03), detallePrestamo.getFechaPrestamo());
    assertEquals(LocalDate(2024-03-04), detallePrestamo.getFechDevolucion());
    assertEquals(7, detallePrestamo.getCantidadLibros());
    LOG.info("Finalizando test datos iguales");
}

}
