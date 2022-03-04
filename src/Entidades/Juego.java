package Entidades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Margarita_Bravo
 */
public class Juego {
    private HashMap <Integer,String>jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(HashMap<Integer, String> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public HashMap<Integer, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashMap<Integer, String> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    public void llenarJuego(RevolverDeAgua r, HashMap <Integer,String>jugadores, Jugador j) {
        for (int i = 0; i < j.preguntarCantidad(); i++) {
            jugadores.put(i, "JUGADOR");
        }
        
        r.llenarRevolver();
    }
    
    public void ronda() {
        do {
            
        } while ();
        
    }
}
