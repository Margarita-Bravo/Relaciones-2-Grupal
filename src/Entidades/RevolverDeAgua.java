package Entidades;

/**
 *
 * @author Margarita_Bravo
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua : " + "posicionActual=" + posicionActual + "\n, posicionAgua=" + posicionAgua  + '}';
    }
    
    public void llenarRevolver(){
        
        posicionActual=  (int) (Math.random() * 6);
        posicionAgua= (int) (Math.random() * 6);
       
    }
    
    public boolean mojar(){
        boolean mojado = false;
        if (posicionActual==posicionAgua) {
            mojado=true;
        }
        return mojado;
        
    }
    
    public int siguienteChorro(){
        
        if (posicionActual==6) {
            posicionActual=1;
        }else{
             posicionActual=posicionActual+1;
        }
        return posicionActual;
        
    }
    
   
}