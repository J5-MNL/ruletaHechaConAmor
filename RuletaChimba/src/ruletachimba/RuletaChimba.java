package ruletachimba;

import ruletachimba.Nodo;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author sweet_milkshake
 */

public class RuletaChimba {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("                                                       Bienvenido/a al juego de azar del momento: ¡la ruleta de la suerte!");
        System.out.println("");
        System.out.println("El número de jugadores por cada partida será de cuatro (4). ¡Comenzemos!");
        System.out.println("");
        
        File jugadorUno = new File("C:\\Users\\jp\\Downloads\\RuletaChimba\\Jugador1.txt");
        File jugadorDos = new File("C:\\Users\\jp\\Downloads\\RuletaChimba\\Jugador2.txt");
        File jugadorTres = new File("C:\\Users\\jp\\Downloads\\RuletaChimba\\Jugador3.txt");
        File jugadorCuatro = new File("C:\\Users\\jp\\Downloads\\RuletaChimba\\Jugador4.txt");
        
        Scanner escaneaJugadorUno = new Scanner(jugadorUno);
        System.out.println("Jugador #1: ");
            while(escaneaJugadorUno.hasNextLine()) {
                System.out.println(escaneaJugadorUno.nextLine());
            }   System.out.println("");
            
        Scanner escaneaJugadorDos = new Scanner(jugadorDos);
        System.out.println("Jugador #2: ");
            while(escaneaJugadorDos.hasNextLine()) {
                System.out.println(escaneaJugadorDos.nextLine());
            }   System.out.println("");
            
        Scanner escaneaJugadorTres = new Scanner(jugadorTres);
        System.out.println("Jugador #3: ");
            while(escaneaJugadorTres.hasNextLine()) {
                System.out.println(escaneaJugadorTres.nextLine());
            }   System.out.println("");
            
        Scanner escaneaJugadorCuatro = new Scanner(jugadorCuatro);
        System.out.println("Jugador #4: ");
            while(escaneaJugadorCuatro.hasNextLine()) {
                System.out.println(escaneaJugadorCuatro.nextLine());
            }   System.out.println("");
        
        File ruletaNice = new File("C:\\Users\\jp\\Downloads\\RuletaChimba\\Ruleta.txt");
        Scanner chequeoRuleta = new Scanner(ruletaNice);
        
        while(chequeoRuleta.hasNextLine()) {
          String contenidoLinea = chequeoRuleta.nextLine();
     
          if (contenidoLinea != null) {
            Nodo nodito = new Nodo(0);
            int chequeoPar = nodito.casilla % 2;
            
                if (chequeoPar == 0) {
                   nodito.color = "rojo";
                   nodito.parImpar = "par";
             
                } else if(chequeoPar != 0) {
                   nodito.color = "negro";
                   nodito.parImpar = "impar";
                }
               
                for (int cicloCasillas = nodito.casilla; cicloCasillas <= 37; ++cicloCasillas) {
                    nodito.mostrarInfoCasilla();
                }

           
            }   
        }   
    }
}

      
            
        
            
      
        
        
        
            
        
            
            
            
            
            
        
    
        
        
    
  

