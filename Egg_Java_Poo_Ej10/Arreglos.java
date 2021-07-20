/*
 *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package Egg_Java_Poo_Ej10;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

/**
 *
 * @author WALTER GOMEZ
 */
public class Arreglos {
    
     public static double[] llenarVector(double[] vector, int longitud) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("###.##", decimalFormatSymbols);
         Arreglos vectorA[] = new Arreglos[50];
        for (int i = 0; i < longitud; i++) {
            vector[i] = Double.parseDouble(decimalFormat.format((Math.random() *10-1)+1));
        }
        return vector;
    }

    public static double[] ordenarVector(double[] vector) {
        Arrays.sort(vector);
        return vector;
    }
    public static void mostrarVector(double [] vector ){
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        vectorA = llenarVector(vectorA, 50);
        System.out.println(Arrays.toString(vectorA));
        vectorA = ordenarVector(vectorA);
        System.out.println(Arrays.toString(vectorA));
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            }
            if (i >= 10 && i < 20) {
                vectorB[i] = 0.50;
            }
        }
        System.out.println("El vector A");
        System.out.println(Arrays.toString(vectorA));
        System.out.println("El vector B");
        System.out.println(Arrays.toString(vectorB));
        
    }
}

