

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuntoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuntoTest
{
    /**
     * Default constructor for test class PuntoTest
     */
    public PuntoTest()
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
    public void testGetXY(){
        int x = 1;
        int y = 2;
        Punto punto = new Punto(x,y);
        assertEquals(x,punto.getX());
        assertEquals(y,punto.getY());
    }
    
    @Test
    public void testEquals(){
        int x1 = 1;
        int y1 = 2;
        Punto punto1 = new Punto(x1,y1);
        int x2 = 1;
        int y2 = 2;
        Punto punto2 = new Punto(x2,y2);
        assertTrue(punto1.equals(punto2));
    }
}
