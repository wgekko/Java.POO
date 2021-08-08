/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DistPuntosGrafica2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class DistPuntosGrafica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {

        Scanner leer = new Scanner(System.in);
        String dato = "S";
        DistPuntosGrafica.PuntosControl puntoxy = new DistPuntosGrafica.PuntosControl();

        DistPuntosGrafica.Puntos punto1 = puntoxy.crearPuntos();
        DistPuntosGrafica.Puntos punto2 = puntoxy.crearPuntos();

        robotLimpiador();

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        puntoxy.distancia(punto1, punto2);
        puntoxy.tipoRecta(punto1, punto2);

        for (int i = 0; i <= 2; i++) {
            retardarSegundo();
            System.out.println("... Se esta generando el gráfico de distancia entre los puntos......");
            retardarSegundo();
        }
        puntoxy.graficar(punto1, punto2);
        
        System.out.println("\n ----- fin del programa ----");

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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
