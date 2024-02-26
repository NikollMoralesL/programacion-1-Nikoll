/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");

        Mascota mascota = new Mascota("viskui","mapache", "boreal", 10, "masculino", "cafe gris negro", 5.0);

        assertEquals("viskui" , mascota.nombre());
        assertEquals("mapache", mascota.especie());
        assertEquals("boreal", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("masculino", mascota.genero());
        assertEquals("cafe gris negro", mascota.color());
        assertEquals(5.0, mascota.peso());

        LOG.info("Finalizando test datos completos");
    }
}
