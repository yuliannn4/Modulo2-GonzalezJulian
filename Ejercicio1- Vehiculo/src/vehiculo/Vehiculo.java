
package vehiculo;

/**
 *
 * @author Julian
 */
public class Vehiculo {


    public static void main(String[] args) {
        
        String rodado="",freno="",cambios="",material="",accesorios="";
        String cilindrada="",transmision="",patente="",color="";
        
        
       //crea un nuevo objeto de la clase Bicicleta y lo asigna a la variable bici.
       //Esto significa que puedes usar la variable bici para acceder y manipular ese objeto en particular.
          Bicicleta bici = new Bicicleta (rodado,freno,cambios,material,accesorios);
          Moto moto = new Moto (cilindrada,transmision,patente,color);
       
       // llama al método datos() en el objeto bici. 
       //Esto significa que se está ejecutando el código dentro del método datos() definido en la clase Bicicleta   
    bici.pedirDatos();
    bici.ficha();
    
    moto.pedirDatos();
    moto.ficha();
    
    }
    
}
