/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 
 */
package Egg_Java_Poo_Ej8;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaControl cadena = new CadenaControl();
        System.out.println("Ingrese la frase");
        cadena.crearFrase(leer.nextLine());
         System.out.println("La cantidad de vocales que tiene es: "+cadena.mostrarVocales());
        System.out.println("La frase invertida es: " + cadena.invertirFrase());
        System.out.println("La letra  (a) se repite: " + cadena.vecesRepetido("a"));
        System.out.println("Ingrese palabra a comparar longitud");
        cadena.compararLongitud(leer.nextLine());
         System.out.println("Ingrese palabra/frase  a unir");
         cadena.unirFrases(leer.nextLine());
        System.out.println("Ingrese  el carácter que desea colocar");
        cadena.reemplazar(leer.nextLine());
        System.out.println("Ingrese la letra que desea buscar");
        if (cadena.contiene(leer.nextLine())) {
            System.out.println("Si la contiene");
        } else {
            System.out.println("No la contiene");
        }
        System.out.println("   -----   Fin del Programa   -----   ");
        leer.close();
}
}