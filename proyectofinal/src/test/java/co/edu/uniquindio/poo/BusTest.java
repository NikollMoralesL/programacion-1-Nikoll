package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BusTest {
    
    private static final Logger LOG = Logger.getLogger(BusTest.class.getName());

@Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");
        assertThrows(Throwable.class, ()-> new Bus(null, null, true, null, null, 0, 0, false, false, 0, false, 0, 0));
        LOG.info("Finalizando test datosVacios");
    }


    @Test
    public void numeroPuertasNegativo() {
        LOG.info("Iniciado test numeroPuertasNegativ");
        assertThrows(Throwable.class, ()-> new Bus(null, null, true, null, null, 0, -4, false, false, 0, false, 0, 0));
        LOG.info("Finalizando test numeroPuertasNegativ");
    }



}



