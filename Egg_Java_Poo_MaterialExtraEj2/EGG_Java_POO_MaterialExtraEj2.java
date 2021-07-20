/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
 */
package Egg_Java_Poo_MaterialExtraEj2;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_MaterialExtraEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PuntosControl puntoxy = new PuntosControl();

        Puntos punto1 = puntoxy.cearPuntos();
        Puntos punto2 = puntoxy.cearPuntos();
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        
        puntoxy.distancia(punto1, punto2);
        System.out.println("\n ----- fin del programa ----");
        
    }

}
