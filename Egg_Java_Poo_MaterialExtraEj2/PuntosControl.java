/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.* 

 */
package Egg_Java_Poo_MaterialExtraEj2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class PuntosControl {

    public Puntos cearPuntos() {

        Puntos punto = new Puntos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x  del punto :");
        punto.setX(leer.nextDouble());
        System.out.println("Ingrese la coordenada y  del punto :");
        punto.setY(leer.nextDouble());

        return punto;
    }

    public void distancia(Puntos punto1, Puntos punto2) {
        DecimalFormat df = new DecimalFormat("###.##");
        double c1 = (punto2.getX() - punto1.getX());
        double c2 = (punto2.getY() - punto1.getY());
        double distancia = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("la distancia ente los puntos es :" + df.format(distancia));

    }

}
