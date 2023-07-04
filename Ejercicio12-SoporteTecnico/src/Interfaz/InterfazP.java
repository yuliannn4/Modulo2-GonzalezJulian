/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.util.Scanner;

/**
 *
 *Realizar un programa en  el cual exista una clase padre y 3 clases hijas. 
Vamos a simular que somos una compañía de soporte técnico en donde recibimos elementos electrónicos como celulares, tablet y joystick. 
* El operador tiene que poder realizar la registración del elemento electrónico que ingreso , teniendo un ingreso de sus atributos por consola.
Atributos como :
Numero de cliente:
Elemento:(celular,tablet,jostick..)
Marca:
Modelo:
Batería: 3000ma  5hs,4000ma  9hs,7000ma  12hs
Defecto:

Para luego realizar una impresión en pantalla con el detalle del elemento recibido.

Adjunte el comentario con el repositorio para ver el funcionamiento.

gracias
 */
public class InterfazP {
    protected String nombre;
    protected String numero;
    protected String elemento;
    protected String marca;
    protected String modelo;
    protected String bateria;
    protected String defecto;


    
    Scanner datos = new Scanner (System.in);
    
      public void intro (){
    
    System.out.println(" Bienvenido al servicio Técnico del cfp36");
    }
    
      public void datosCliente(){
        intro();
    System.out.println("Ingrese nombre del cliente: ");
        nombre= datos.nextLine();
        
    System.out.println("Ingrese numero del Cliente");
        numero = datos.nextLine();
        
    }
      
      
      
      public void imprimirDatos(){
     System.out.println("\n/////////////////////////////////");
     System.out.println("//////////////FICHA//////////////");
     System.out.println("/////////////////////////////////");
     System.out.println("Nombre del cliente: "+ nombre);
     System.out.println("Numero del cliente: "+ numero);
      }
     public void imprimirProdu(){
     System.out.println("Producto a revisar: " + elemento);
     System.out.println("Marca del producto a revisar: " + marca);
     System.out.println("Modelo del producto a revisar: "+  modelo);
     System.out.println("Bateria del a revisar: "+ bateria);
     System.out.println("Defectos : "+ defecto);
     }
}
      

