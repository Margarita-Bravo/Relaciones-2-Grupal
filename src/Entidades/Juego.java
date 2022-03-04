package Entidades;

import Entidades.ServiClub.Servite;
import java.util.ArrayList;

/**
 *
 * @author Margarita_Bravo
 */
public class Juego {
    private ArrayList <Jugador>jugadores= new ArrayList();
    private RevolverDeAgua revolver;

    public Juego() {
    }
    public void llenarJuego(RevolverDeAgua r, ArrayList <Jugador>jugadores, Jugador j) {
        Servite servi= new Servite();
        for (int i = 0; i < j.preguntarCantidad(); i++) {
            jugadores.add(servi.crearJugador(i));
        }
        
        r.llenarRevolver();
    }
    
    /*public void ronda() {
        do {
            
        } while ();
        
    }/*
    }
    */
}
