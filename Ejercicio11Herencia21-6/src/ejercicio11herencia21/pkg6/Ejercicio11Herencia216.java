
package ejercicio11herencia21.pkg6;

import operaciones.ChijaResta;
import operaciones.ChijaSuma;


public class Ejercicio11Herencia216 {


    public static void main(String[] args) {
     //importamos el package y creamos objetos 
       ChijaSuma msjSum = new ChijaSuma(); 
      
       //como llamamos a la clase hija POR HERENCIA se llama al padre
       msjSum.PedirDatos();
       msjSum.suma();
       msjSum.MostrarResultados();
       
      //de nuevo importamos  y creamos el objeto msjRest
      ChijaResta msjRest = new ChijaResta();
       msjRest.PedirDatos();
       msjRest.Resta();
       msjRest.MostrarResultados();
      
    }
    
}
