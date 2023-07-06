/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioenclase286;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Julian
 */
public class EjercicioEnClase286 extends JFrame {
    private JLabel etiq;
    
   
    public EjercicioEnClase286(){
        //indicar con coordenadas la ubicacion del form
        setLayout(null);
        
    //Crear la etiqueta 
        //mensaje de etiqueta
        etiq = new JLabel("HOLA");
        
        //Establece la posición (x, y) y las dimensiones (ancho, alto) de la etiqueta
        etiq.setBounds(50,50,250,20);
      
        //etiq.setHorizontalAlignment(JLabel.CENTER);
        add (etiq);
          
        etiq = new JLabel("Mi nombre es Julian González");
        etiq.setBounds(50,70,170,10);
        etiq.setBackground(Color.blue);
        etiq.setOpaque(true);
        add (etiq);
        
        etiq = new JLabel("DNI: 40.708.067");
        etiq.setBounds(50,90,250,5);
        add (etiq);
        
        etiq = new JLabel("Nací el 11/09/1997");
        etiq.setBounds(50,110,250,15);
        add (etiq);
        
        etiq = new JLabel("Mi telefono es 1127900903");
        etiq.setBounds(50,120,250,19);
        add (etiq);
    }
    
    public static void main(String[] args) {
        
        EjercicioEnClase286 ford = new EjercicioEnClase286();
        ford.setBackground(Color.GREEN);
        
        //tamaño
        ford.setBounds(0,0,350,250);
        
        //hacer visible formulario
        ford.setVisible(true);
        
        //centrar formualio
        ford.setLocationRelativeTo(null);
        //permitir la edicion del tamaño
        ford.setResizable(false);
        //titulo
        ford.setTitle("Presentacion de formulario");
        
    }
    
}