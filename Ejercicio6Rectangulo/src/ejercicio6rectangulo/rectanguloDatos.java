
package ejercicio6rectangulo;
import javax.swing.JOptionPane;

        
        
public class rectanguloDatos {
    
    protected double base;
    protected double altura;
    protected double area;
    
    public void solicitarDatos(){
       String datoingresado =   JOptionPane.showInputDialog(null,
               "Ingreso de datos",
               "Ingrese la base", 
               JOptionPane.QUESTION_MESSAGE);
       
       base = Double.parseDouble(datoingresado);
        
       String altIngresada =   JOptionPane.showInputDialog(null,
               "Ingreso de datos",
               "Ingrese la altura", 
               JOptionPane.QUESTION_MESSAGE);
       
       altura = Double.parseDouble(altIngresada);    
            
    
    }
    
    
    
     public void calcularArea(){
        solicitarDatos();
            area = altura * base;
            }
     
     
    public void mostarDatos(){
        calcularArea();
     JOptionPane.showMessageDialog(null, "El area del rectangulo es de: "+area);
    }

    
}
