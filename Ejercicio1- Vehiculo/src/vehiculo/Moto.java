/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
class Moto {
    
       ImageIcon moto = new ImageIcon ("src/img/moto.png");
       ImageIcon ficha = new ImageIcon ("src/img/fichamoto.png");
       ImageIcon datos = new ImageIcon ("src/img/agenda.png");
    
    
    //defino atributos
    private String cilindrada;
    private String transmision;
    private String patente;
    private String color;

    public Moto(String cilindrada, String transmision, String patente, String color) {
        this.cilindrada = cilindrada;
        this.transmision = transmision;
        this.patente = patente;
        this.color = color;
    }//ejercicio4

    public String getCilindrada() {
        return cilindrada;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getPatente() {
        return patente;
    }

    public String getColor() {
        return color;
    }
    
    
    
    //creando los metodos 
   public void pedirDatos(){
        cilindrada = (String) JOptionPane.showInputDialog(null, "Ingrese la cilindrada: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        
        transmision = (String) JOptionPane.showInputDialog(null, "Ingrese El tipo de transmision: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        
        patente =(String) JOptionPane.showInputDialog(null, "Ingrese la Pantente: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        
        color = (String) JOptionPane.showInputDialog(null, "Ingrese la color principal: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
      }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setColor(String color) {
        this.color = color;
    }//ejercicio9
    
    
    
    
    
    
   
   public void ficha (){
       JOptionPane.showMessageDialog(null,
               "Cilindrada: "+cilindrada +"\nTransmision: "+transmision+"\nPatente: "+patente+"\nColor: "+color,
                "FICHA TÉCNICA DE LA MOTO",
                JOptionPane.INFORMATION_MESSAGE,
                 ficha);
   }
    
}
