/*
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package egg_1colection_meej1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
     
          List<Integer> numeros = new ArrayList<Integer>();
        int suma = 0;
        int cantidadNumeros = 0;
        for (int i = 0; i < 15; ++i) {
            numeros.add(i * 5);
            suma += numeros.get(i);
            cantidadNumeros++;
        }
        System.out.println(numeros);
        System.out.println("La suma es: " + suma);
        //System.out.println("El promedio es: " + suma / cantidadNumeros);
        System.out.println("El promedio es: " + suma / numeros.size());
    
}
}