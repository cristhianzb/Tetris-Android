
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
    private Punto[] cuerpo;
    private int ancho, alto;
    private Figura siguiente;
    private int[] piso; 
    
    public Figura(Punto[] puntos)
    {
        cuerpo = puntos;
        calcularAncho();
        calcularAlto();
        //calcularPiso();
    }
    
    private void calcularAncho()
    {
        int a = 0;
        for(int i = 0; i < cuerpo.length; i++){
            if(cuerpo[i].getX() > a){
                a = cuerpo[i].getX();
            }
        }
        ancho = a + 1;
    }
    
    private void calcularAlto()
    {
        int a = 0;
        for(int i = 0; i < cuerpo.length; i++){
            if(cuerpo[i].getY() > a){
                a = cuerpo[i].getY();
            }
        }
        alto = a + 1;
    }
    
    public int getAncho()
    {
        return ancho;
    }
    
    public int getAlto()
    {
        return alto;
    }
    
    public Punto[] getCuerpo()
    {
        return cuerpo;
    }
    
    public boolean equals(Figura otra)
    {
        boolean resp = true;
        int i = 0;
        while(resp && i < cuerpo.length){
            resp = resp && cuerpo[i].equals(otra.cuerpo[i]);
        }
        return resp;
    }
    
    public Figura rotar()
    {
        Punto[] puntos = new Punto[4];
        for(int i = 0; i < cuerpo.length; i++){
            puntos[i] = rotar(cuerpo[i]);
        }
        return new Figura(puntos);
    } 
    
    private Punto rotar(Punto punto)
    {    
        return null;        
    }
}
