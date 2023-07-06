/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14.vehiculospolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public abstract class VehiculoP {
    
    public void intro(){
    
        JOptionPane.showMessageDialog(null,
            "Manual de supervivencia frente al volante",
            "Clases de manejo",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    
  
     public abstract void Estacionar();
       
     public abstract void Encender();
       
        
    
}
