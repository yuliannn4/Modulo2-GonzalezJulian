/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.polimorfismos;

import javax.swing.JOptionPane;
import operaciones.resta;
import operaciones.suma;

/**
 *
 * @author Julian
 */
public class Ejercicio13Polimorfismos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String elec  = JOptionPane.showInputDialog(null,
                "Ingrese la opcion:\n1. Suma\n2.Resta",
                "Bienvenido a la Caluleitor",
                JOptionPane.QUESTION_MESSAGE);
        
        switch (elec){
            case "1" : suma sum = new suma();
                        sum.PedirDatos();
                        sum.MostrarResultados();break;
                        
            case "2" : resta rest = new resta();
                        rest.PedirDatos();
                        rest.MostrarResultados();break;
        }
    }
    
}
