package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CamionetaTest {
    
    private static final Logger LOG = Logger.getLogger(CamionetaTest.class.getName());

@Test
    public void numeroPuertasNegativo() {
        LOG.info("Iniciado test numeroPuertasNegativo");
        assertThrows(Throwable.class, ()-> new Camioneta("mazda", "2023", true, "gasolina", "manual", -5, 4, true, false, true, 3, false, true));
        LOG.info("Finalizando test numeroPuertasNegativo");
    }
}