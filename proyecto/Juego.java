
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    private Tablero tablero;
    private int puntaje;
    private int nivel;
    private long dtiempo;
    
    public Juego()
    {
        tablero = new Tablero();
        puntaje = 0;
        nivel = 1;
        dtiempo = 500;
    }
    
    public int[][] getMatriz()
    {
        return tablero.getMatriz();
    }
    
    /** 
     * Modifica el archivo Ganadores con el nombre dado 
     * @param nombre nombre dado por el usuario
    */
    public void escribirNombre(String nombre)
    {
    
    } 
    
    public int getPuntaje()
    {
        return puntaje;
    }
    
    public int getNivel()
    {
        return nivel;
    }
    
    public void subirNivel()
    {
        nivel++;
    }
    
    public String getListaGanadores()
    {
        return "";
    }
}
