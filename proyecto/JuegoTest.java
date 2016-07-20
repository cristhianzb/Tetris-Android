

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JuegoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JuegoTest
{
    /**
     * Default constructor for test class JuegoTest
     */
    public JuegoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetPuntaje()
    {
        Juego juego = new Juego();
        assertEquals(0,juego.getPuntaje());
    }
    
    @Test
    public void testGetMatriz()
    {
        Juego juego = new Juego();
        assertArrayEquals(new int[19][10],juego.getMatriz());
    }
    
    @Test
    public void testAumentarPuntaje()
    {
        Tablero tablero = new Tablero();
    }
    
    @Test
    public void testGetNivel()
    {
        Juego juego = new Juego();
        assertEquals(1,juego.getNivel());
    }
    
    @Test
    public void testModificarListaGanadores()
    {
        String nombre = "Eduardo";
        Juego juego = new Juego();
        juego.escribirNombre(nombre);
        assertEquals(nombre, juego.getListaGanadores());
    }
}
