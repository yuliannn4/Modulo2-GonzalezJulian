/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.formulario;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Julian
 */
public class Ejercicio16Formulario extends JFrame {
    
    private JLabel etiqueta;

    public Ejercicio16Formulario(){
    
        
        setLayout(null);
        
       etiqueta = new JLabel("Julian Gonzalez");//creo el componente JLabel etiqueta
       etiqueta.setBounds(0, 0, 300, 50); 
       etiqueta.setHorizontalAlignment(JLabel.CENTER);
       add(etiqueta);
       
       etiqueta = new JLabel ("Tel: 1127900903");
       etiqueta.setBounds(0,15,300, 50);
       etiqueta.setHorizontalAlignment(JLabel.CENTER);
       add(etiqueta);
       
       etiqueta = new JLabel ("Correo: julianesteban746@gmail.com");
       etiqueta.setBounds(0, 30,300,50);
       etiqueta.setHorizontalAlignment(JLabel.CENTER);
       add(etiqueta);
       
       etiqueta = new JLabel("DNI: 40708067");
       etiqueta.setBounds(0, 45, 300, 50);
       etiqueta.setHorizontalAlignment(JLabel.CENTER);
       add(etiqueta);
        
    }
   

    public static void main(String[] args) {
       
        
        Ejercicio16Formulario formu = new Ejercicio16Formulario();
        
        formu.setBounds(0, 0, 400, 200);//tamaño
        formu.setVisible(true);//visibilidad
        formu.setLocationRelativeTo(null);//centrado
        formu.setResizable(false);//edicion de tamaño
        formu.setTitle("Ejercicio N°16");//titulo
        formu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa al salir
        
    }
    
}
