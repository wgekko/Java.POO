/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package egg_6coection_ej5b;

import egg_6coection_ej5b_servicios.ServicioPaises;
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

        ServicioPaises country = new ServicioPaises();
        country.crearListPaises();
         robotLimpiador();  System.out.println("\n\n");          
        country.buscarEliminar();
    }
    
    public static void robotLimpiador() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    }

}
