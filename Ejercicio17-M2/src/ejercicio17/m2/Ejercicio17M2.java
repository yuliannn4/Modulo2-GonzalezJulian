/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.m2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Julian
 */
public class Ejercicio17M2 extends JFrame implements ActionListener{ 

  
   private JButton b1,b2,b3;

   private JLabel resultado;
   
   
   public Ejercicio17M2(){

       b1 = new JButton ("Boton 1");
       b1.setBounds(10,20,150,30);
       b1.addActionListener(this);
       
       b2= new JButton ("Boton 2");
       b2.setBounds(180,20,150,30);
       b2.addActionListener(this);
       
       b3 = new JButton("Boton3");
       b3.setBounds(350,20,150,30);
       b3.addActionListener(this);

       
       resultado = new JLabel ();
       resultado.setBounds(50, 150,300,30);
       
       
       
       Container caja = getContentPane();
       caja.setLayout(null);
       caja.add(b1);
       caja.add(b2);
       caja.add(b3);
       caja.add(resultado);
       caja.setBackground(Color.GRAY);
}
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource()== b1){
            resultado.setText("Presionaste el boton 1");
        }else if (e.getSource()==b2){
            resultado.setText("Presionaste el boton 2");  
        }else if (e.getSource()==b3){
            resultado.setText("Presionaste el boton 3");
        }else{
             System.exit(0);
        }
    
     }
    
    public static void main(String[] args) {
        
        Ejercicio17M2 msj = new Ejercicio17M2();
        
        msj.setBounds(00,0,600,300);
        msj.setResizable(true);
        msj.setVisible(true);
        msj.setLocationRelativeTo(null);
        msj.setTitle("Adivinador de Botones");
        msj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
