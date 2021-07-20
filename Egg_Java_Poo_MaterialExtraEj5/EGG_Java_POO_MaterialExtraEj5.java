/*
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package Egg_Java_Poo_MaterialExtraEj5;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_MaterialExtraEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        System.out.println("Intente adivinar el mes");
        String m = leer.next().toLowerCase().trim();
        
        Meses mes = new Meses();
        if (m.equalsIgnoreCase(Meses.getMes())) {
            System.out.println("Ha acertado");
        } else {
            while (!m.equals(Meses.getMes())) {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
                m = leer.next().toLowerCase().trim();         
                }
             System.out.println("Ha acertado");
            }
          System.out.println("   -----   Fin del programa   -----   ");
        }
     
    }
 
