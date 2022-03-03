
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Margarita_Bravo
 */
public class Jugador {
    private int idJugador;
    private String nombreJugador;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int idJugador, String nombreJugador, boolean mojado) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.mojado = mojado;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombreJugador=" + nombreJugador + ", mojado=" + mojado + '}';
    }
    
    Scanner leer = new Scanner (System.in);
    public int preguntarCantidad(){
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad=leer.nextInt();
        if (cantidad<1||cantidad>6) {
            cantidad=6;
        }
        
        return cantidad;
        
    }
    
   
}
