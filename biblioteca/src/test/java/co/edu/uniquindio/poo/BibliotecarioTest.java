package co.edu.uniquindio.poo;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;




public class BibliotecarioTest {
    private static final Logger LOG = Logger.getLogger(BibliotecarioTest.class.getName());

@Test
public void salarioMenor(){
    LOG.info("Iniciando test salario menor");
    assertThrows(Throwable.class, ()-> new Bibliotecario("juan", "1234", "4321", "jalon@", 4000));
    LOG.info("finalizando test salario minimo");


}

}
