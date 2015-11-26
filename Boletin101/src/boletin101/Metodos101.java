package boletin101;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos101 {

    private int numero, intentos;

    public int getNumero() {
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Jugador1, introduce el numero para adivinar"));
        } while (numero < 1 | numero > 50);
        return numero;
    }

    public int getIntentos() {
        do {
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Jugador1, numero maximo de intentos"));
        } while (intentos <= 0);
        return intentos;

    }

    public void xogo(int numero, int intentos, int i) {
        for (i = 0; i < intentos; i++) {
            int numIntento = Integer.parseInt(JOptionPane.showInputDialog("Jugador2, intenta adivinar"));
            if (numIntento != numero) {
                if (numIntento < numero) {
                    imprimir("El numero es mayor", 0);
                } else {
                    imprimir("El numero es menor", 0);
                }
            } else {
                imprimir("Acertaste!", 0);
                break;
            }
        }

    }
    public void imprimir (String cadenaAImprimir, int opcion){
        
            JOptionPane.showMessageDialog(null, cadenaAImprimir);
        }

}
