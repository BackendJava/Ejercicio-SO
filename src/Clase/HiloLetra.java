
package Clase;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class HiloLetra implements Runnable {

    private JLabel labelLetra;
    private ArrayList<String> alzabeto;
    private String letra;
    private int posicionLetra, size;

    public HiloLetra(JLabel labelLetra) {
        this.labelLetra = labelLetra;
        alzabeto = new ArrayList<String>();
        alzabeto.add("a");
        alzabeto.add("b");
        alzabeto.add("b");
        alzabeto.add("c");
        alzabeto.add("d");
        alzabeto.add("e");
        alzabeto.add("f");
        alzabeto.add("g");
        alzabeto.add("h");
        alzabeto.add("i");
        alzabeto.add("j");
        alzabeto.add("k");
        alzabeto.add("l");
        alzabeto.add("m");
        alzabeto.add("n");
        alzabeto.add("o");
        alzabeto.add("p");
        alzabeto.add("q");
        alzabeto.add("r");
        alzabeto.add("s");
        alzabeto.add("t");
        alzabeto.add("u");
        alzabeto.add("v");
        alzabeto.add("w");
        alzabeto.add("x");
        alzabeto.add("y");
        alzabeto.add("z");
        this.size = alzabeto.size();
    }

    public void setLetra(String letra) {
        if ("".equals(letra)) {
            this.posicionLetra = alzabeto.indexOf("a");
        } else {
            this.letra = letra;
            this.posicionLetra = alzabeto.indexOf(letra);
        }

    }

    @Override
    public void run() {
        try {
            while (this.posicionLetra < this.size) {
                labelLetra.setText(alzabeto.get(this.posicionLetra));
                this.posicionLetra++;
                Thread.sleep(1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloLetra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
