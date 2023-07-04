/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soportetecnico;

import Interfaz.InterfazP;
import Interfaz.Celular;
import Interfaz.Joystick;
import Interfaz.Tablet;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class SoporteTecnico {

 
    public static void main(String[] args) {
      
        // muestro bienvenida y pido los datos
        InterfazP data = new InterfazP();
        data.datosCliente();

        //seleccion de elemento 
       Scanner datos = new Scanner (System.in);  
       System.out.println("Seleccione el producto correspondiente: \n1.- Celular \n2.- Tablet \n3.-Joystick");
            int seleccion = datos.nextInt();
            datos.nextLine();
    
            
    switch (seleccion){
        case 1 : Celular celu = new Celular();
                celu.producto();
                data.imprimirDatos();
                celu.imprimirProdu();
                break;
                
        case 2 : Tablet tablet = new Tablet();
                tablet.producto();
                data.imprimirDatos();
                tablet.imprimirProdu();
                break;
                
        case 3 : Joystick joy = new Joystick();
                joy.producto();
                data.imprimirDatos();
                joy.imprimirProdu();
                break;
    }
    
}
}