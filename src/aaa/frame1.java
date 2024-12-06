/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class frame1 {
    
    static void setP2(){
        //set
        P2.setLayout(new GridLayout(1,3));
        JPanel P21 = new JPanel();
        JPanel P22 = new JPanel();
        JPanel P23 = new JPanel();
        
        //agregar
        P2.add(P21);
        P2.add(P22);
        P2.add(P23);
        
        //ActionListener
        login.addActionListener(e -> {
            Action.Login();
        });
        
        registro.addActionListener(e -> {
            Action.register();
        });
        
        salir.addActionListener(e -> {
            Action.salirPrograma();
        });
        
        //agregar
        P22.setLayout(new GridLayout(3, 1, 0, 10));
        P22.add(login);
        P22.add(registro);
        P22.add(salir);
    }
    
    static void setP1(){
        JLabel titulo = new JLabel("Ghosts");
        titulo.setFont(titulo.getFont().deriveFont(1, 20));
        
        //agregar
        P1.add(titulo);
    }
    
    static void Jstart(){
        J.getContentPane().removeAll();
                
        //set frame
        J.setSize(600, 600);
        J.setLayout(new GridLayout(3, 1));
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //funciones establecen paneles
        setP1();
        setP2();
        //setP3();
        
        //agregar
        J.add(P1);
        J.add(P2);
        J.add(P3);
    }
    
    static void JVisible(boolean T){
        J.setVisible(T);
    }
    
    //frames
    static JFrame J = new JFrame("Inicio");
    
    //paneles
    static JPanel P1 = new JPanel();
    static JPanel P2 = new JPanel();
    static JPanel P3 = new JPanel();
    
    //botones
    static JButton login = new JButton("Login");
    static JButton registro = new JButton("Registrar");
    static JButton salir = new JButton("Salir");
    

}
