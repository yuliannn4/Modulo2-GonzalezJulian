/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Tablet extends InterfazP {
    Scanner datos = new Scanner (System.in);
    
      public void producto(){
        elemento = "Tablet";
        
    System.out.println("Ingrese la marca del Tablet");
        marca = datos.nextLine();
        
        System.out.println("Ingrese el modelo del Tablet ");
        modelo = datos.nextLine();
        
         System.out.println("Que bateria tiene tu Tablet?  ");
        System.out.println("1 - 3000ma  5hs");
        System.out.println("2 - 4000ma  9hs");
        System.out.println("3 - 7000ma  12hs");
        bateria= datos.next();

        switch (bateria){
            case "1":
               bateria = "3000ma  5hs";
            break;
            case "2":
               bateria = "4000ma  9hs";
            break;
            case "3":
               bateria = "7000ma  12hs";
            break;
            default:
            System.out.println ("El dato ingresado no es valido");   
            break;    
        }
        datos.nextLine();
        
        System.out.print("Defecto del Tablet: ");
        defecto= datos.nextLine();
       
    } 
}
