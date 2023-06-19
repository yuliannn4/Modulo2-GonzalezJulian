/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.auto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Auto {
    
    //atributos, es decir caracteristicas de mi auto
    
    ImageIcon agenda = new ImageIcon("src/imagen/agenda.png");
    ImageIcon muy = new ImageIcon("src/imagen/muy.png");
    ImageIcon nuevo = new ImageIcon("src/imagen/nuevo.png");
    ImageIcon poco = new ImageIcon("src/imagen/poco.png");
    ImageIcon usado = new ImageIcon("src/imagen/usado.png");
    
    String marca;
    String modelo; 
    String kilometraje;
    int kilometrajeIngresado;
    
    //con los metodos defino las acciones
        public void mostrarDatos() {
                marca = (String) JOptionPane.showInputDialog(null,
                                                            "Ingrese la marca del Vehiculo",
                                                            "CARGA DE DATOS",
                                                            JOptionPane.QUESTION_MESSAGE,
                                                            agenda,
                                                            null,
                                                            "");
                modelo = (String) JOptionPane.showInputDialog(null,
                                                            "Ingrese el modelo del Vehiculo",
                                                            "CARGA DE DATOS",
                                                            JOptionPane.QUESTION_MESSAGE,
                                                            agenda,
                                                            null,
                                                            "");
                
}
    
        public void estadoAuto(){

     //Pido el kilometraje y convierto a int 
      kilometraje = (String) JOptionPane.showInputDialog(null,
            "Ingrese el kilometraje del vehículo",
            "CARGA DE DATOS",
            JOptionPane.QUESTION_MESSAGE,
            agenda,
            null,
            "");

     kilometrajeIngresado = Integer.parseInt(kilometraje);

    if (kilometrajeIngresado == 0) {
        JOptionPane.showMessageDialog(null,
                "",
                "Estado del vehículo",
                JOptionPane.INFORMATION_MESSAGE,
                muy);
    } else if (kilometrajeIngresado < 10000) {
        JOptionPane.showMessageDialog(null,
                "",
                "Estado del vehículo",
                JOptionPane.INFORMATION_MESSAGE,
                nuevo);
    } else if (kilometrajeIngresado < 100000) {
        JOptionPane.showMessageDialog(null,
                "",
                "Estado del vehículo",
                JOptionPane.INFORMATION_MESSAGE,
                poco);
    } else {
        JOptionPane.showMessageDialog(null,
                "",
                "Estado del vehículo",
                JOptionPane.INFORMATION_MESSAGE,
                usado);
            }
        
        }
    
}
