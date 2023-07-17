/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18.m2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Julian
 */
public class Ejercicio18M2 extends JFrame implements ActionListener{

    private JButton boton;
    private JLabel mensaje;
    private JTextField caja;
    private String nombre;
    
    
    public Ejercicio18M2(){
    
    boton = new JButton("Saludar");
    boton.setBounds(250,150,150,30);
    boton.addActionListener(this);
    
    mensaje = new JLabel ("Ingresa tu nombre");
    mensaje.setBounds(20,70,200,30);
    
    caja = new JTextField ();
    caja.setBounds(250,70,200,30);
    
    
    Container ventana =  getContentPane();
    ventana.setLayout(null);
    ventana.add(boton);
    ventana.add(mensaje);
    ventana.add(caja);
    ventana.setBackground(Color.LIGHT_GRAY);
    
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource() ==  boton){
           nombre =  caja.getText();
            
            JOptionPane.showMessageDialog(null, "Hola "+nombre+"!", "Saludos", JOptionPane.INFORMATION_MESSAGE);
        
        }
    
    }
    

    public static void main(String[] args) {
        Ejercicio18M2 salu = new Ejercicio18M2();
        
       salu.setBounds(0,0,600,300);
       salu.setResizable(true);
       salu.setVisible(true);
       salu.setLocationRelativeTo(null);
       salu.setTitle("Saludos");
       salu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
