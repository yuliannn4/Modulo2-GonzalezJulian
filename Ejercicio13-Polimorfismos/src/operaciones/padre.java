/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class padre {
     protected int valor1,valor2,resultado;
    
    ImageIcon calculin = new ImageIcon("");
    
    


//metodo para pedir los valores
    public void PedirDatos(){

    String v1 = (String)JOptionPane.showInputDialog(null,
            "Ingrese primer valor",
            "CALCULEITOR OPERACIONES",
            JOptionPane.QUESTION_MESSAGE,
            null,
            null,null);
    
     String v2 = (String)JOptionPane.showInputDialog(null,
            "Ingrese segundo valor",
            "CALCULEITOR OPERACIONES",
            JOptionPane.QUESTION_MESSAGE,
            null,
            null,null);
    valor1 = Integer.parseInt(v1);
    valor2 = Integer.parseInt(v2);
    }
 
    public void operacion(){}

//metodo para mostrar resultados    
    public void MostrarResultados(){
        operacion();
        JOptionPane.showMessageDialog(null, 
            "Resultado: " + resultado,
            "bla",
            JOptionPane.INFORMATION_MESSAGE,
            null);
    }
}
