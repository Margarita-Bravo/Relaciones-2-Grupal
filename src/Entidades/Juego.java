package Entidades;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Margarita_Bravo
 */
public class Juego {

    Scanner leer = new Scanner(System.in);

    private ArrayList<Jugador> jugadores=new ArrayList();
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores =  jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
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

    public Jugador crearjugador(int i) {
        System.out.println("Ingrese el nombre del jugador");
        String nombre = leer.next();
        Jugador j;
        return j = new Jugador(i, nombre);
    }

    public void llenarJuego(RevolverDeAgua r, ArrayList<Jugador> jugadores, Jugador j) {
        int total=j.preguntarCantidad();
        for (int i = 0; i < total; i++) {
            jugadores.add(crearjugador(i));
        }
        r.llenarRevolver();
    }

    public void ronda(Jugador j) {
        for (Jugador aux : jugadores) {
            aux.disparo(revolver);
        }
    }
}

