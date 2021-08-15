/*
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package egg_1colection_meej1;

import egg_1colection_MEEj1_servicio.ServicioNumero;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
     
        ServicioNumero numero = new ServicioNumero();        
        numero.agregarNro();
        robotLimpiador();System.out.println("\n\n ");
        retardarSegundo();
        numero.mostrarNro();
         retardarSegundo();
        numero.calcularProm();
    }
     public static void robotLimpiador() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    }

    private static void retardarSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
    
}
