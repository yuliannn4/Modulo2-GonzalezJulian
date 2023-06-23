
package ejercicio3.cajero;

import javax.swing.JOptionPane;


public class Ejercicio3Cajero {


    public static void main(String[] args) {        

        String nombreTitular = "";
        String tipoDeCuenta = "";
        int saldo = 0;
        double montoIngresado;
        String mensaje;
        int eleccion;

        // Bienvenida al cajero
        JOptionPane.showMessageDialog(null,
                "Bienvenido, introduzca su tarjeta",
                "Banco CFP32",
                JOptionPane.INFORMATION_MESSAGE,
                null);

        // Datos obtenidos de la tarjeta
                nombreTitular = "Karen Mach";
                tipoDeCuenta = "Caja de ahorro";
                saldo = 10000;
                        
            CuentaBancaria cuenta = new CuentaBancaria(nombreTitular, tipoDeCuenta, saldo);

        // Creo un objeto del tipo vector para mostrar las opciones que hay disponibles en mi cajero
        
        Object[] operacion = {"Informacion de la cuenta", "Depositar", "Extraer"};
        eleccion = JOptionPane.showOptionDialog(null,
                "Elija la operacion a realizar",
                "Operaciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                operacion,
                operacion[0]);

        switch (eleccion) {
            case 0:
                cuenta.informacionCuenta();
                break;
            case 1:
                cuenta.ingreso();
                break;
            case 2:
                cuenta.extraer();
                break;
        }


    }
}
