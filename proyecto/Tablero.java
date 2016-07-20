import java.util.ArrayList;
/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero
{
    private int[][] matriz;
    //private ArrayList<Tetrimino> tetriminos;
    
    
    
    public Tablero()
    {
        iniciarTablero();
    }
    
    public void iniciarTablero()
    {
        matriz = new int[19][10];
    }
    
    public int[][] getMatriz()
    {
        return matriz;
    }
    
    public Figura generarFigura()
    {   
        Figura figura;
        return null;
    }
}
