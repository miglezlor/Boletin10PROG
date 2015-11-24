

package boletin101;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin101 {


    public static void main(String[] args) {

        int numero, intentos;
        int i=0;
        Metodos101 obx= new Metodos101();
        numero=obx.getNumero();
        intentos=obx.getIntentos();
        
        obx.xogo(numero, intentos, i);
    }
    
}
