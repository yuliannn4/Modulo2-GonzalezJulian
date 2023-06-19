/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
class Bicicleta {
    //definiendo atributos 
   String rodado;
   String freno;
   String cambios;
   String material;
   String accesorios;
   
       ImageIcon bici = new ImageIcon ("src/img/bici.png");
       ImageIcon ficha = new ImageIcon ("src/img/fichabici.png");
        ImageIcon datos = new ImageIcon ("src/img/agenda.png");
       
       
   
   //creando los metodos 
   public void datos(){
        rodado = (String) JOptionPane.showInputDialog(null, "Ingrese el rodado: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        freno = (String) JOptionPane.showInputDialog(null, "Ingrese el Tipo de freno: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        cambios =(String) JOptionPane.showInputDialog(null, "Cuenta con cambio? Si/No: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        material = (String) JOptionPane.showInputDialog(null, "Ingrese el material principal del cuadro: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
        accesorios = (String) JOptionPane.showInputDialog(null, "Tiene accesorios? Detallar: ", "Ingreso de datos", JOptionPane.QUESTION_MESSAGE, datos, null, "");
   }
   
   public void ficha (){
       JOptionPane.showMessageDialog(null,
               "Rodado: N°"+rodado +"\nFrenos: "+freno+"\nCambios: "+cambios+"\nMaterial principal: "+material+"\nAcessorios: "+accesorios,
                "FICHA TÉCNICA DE LA BICI",
                JOptionPane.INFORMATION_MESSAGE,
                 ficha);
   }
 
    
}
