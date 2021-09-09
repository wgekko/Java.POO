/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La 
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene 
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la 
computadora debe decirle al usuario si el número que tiene que adivinar es mayor 
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe 
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado 
adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se 
debe contar el carácter fallido como un intento
 */
package eggjavaexcepcionese4;

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

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int adivina = (int) (Math.random() * 500 + 1);
        int intento = 0, cont = 0;

        System.out.println(adivina);

        do {
            try {
                System.out.println("Ingrese el número que desea adivinar .....");
                cont++;
                intento = leer.nextInt();
            } catch (RuntimeException e) {
                System.out.println("Error , ha ingresado el dato en forma incorrecta....");
                System.out.println(e.toString());
                break;
            }
            if (intento == adivina) {
                System.out.println("!!!............GANASTE............!!!");

            } else if (intento > adivina) {
                System.out.println("el número ingresado esta por sobre el valor a adivinar...");
            } else if (intento < adivina) {
                System.out.println("el valor ingresado esta por debajo del valor a adviniar ...");
            }
        } while (intento != adivina);

        System.out.println(" los intentos  fueron ...." + cont);

    }

}
