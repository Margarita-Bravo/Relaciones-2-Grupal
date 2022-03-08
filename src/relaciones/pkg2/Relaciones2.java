
package relaciones.pkg2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author Margarita_Bravo
 */
public class Relaciones2 {

    
    public static void main(String[] args) {
        
        Juego nj = new Juego();
        RevolverDeAgua r = new RevolverDeAgua();
        Jugador j = new Jugador();
        
        nj.llenarJuego(r, nj.getJugadores(), j);
        do {
            nj.ronda(j);
        } while (r.mojar()==false);
        
    }
    
}
