/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class logica {
        //inicializando ambos jugadores
    static String Jugador1,Jugador2;
    
    
    //
    static Random R = new Random();
    static int Cont0 = 0, Cont1 = 0, turno = 1;
    
    
    
    static String getTablero(int fila , int col){
        return tablero[fila][col];
    }
    //tableros segun dificultad
    
    //array simula tablero
    static String[][] tablero = 
    {
        {"X", "", "", "", "", "X"},
        {"", "", "", "", "", ""},
        {"", "", "", "", "", ""},
        {"", "", "", "", "", ""},
        {"", "", "", "", "", ""},
        {"X", "", "", "", "", "X"}
    };
    
    
        
    //validaciones
    
    
        //validaciones de otrs ghosts (de su mismo equipo)en el tablero
        static int validarGhost(int fila2, int col2){
            if (tablero[fila2][col2].equals(tablero[fila2][col2].equals("-1") || tablero[fila2][col2].equals("1")) || tablero[fila2][col2].equals(tablero[fila2][col2].equals("-1") || tablero[fila2][col2].equals("1"))){
                return 0;
            }
            return 1;
        }

        //validaciones de rango
        static boolean validarRango(int fila, int col, int fila2, int col2){
            int x = Math.abs((fila - fila2));
            int y = Math.abs((col - col2));

            if ((x == 1 && y == 0) || (y == 1 && x == 0)){
                return true;
            }
            return false;
        }

        //validaciones de gane
        static void validarSalida(String pieza, int fila2, int col2){
            if ((pieza.equals("1") && fila2 == 0 && col2 == 0) || (pieza.equals("1") && fila2 == 0 && col2 == 5)){
                System.out.println(Jugador1 + " gano");
            }
            else if ((pieza.equals("2") && fila2 == 5 && col2 == 0) || (pieza.equals("1") && fila2 == 5 && col2 == 5)){
                System.out.println(Jugador2 + " gano");
            }
            
        }    
        
        //valida que se posiciones equitativamente los ghosts buenos y malos aleatorios
        static void validarAleatorio(int repeticionX, int CoordenadaX, int CoordenadaY, String[] Piezas, int ID){
        int X = CoordenadaX, Y = CoordenadaY, RX = repeticionX;
        
        //Ciclo validador
        for (int i = 0; i < RX; i++){
            for (int j = 0; j < 4; j++){
                if ( tablero[X][Y].equals(Piezas[0]) ){
                    Cont0++;
 
                }
                else if ( tablero[X][Y].equals(Piezas[1]) ){
                    Cont1++;

                } 
                Y++;
            }
            Y = 1;
            X--;
        }
   

        if (Cont0 != Cont1 && ID == 1){
            Cont0 = 0; Cont1 = 0;
            colocarUser(repeticionX, CoordenadaX, ID, Piezas);
        }
        else if(Cont0 != Cont1 && ID == 2){
            Cont0 = 0; Cont1 = 0;
            colocarUser(repeticionX, CoordenadaX, ID, Piezas);
            
        }
        
        Cont0 = 0; Cont1 = 0;

    }
    
        
        
    //movimiento de tablero
    static String movimiento(String pieza, int fila2, int col2, int ID){
        String retorno = "Movimiento exitoso ";
        
        if (ID == 3){
            if (tablero[fila2][col2].equals("-2") || tablero[fila2][col2].equals("-1")){
                retorno = "Te has comido un fantasma malo de ";
                //validarGane();
            }
        } 
        
        tablero[fila2][col2] = pieza;
        pieza = "";
        
        
        return retorno;
    }
        
    //Colocacion al azar
    static void colocarUser(int repeticionX, int X, int ID, String[] Piezas){
        //Coordenadas
        int CoordenadaX = X, CoordenadaY = 1;
        
        //ciclo
        for (int i = 0; i < repeticionX; i++){
            for (int j = 0; j < 4; j++){
                tablero[CoordenadaX][CoordenadaY] = Piezas[R.nextInt(2)];
                CoordenadaY++;
            }
            CoordenadaY = 1;
            CoordenadaX--;
        }
        
        //validacion de posiciones
        CoordenadaX = X;
        validarAleatorio(repeticionX, CoordenadaX, CoordenadaY, Piezas, ID);
    }
    
    static void ImpresionTablero(){
        //meramente test
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }        
        
    }
    
    static void setJugador1(String Buscado){
        Jugador1 = Users.getPos(Buscado);
    }
    
    static void setJugador2(String Buscado){
        Jugador2 = Users.getPos(Buscado);
    }
    //comer
    
    //ganar
}
