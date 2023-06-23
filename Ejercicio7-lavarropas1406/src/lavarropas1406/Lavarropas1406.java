
package lavarropas1406;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Libreria.Funciones;
import Libreria.FichaTecnica;

public class Lavarropas1406 {

    public static void main(String[] args) {
       ImageIcon inicio = new ImageIcon("src/imagenes/lavar.png");
       ImageIcon img1 =  new ImageIcon("src/imagenes/color66.png");
       ImageIcon peso =  new ImageIcon("src/imagenes/peso.png");
       ImageIcon mod0 =  new ImageIcon("src/imagenes/mod0.jpg");
       ImageIcon mod1 =  new ImageIcon("src/imagenes/mod1.jpg");
       ImageIcon mod2 =  new ImageIcon("src/imagenes/mod2.jpg");
       ImageIcon portada =  new ImageIcon("src/imagenes/portada.png");
       ImageIcon tela =  new ImageIcon("src/imagenes/tela.png");

       
       
    String marca="";
    String modelo="";
    String tipoDeCarga="";
    String color="";
    int capacidad=0;
    int velocidad=0;
    String eficiencia="";
    String medidas="";
       
      //seleccionamos  el lavarropas  
      Object [] lavaropas = {"CONCEPT 5.05 V1","NEXT 6.06 ECO","NEXT 10.12 WCRG ECO"};
        int lavarropaelegido = JOptionPane.showOptionDialog(null,
                    "",
                    "Seleccion de lavarropas",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    portada,
                    lavaropas,
                    lavaropas[2]);
       
       
        
        //damos valores a las variables con Switch
        
        switch(lavarropaelegido){
            case 0 :marca = "DREAN";
                    modelo= "CONCEPT 5.05 V1";
                    tipoDeCarga= "Superior";
                    color = "Blanco";
                    capacidad = 5;
                    velocidad = 500;
                    eficiencia = "B";
                    medidas = "Alto: 94,00 cm\n" +"Ancho: 54,00 cm\n" +"Profundidad: 54,00 cm\n" +"Peso: 33,60 kg";
            JOptionPane.showMessageDialog(null, 
            "Bienvenido a tu Lavarropas",
            "CONCEPT 5.05 V1",
            JOptionPane.INFORMATION_MESSAGE,
            mod0);
       
        break;
            case 1 :marca="DREAN";
                    modelo="NEXT 6.06 ECO";
                    tipoDeCarga="Frontal";
                    color="Blanco";
                    capacidad=6;
                    velocidad=600;
                    eficiencia="A+";
                    medidas="Alto: 85,00 cm\n" +"Ancho: 59,50 cm\n" +"Profundidad: 50,00 cm\n" +"Peso: 60,70 kg";
            JOptionPane.showMessageDialog(null, 
            "Bienvenido a tu Lavarropas",
            "NEXT 6.06 ECO",
            JOptionPane.INFORMATION_MESSAGE,
            mod1);
        break;
            case 2 :marca="Drean";
                    modelo="NEXT 10.12 WCRG ECO";
                    tipoDeCarga= "Superior";
                    color= "Plateado";
                    capacidad= 10;
                    velocidad=1200;
                    eficiencia="A+++";
                    medidas= "Alto: 85,00 cm\n" +"Ancho: 59,50 cm\n" +"Profundidad: 65,00 cm\n" +"Peso: 72,00 kg";
            JOptionPane.showMessageDialog(null, 
            "Bienvenido a tu Lavarropas",
            "NEXT 10.12 WCRG ECO",
            JOptionPane.INFORMATION_MESSAGE,
            mod2);
        break;
                    }

       

       
        Object[] opciones = {"Color", "Blanca", "Lana", "Ropa Muy Sucia", "Económico", "Ropa de bebé"};
            int tipoderopa = JOptionPane.showOptionDialog(null,
                    "",
                    "Seleccion de modo",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    tela,
                    opciones,
                    opciones[0]);       
        
        String peso2 = (String) JOptionPane.showInputDialog (null,
                "Solo numeros",
                "Peso de la ropa",
                JOptionPane.QUESTION_MESSAGE,
                peso,
                null,
                "");
                
        int  kilos = Integer.parseInt(peso2);   
 
        
        Funciones MSG = new Funciones(kilos,tipoderopa,capacidad);
       
        MSG.fin();
        
        FichaTecnica datos = new FichaTecnica(marca,modelo,tipoDeCarga,color,capacidad,velocidad,eficiencia,medidas);
              
        datos.MostrarFicha();
        
    }
    
}
