
package ejercicio3.cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class CuentaBancaria {
    // Creo los atributos en privado
    private String nombreTitular;
    private String tipoDeCuenta;
    private int saldo;
    String mensaje;

    public CuentaBancaria(String nombreTitular, String tipoDeCuenta, int saldo) {
        this.nombreTitular = nombreTitular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }//ejercicio5

    public void informacionCuenta() {
         mensaje = "Nombre del Titular: " + nombreTitular + "\nTipo de cuenta: " + tipoDeCuenta + "\nSaldo actual: " + saldo;

        JOptionPane.showMessageDialog(null,
                mensaje,
                "Datos de la cuenta",
                JOptionPane.INFORMATION_MESSAGE,
                null);
        impresion();
    }//arroja los datos obtenidos de la tarjeta 
    
    public void impresion() {
    int eleccion = JOptionPane.showOptionDialog(
                null,
                "¿Desea imprimir información en pantalla?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);

        switch (eleccion) {
            case JOptionPane.YES_OPTION:
                System.out.println(mensaje);
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Saliendo...");
                break;
        }
    }//consulta si quiere imprimir en pantalla 
    
    public void extraer() {
    String ingreso = JOptionPane.showInputDialog(null,
            "Ingrese el monto a extraer",
            "Extracción",
            JOptionPane.QUESTION_MESSAGE);
    
 
        int montoIngresado = Integer.parseInt(ingreso);

        if (montoIngresado < saldo) {
            saldo -= montoIngresado;
            mensaje = ("Su saldo actual es de: $" + saldo);
            JOptionPane.showMessageDialog(null,
                    mensaje,
                    "Datos de la cuenta",
                    JOptionPane.INFORMATION_MESSAGE,
                    null);
            
            impresion();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Su saldo actual no permite realizar la transacción. \nPor favor, ingrese un número menor",
                    "Datos de la cuenta",
                    JOptionPane.INFORMATION_MESSAGE,
                    null);
        }
   
}//codigo para extraer dinero, intente con double pero no me salio para nada 
    
     public void ingreso() {
    
         String ingreso = JOptionPane.showInputDialog(null,
            "Ingrese los billetes",
            "Deposito",
            JOptionPane.QUESTION_MESSAGE);
                    int montoIngresado = Integer.parseInt(ingreso);

        
            saldo += montoIngresado;
            
            mensaje = ("Usted ingreso: $"+montoIngresado+"\nSu saldo actual es de: $" + saldo);
            
            JOptionPane.showMessageDialog(null,
                    mensaje,
                    "Datos de la cuenta",
                    JOptionPane.INFORMATION_MESSAGE,
                    null);
            
            impresion();
      
        }
   
}   
    
