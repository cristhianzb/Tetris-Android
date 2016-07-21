package crj.zhz.android.tetris;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

public class VistaJuego extends View{

	private Drawable[][] cuadricula;
	private int cantFilas;
	private int cantColumnas;
	
	public VistaJuego(Context context, AttributeSet attrs) {
        super(context, attrs);
        cantFilas = 15;
        cantColumnas = 10;
        cuadricula = new Drawable[cantFilas][cantColumnas];
	}
	
    @Override 
    protected void onSizeChanged(int ancho, int alto, int ancho_anter, int alto_anter) {
    	super.onSizeChanged(ancho, alto, ancho_anter, alto_anter);//se conoce el alto y el ancho
    	int anchoCuadrado = ancho / cantColumnas;
    	int altoCuadrado = alto / cantFilas;
    	for(int i = 0; i < cuadricula.length; i++){
        	for(int j = 0; j < cuadricula[0].length; j++){
            	cuadricula[i][j] = new ShapeDrawable(new RectShape());;
            }
        	
        }
    	
    	((ShapeDrawable) cuadricula[5][5]).getPaint().setColor(0xff0000ff);
    	cuadricula[5][5].setBounds(5, 5, 5+anchoCuadrado, 5+altoCuadrado);
    	
    	/*for(int y = 0; y<= alto-altoCuadrado; y = y + altoCuadrado){
    		for(int x = 0; x<= ancho-anchoCuadrado; x = x + anchoCuadrado){
    			cuadrado.getPaint().setColor(0xff0000ff);
    			cuadrado.setBounds(x, y, x+anchoCuadrado, y+altoCuadrado);
        	}
    	}*/
    }
    	
    @Override 
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(int i = 0; i < cuadricula.length; i++){
        	for(int j = 0; j < cuadricula[0].length; j++){
            	cuadricula[i][j].draw(canvas);
            }
        	
        }
    }
}
