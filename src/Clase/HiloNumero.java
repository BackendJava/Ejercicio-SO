
package Clase;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloNumero implements Runnable {

    private JLabel labelNumero;
    private int contador;

    public HiloNumero(JLabel labelNumero) {
        this.labelNumero = labelNumero;
    }
    
    public void setContador(int numero){
        this.contador = numero;
    }
    public int getContador(){
        return this.contador;
    }
    
    @Override
    public void run() {
        try {
            while (contador <= 100) {
                labelNumero.setText("" + contador);
                contador++;
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloNumero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
