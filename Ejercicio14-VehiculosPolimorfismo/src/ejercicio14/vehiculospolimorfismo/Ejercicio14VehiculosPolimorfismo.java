/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.vehiculospolimorfismo;

import javax.swing.JOptionPane;



/**
 *
 * @author Julian
 */
public class Ejercicio14VehiculosPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Object [] opciones = {"Auto","Moto","Bus"};
        
       int eleccion= JOptionPane.showOptionDialog(null,
                "Seleccione una opcion",
                "Clases de manejo",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
       
       switch(eleccion){
           case 0: VehiculoP a1 = new AutoH();
                    a1.intro();
                    a1.Encender();
                    a1.Estacionar();
                    break;
           case 1: VehiculoP b2 = new MotoH();
                    b2.intro();
                    b2.Encender();
                    b2.Estacionar();
                    break;
           case 2: VehiculoP c3 = new BusH();
                    c3.intro();
                    c3.Encender();
                    c3.Estacionar();
                    break;
       }
        
    }
    
    }
    

