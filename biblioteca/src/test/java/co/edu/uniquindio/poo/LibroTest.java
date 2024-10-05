package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class LibroTest {
    private static final Logger LOG = Logger.getLogger(LibroTest.class.getName());
    
    @Test
    public void datosNulos(){
        LOG.info("Iniciando datos nulos");
        assertThrows(Throwable.class, ()-> new Libro(null, null, null, null, null, null, 0));
        LOG.info("Finalizando test datos nulos");
        }
        
    
        @Test
    public void DatosIguales(){
        LOG.info("iniciando test nombre igual");
        var libro = new Libro("123", "12345", "L anaconda","Pepe", "Editor iales", "2024-03-03", 7);
        assertEquals("123", libro.getCodigo());
        assertEquals("12345", libro.getIsbn());
        assertEquals("La anaconda", libro.getTitulo());
        assertEquals("Pepe", libro.getAutor());
        assertEquals("Editor iales", libro.getEditorial());
        assertEquals("2024-03-03", libro.getFecha());
        assertEquals(7, libro.getUnidadesDisponibles());
        LOG.info("finalizando test nombre igual");
    
    
    }
    
    @Test
    public void UnidadesNegativas(){
        LOG.info("Iniciando datos nulos");
        assertThrows(Throwable.class, ()-> new Libro("123", "12345", "LA anaconda","Pepe", "Editor iales", "2024-03-03", -1));
        LOG.info("Finalizando test datos nulos");
    }
    
    }
    

