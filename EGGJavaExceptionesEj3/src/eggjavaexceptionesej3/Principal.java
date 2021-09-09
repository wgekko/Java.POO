/*
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package eggjavaexceptionesej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        try {
            int n1, n2;
            System.out.println("Ingrese primer valor entero (dividendo):");
            n1 = leer.nextInt();
            System.out.println("Ingrese segundo valor entero (divisor):");
            n2 = leer.nextInt();
            int div = n1 / n2;
            System.out.println("La división de " + n1 + " / " + n2 + " es " + div+"\n");
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente números enteros");
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir por cero");
        }
    }  
    }
    

