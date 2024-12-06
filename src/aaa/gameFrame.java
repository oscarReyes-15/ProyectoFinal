/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author LENOVO
 */
public class gameFrame {
        
    static void actualizarTablero(){
        for (int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                
                Botones[i][j].setText(logica.getTablero(i, j));
                
            }
        }
    
    }

    
     static JButton crearBotones(int fila, int col){
        JButton boton = new JButton("X" + fila + " Y" + col);
        
        boton.setForeground(Color.GRAY);
        boton.setBackground((fila + col)% 2 == 0? Color.WHITE : Color.BLACK);
        boton.setBorderPainted(false);
        
        boton.addActionListener(e -> Action.accionBoton(boton, fila, col));
        
        return boton;
    }
    
    static void iniciarBotones(){
        for (int fila = 0; fila < 6; fila++){
            for (int col = 0; col < 6; col++){
                Botones[fila][col] = crearBotones(fila, col); 
                G.add(Botones[fila][col]);
            }
        }
    }
    
    static void setGframe(){
        G.setSize(600, 600);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        G.setLayout(new GridLayout(6, 6, 5, 5));
        
        iniciarBotones();
    }
    
    static void GVisible(boolean t){
        G.setVisible(t);
    }
    
    static JFrame G = new JFrame("Ghosts: Game");

    static JButton[][] Botones = new JButton[6][6];
    
}
