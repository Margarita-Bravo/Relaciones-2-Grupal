/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.ServiClub;

import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Servite {
    Scanner leer= new Scanner(System.in);
    public Jugador crearJugador(int i)
    {
        System.out.println("Introduce el nombre del jugador");
        String nombre = leer.next();
        Jugador j;
        return j= new Jugador(i,nombre);
    }

    public Servite() {
    }
    
}
