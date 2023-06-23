package Libreria;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
       
       

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public class FichaTecnica {
    ImageIcon ficha =  new ImageIcon("src/imagenes/ficha.png");
    
    String marca;
    String modelo;
    String tipoDeCarga;
    String color;
    int capacidad;
    int velocidad;
    String eficiencia;
    String medidas;
    String Ficha;

    public FichaTecnica(String marca, String modelo, String tipoDeCarga, String color, int capacidad,int velocidad, String eficiencia, String medidas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoDeCarga = tipoDeCarga;
        this.color = color;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.eficiencia = eficiencia;
        this.medidas = medidas;
    }
    
    public void MostrarFicha (){
        
        Ficha = "Marca: " +marca+ "\nModelo: "+modelo+"\nTipo de Carga: "+tipoDeCarga+"\nColor: "+color+"\nCapacidad: "+capacidad+" kg. \nVelocidad: "+velocidad+"\nEficiencia energética: "+eficiencia+"\nMedidas: "+medidas;
        JOptionPane.showMessageDialog(null, 
                Ficha, 
                "Ficha Tecnica", 
                JOptionPane.INFORMATION_MESSAGE,
                ficha);
        
        System.out.println(Ficha);
    
    
    };
    
    
    
    
    
}
