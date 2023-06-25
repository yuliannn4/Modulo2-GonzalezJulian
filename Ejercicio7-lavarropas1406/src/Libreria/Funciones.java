
package Libreria;


public class Funciones {
    
    private int kilos =0 , llenadoCompleto= 0,TipoDeRopa = 0,LavadoCompleto = 0,SecadoCompleto =0, Planchado=0, Capacidad=0, fin=0;
   
    //contrustor 
    public Funciones (int kilos,int tipoderopa, int capacidad){
        this.kilos = kilos;
        this.TipoDeRopa = tipoderopa;
        this.Capacidad = capacidad;
    }

   
    
    //metodos
    private void llenado(){
        if(kilos <= Capacidad ){
            llenadoCompleto = 1;
            System.out.println("Llenado......");
            System.out.println("Llenado Completo");             
        } else {
            System.out.println("La carga para este modelo es mucha, saque ropa por favor\nMostrando ficha tecnica");
        
        }
    
    }

    public int getKilos() {
        return kilos;
    }

    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    public int getTipoDeRopa() {
        return TipoDeRopa;
    }

    public int getLavadoCompleto() {
        return LavadoCompleto;
    }

    public int getSecadoCompleto() {
        return SecadoCompleto;
    }

    public int getPlanchado() {
        return Planchado;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public int getFin() {
        return fin;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    public void setTipoDeRopa(int TipoDeRopa) {
        this.TipoDeRopa = TipoDeRopa;
    }

    public void setLavadoCompleto(int LavadoCompleto) {
        this.LavadoCompleto = LavadoCompleto;
    }

    public void setSecadoCompleto(int SecadoCompleto) {
        this.SecadoCompleto = SecadoCompleto;
    }

    public void setPlanchado(int Planchado) {
        this.Planchado = Planchado;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }//ejercicio10
    
    
    private void lavado(){
        llenado();
            if (llenadoCompleto == 1){
                switch (TipoDeRopa){
                    case 0: System.out.println("Ropa Blanca - Lavado SUAVE ");
                            System.out.println("Lavando.....");
                            System.out.println("Lavado completo");
                            LavadoCompleto = 1;
                    break;
                    case 1 :System.out.println("Ropa Color - Lavado Intenso ");
                            System.out.println("Lavando....");
                            System.out.println("Lavado completo");
                            LavadoCompleto = 1;
                    break;
                    case 2 :System.out.println("Lana - Lavado delicado ");
                            System.out.println("Lavando....");
                            System.out.println("Lavado completo");
                            LavadoCompleto = 1;
                    break;
                    case 3 :System.out.println("Ropa muy sucia - Lavado extremo ");
                            System.out.println("Lavando....");
                            System.out.println("Lavado completo");
                            LavadoCompleto = 1;
                    break;
                    case 4 :System.out.println("Economico - Lavado rápido ");
                            System.out.println("Lavando....");
                            System.out.println("Lavado completo");
                            LavadoCompleto = 1;
                    break;
                    case 5 :System.out.println("Ropa bebe - Lavado delicado, temperatura alta ");
                            System.out.println("Lavando....");
                            System.out.println("Lavado completo");
                            LavadoCompleto = 1;
                    break;
                } 
    }
          }
        
    private void secado(){
        lavado();
        if (LavadoCompleto == 1){
            System.out.println("Secando.....");
            System.out.println("SECO");
            SecadoCompleto = 1;       
        }
        
    
    }
    public void ciclofinalizado(){
        secado();
        if (SecadoCompleto ==1) {
              System.out.println("Tu ropa se encuentra seca");
        
        Planchado = 1;
        }
              
    
    }
    public void planchado() {
         ciclofinalizado();
         if (Planchado ==1){
        System.out.println("Realizando el proceso de planchado...");
        System.out.println("ROPA PLANCHADA");
        fin = 1;
     }
     }
    
    public void fin (){
        planchado();
        if (fin ==1){
        System.out.println("Proceso terminado.\nMostando ficha tecnica:");
        }
    }
    
}
