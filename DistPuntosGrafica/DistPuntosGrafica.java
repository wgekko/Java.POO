/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
 */
package DistPuntosGrafica;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class DistPuntosGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Scanner leer = new Scanner(System.in);
        String dato = "S";
        PuntosControl puntoxy = new PuntosControl();

        Puntos punto1 = puntoxy.crearPuntos();
        Puntos punto2 = puntoxy.crearPuntos();

        robotLimpiador();

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        puntoxy.distancia(punto1, punto2);
        puntoxy.tipoRecta(punto1, punto2);

        System.out.println("Desea graficar la distancia entre los puntos SI=S/NO=N......");
        dato = leer.nextLine().toUpperCase().trim();
        if (dato.equalsIgnoreCase("S")) {
            puntoxy.graficar(punto1, punto2);
        } else {
            System.out.println("\n ----- fin del programa ----");
        }
        System.out.println("\n ----- fin del programa ----");

    }

    public static void robotLimpiador() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    }
}
