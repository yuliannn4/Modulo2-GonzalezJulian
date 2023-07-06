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
public class BusH extends VehiculoP{

    @Override
    public void Estacionar() {
       
        JOptionPane.showMessageDialog(null,
            "Este es un paso a paso de como encender un bus",
            "Encendiendo una moto",
             JOptionPane.INFORMATION_MESSAGE); }

    @Override
    public void Encender() {
        JOptionPane.showMessageDialog(null,
            "Este es un paso a paso de como encender un bus",
            "Encendiendo una moto",
             JOptionPane.INFORMATION_MESSAGE); }
    
    
}
