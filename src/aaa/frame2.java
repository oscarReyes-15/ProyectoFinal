/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;


import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class frame2 {
    
    static void setAction(JButton B1, JButton B2, JButton B3, JButton B4, JButton B5){
        //action
        B1.addActionListener(e -> {
            Action.Jugar();
        });
        
        B2.addActionListener(e -> {
            Action.Configuracion();
        });
        
        B3.addActionListener(e -> {
            Action.regresarMenu(1);
        });
        
        B4.addActionListener(e -> {
            Action.regresarMenu(1);
        });
        
        B5.addActionListener(e -> {
            Action.regresarMenu(1);
        });
    }
    
    static void setP1(){
        
        P1.removeAll();
        P1.revalidate();
        P1.repaint();
        
        
        //layout panel
        P1.setLayout(new GridLayout(1, 3, 0, 5));
        
        //titulo
        JLabel titulo = new JLabel("Bienvenido ");
        titulo.setFont(titulo.getFont().deriveFont(1,20));
        
        //layout
        JPanel P11 = new JPanel();
        JPanel P12 = new JPanel();
        JPanel P13 = new JPanel();
        P12.setLayout(new GridLayout(7, 1, 5, 5));
                
        //agregar
        P1.add(P11);
        P1.add(P12);
        P1.add(P13);
        
        //inicializar
        //botones
        JButton B1 = new JButton("Jugar");
        JButton B2 = new JButton("Configuracion");
        JButton B3 = new JButton("Reportes");
        JButton B4 = new JButton("Mi perfil");
        JButton B5 = new JButton("Salir");
    
        
        //agregar
        P12.add(titulo);
        P12.add(B1);
        P12.add(B2);
        P12.add(B3);
        P12.add(B4);
        P12.add(B5);     
        
        //action
        setAction(B1, B2, B3, B4, B5);
        
    }
    
    static void setJ2Frame(){
        
        //set frame
        J2.setSize(600, 600);
        J2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        //set panel
        setP1();
        
        //agregar
        J2.add(P1);
    }
    
    static void J2Visible(boolean t){
        J2.setVisible(t);
    }
    
    //frames
    static JFrame J2 = new JFrame("Menu");
    
    //panel
    static JPanel P1 = new JPanel();
    
    
}
