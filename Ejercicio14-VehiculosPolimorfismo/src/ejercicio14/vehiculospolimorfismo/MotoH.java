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
public class MotoH extends VehiculoP{

    @Override
    public void Estacionar() {
         JOptionPane.showMessageDialog(null,
            "Este es un paso a paso de como estacionar una moto",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
         
             JOptionPane.showMessageDialog(null,
            "Encuentra un lugar adecuado: Busca un lugar apropiado para estacionar tu moto, \npreferiblemente un espacio designado para moto",
            "Estacionando una moto",
             JOptionPane.INFORMATION_MESSAGE);

             JOptionPane.showMessageDialog(null,
            "Apaga el motor y asegura la posición: Detén la moto y apaga el motor.\n Asegúrate de que esté completamente detenida. \nLuego, coloca el soporte lateral para mantenerla en posición vertical. \nVerifica que el soporte esté firmemente colocado y que la moto esté estable antes de soltarla",
            "Estacionando una moto",
             JOptionPane.INFORMATION_MESSAGE);
                              
             JOptionPane.showMessageDialog(null,
            "Paso 3: Verifica la seguridad y el bloqueo (opcional): \nAntes de irte, verifica que tu moto esté en un lugar seguro y no obstruya el paso",
            "Estacionando una moto",
             JOptionPane.INFORMATION_MESSAGE);
    
    }

    @Override
    public void Encender() {
        JOptionPane.showMessageDialog(null,
            "Este es un paso a paso de como encender una moto",
            "Encendiendo una moto",
             JOptionPane.INFORMATION_MESSAGE); }
    
    
}
