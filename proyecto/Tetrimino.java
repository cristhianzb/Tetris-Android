
/**
 * Write a description of class Tetriminos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  abstract class Tetrimino
{
    private Punto[] cuerpo;
    
    
    
    public abstract void rotar();
    public abstract void movIzq();
    public abstract void movDer();
    public abstract void movAba();
}
