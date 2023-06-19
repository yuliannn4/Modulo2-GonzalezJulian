
package ejercicio2.auto;

/**
 *
 * @author Julian
 */
public class Ejercicio2Auto {

    public static void main(String[] args) {
      
    String marca;
    String modelo; 
    String kilometraje;
    int kilometrajeIngresado;
        
        
        
     Auto mod1 = new Auto ();
     //ejecuto el codigo de la clase auto
      mod1.mostrarDatos();
      
      //con los datos recopilados lleno las variables
      
      marca = mod1.marca;
      modelo = mod1.modelo;
      kilometraje = mod1.kilometraje;
        

      //ejecuto el bucle 
      mod1.estadoAuto();
      
      
      
      
    }
    
}
