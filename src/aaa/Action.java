/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Action {
        
    
     static void Login(){
        //Entrada usuario
        String User = JOptionPane.showInputDialog("Ingrese su Usuario");
        
        if (Users.getPos(User).equals(User)){
            //Entrada contrasena
            String Contra = JOptionPane.showInputDialog("Ingrese su contrasena");
            
            //
            if (Users.getContra(Contra).equals(Contra)){
                JOptionPane.showMessageDialog(null, "Bienvenido " + User);
                logica.setJugador1(User);
                frame1.JVisible(false);
                frame2.J2Visible(true);
                frame2.setJ2Frame();
                
            } else {JOptionPane.showMessageDialog(null, "Contrasena equivocada");}
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
       
    }

    static void register(){
        String User = JOptionPane.showInputDialog("Ingrese su Usuario");
        
        if (Users.getPos(User).equals("")){
            //Entrada contrasena
            String Contra = JOptionPane.showInputDialog("Ingrese su password");
            Users.registrarUser(User, Contra);
            
            
            frame1.JVisible(false);
            frame2.J2Visible(true);
            frame2.setJ2Frame();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuario tomado");
        }
       
    }
    
    static void salirPrograma(){
        int res = JOptionPane.showConfirmDialog(null, "Desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        
        if (res == JOptionPane.YES_OPTION){
            System.exit(0);
        }   
    }
    
    static void regresarMenu(int Nivel){
        switch (Nivel){
            case 1 -> {
               frame2.J2Visible(false);
               frame1.JVisible(true);
                
            }
            case 2 -> {
                
            }
        }
    }
    
    static void Configuracion (){
        try{
            int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Configracion \n1. Establecer Dificultad \n2. Modo de Juego \n3. Regresar"));

            switch (Opcion){
            case 1 -> {setDificultad(); JOptionPane.showMessageDialog(null, "Listo!");}
            case 2 -> {setModoJuego(); JOptionPane.showMessageDialog(null, "Listo!");}
            case 3 -> {}
            default -> {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta!!!");
                Configuracion();
                }
            }
        } 
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Escoja una opcion...");
            Configuracion();
        }

    }
    
    static void Jugar(){
        String User = JOptionPane.showInputDialog("Ingrese nombre de jugador 2");
        
        if (Users.getPos(User).equals(User)){    

            logica.setJugador2(User);
            logica.ImpresionTablero();
            frame2.J2Visible(false);
            gameFrame.GVisible(true);
            gameFrame.setGframe();
            logica.colocarUser(2, 1, 1,new String[] {"1" , "-1"});
            logica.colocarUser(2, 5, 2,new String[] {"2" , "-2"});
            gameFrame.actualizarTablero();

            logica.ImpresionTablero();
        } else {JOptionPane.showMessageDialog(null, "No existe ese usuario");}
    } 
    
    static void accionBoton(JButton boton, int fila, int col){
        //entrada
        
        
        //validaciones
        if (boton.getText() != null && !boton.getText().equals("") && !boton.getText().equals("X")){
            
            int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila a moverse"));
            int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila a moverse"));
            
            if (logica.validarRango(fila, col, fila2, col2) == true){
                
                System.out.println("rango");
                if (logica.validarGhost(fila2, col2) == 1 || logica.validarGhost(fila2, col2) == 3){
                    System.out.println("ghost");
                    logica.movimiento(boton.getText(), fila2, col2, logica.validarGhost(fila2, col2));
                    logica.validarSalida(boton.getText(), fila2, col2);
                    gameFrame.actualizarTablero();
        
                } 
                else {JOptionPane.showMessageDialog(boton, "Hay un ghost de tu equipo aqui...");}

            } 
            else {JOptionPane.showMessageDialog(boton, "Fuera de rango...");}
        } 
        else {JOptionPane.showMessageDialog(boton, "Casiilla invalida o no ocupada...");}
    }
    
    
    static void setModoJuego(){
        int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de Dificultad deseado: \n1. Aleatorio - Escoje Ghosts por ti \n2. Manual - Escoje donde van tus Ghosts"));
        
        switch (Opcion){
            case 1 -> {
                //G.Dificultad = 8;
                break;
            }
            case 2 -> {
                //G.Dificultad = 4;
                break;
            }
            case 3 -> {
                //G.Dificultad = 2;
                break;
            }
            case 4 -> {}
            default -> {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta!!!");
                setModoJuego();
            }
        }
    }
    
    static void setDificultad(){
        int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de Dificultad deseado: \n1. Nomral \n2. Expert \n3. GENIUS "));
        
        switch (Opcion){
            case 1 -> {
                //G.Dificultad = 8;
                break;
            }
            case 2 -> {
                //G.Dificultad = 4;
                break;
            }
            case 3 -> {
                //G.Dificultad = 2;
                break;
            }
            case 4 -> {}
            default -> {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta!!!");
                setDificultad();
            }
        }
    
    }

}
