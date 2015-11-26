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
            numero =(introducir("Jugador1, introduce el numero para adivinar"));
        } while (numero < 1 | numero > 50);
        return numero;
    }

    public int getIntentos() {
        do {
            intentos = (introducir("Jugador1, numero maximo de intentos"));
        } while (intentos <= 0);
        return intentos;

    }

    public void xogo(int numero, int intentos, int i) {
        for (i = 0; i < intentos; i++) {
            int numIntento = (introducir("Jugador2, intenta adivinar"));
            if (numIntento != numero) {
                if (numIntento < numero) {
                    imprimir("El numero es mayor");
                } else {
                    imprimir("El numero es menor");
                }
            } else {
                imprimir("Acertaste!");
                break;
            }
        }

    }

    public void imprimir(String cadenaAImprimir) {
        JOptionPane.showMessageDialog(null, cadenaAImprimir);
    }

    public int introducir(String pregunta) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(pregunta));
        return dato;
    }

}
