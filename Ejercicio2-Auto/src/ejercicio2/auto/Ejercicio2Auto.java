
package ejercicio2.auto;

/**
 *
 * @author Julian
 */
public class Ejercicio2Auto {

    public static void main(String[] args) {
      
    String marca="";
    String modelo=""; 
    String kilometraje="";
    int kilometrajeIngresado=0;
        
        
        
     Auto mod1 = new Auto(marca,modelo,kilometraje,kilometrajeIngresado);
     

     //ejecuto el codigo de la clase auto
      mod1.pedirDatos();

      //ejecuto la clase  
      mod1.estadoAuto();
     
      
      
    }
    
}
