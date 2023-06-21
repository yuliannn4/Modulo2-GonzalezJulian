
package operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Cpadre {
    
    protected int valor1,valor2,resultado;
    
    ImageIcon calculin = new ImageIcon("");
    
    


//metodo para pedir los valores
    public void PedirDatos(){
    JOptionPane.showMessageDialog(null, 
            "Calculin",
            "bla",
            JOptionPane.INFORMATION_MESSAGE,
            null);
    
    String v1 = (String)JOptionPane.showInputDialog(null,
            "Ingrese primer valor",
            "CALCULIN Operaciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            null,null);
    
     String v2 = (String)JOptionPane.showInputDialog(null,
            "Ingrese segundo valor",
            "CALCULIN Operaciones",
            JOptionPane.QUESTION_MESSAGE,
            null,
            null,null);
    valor1 = Integer.parseInt(v1);
    valor2 = Integer.parseInt(v2);
    }
 

//metodo para mostrar resultados    
    public void MostrarResultados(){
        
        JOptionPane.showMessageDialog(null, 
            "Resultado: " + resultado,
            "bla",
            JOptionPane.INFORMATION_MESSAGE,
            null);
    }
}
