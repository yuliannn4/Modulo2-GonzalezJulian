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
public class AutoH extends VehiculoP {

    @Override
    public void Estacionar() {
        
    JOptionPane.showMessageDialog(null,
            "Este es un paso a paso de como estacionar un auto",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
        
    JOptionPane.showMessageDialog(null,
            "Encuentra un espacio adecuado: Busca un lugar de estacionamiento vacío \ny lo suficientemente grande para tu automóvil.",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
            
    JOptionPane.showMessageDialog(null,
            "Señaliza tu intención: Utiliza las luces de giro para indicar que planeas estacionarte. \nActiva la luz correspondiente",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
                
    JOptionPane.showMessageDialog(null,
            "Reduce la velocidad: Disminuye la velocidad al acercarte al espacio de estacionamiento\n y mantén una distancia segura con otros vehículos.",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
                    
    JOptionPane.showMessageDialog(null,
            " Gira el volante completamente hacia el lado del espacio de estacionamiento.",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
                        
    JOptionPane.showMessageDialog(null,
            "Retrocede lentamente mientras giras el volante hacia el lado opuesto del espacio de estacionamiento.\n Ajusta el volante para mantener tu posición en el centro del espacio.",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
                           
    JOptionPane.showMessageDialog(null,
            "Cuando el automóvil esté correctamente posicionado en el espacio, endereza el volante y detén el vehículo. \nAsegúrate de dejar suficiente espacio para maniobrar al salir.",
            "Estacionando un auto",
             JOptionPane.INFORMATION_MESSAGE);
                                
            
            }

    @Override
    public void Encender() {
                 JOptionPane.showMessageDialog(null,
            "Guia de como encender un auto",
            "Encendiendo un auto",
             JOptionPane.INFORMATION_MESSAGE);       
        
        
        JOptionPane.showMessageDialog(null,
            " Ingresa y ajusta el asiento: Abre la puerta del conductor y siéntate cómodamente en el asiento. \nAsegúrate de ajustar el asiento de manera que puedas alcanzar fácilmente los pedales y el volante. \nAjusta también los espejos retrovisores para tener una buena visibilidad",
            "Encendiendo un auto",
             JOptionPane.INFORMATION_MESSAGE);
        
                JOptionPane.showMessageDialog(null,
            "Inserta la llave o presiona el botón de encendido: \nSi tu automóvil tiene una llave de encendido, insértala en la ranura correspondiente y gírala en sentido horario hasta la posición ENCENDIDO",
            "Encendiendo un auto",
             JOptionPane.INFORMATION_MESSAGE);
                
            JOptionPane.showMessageDialog(null,
            " Arranca el motor: Una vez que la llave está en la posición correcta o has presionado el botón de encendido, \ngira suavemente la llave en sentido horario o mantén presionado el botón de encendido. \nEsto activará el motor y el automóvil comenzará a funcionar. Si el motor no arranca de inmediato, \npuedes intentar girar la llave nuevamente o verificar que el automóvil esté en \"Neutral",
            "Encendiendo un auto",
             JOptionPane.INFORMATION_MESSAGE);
                        
                                JOptionPane.showMessageDialog(null,
            "",
            "Encendiendo un auto",
             JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
