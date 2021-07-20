/*
 * VER VIDEOS:
Clase Date
Ver más acerca de la clase Date
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package Egg_Java_Poo_Ej11_Date;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia = -1, mes = -1, anio = 999;

        while (dia <= 0 || dia >= 31) {
            System.out.println("Ingrese el dia : ");
            dia = leer.nextInt();
        }

        while (mes <= 0 || mes >= 12) {
            System.out.println("Ingrese el mes : ");
            mes = leer.nextInt();
        }
        while (anio < 1000 || anio >= 2100) {
            System.out.println("Ingrese el año : ");
            anio = leer.nextInt();
        }
        DateControl fecha1 = new DateControl();
        Date fecha2 = new Date();
        System.out.println(" fecha ingresada es dia: " + dia + "/" + mes + "/" + anio + " - ");
        System.out.println(" la fecha de hoy es : " + fecha2.getDate() + "/" + (fecha2.getMonth() + 1) + "/" + (fecha2.getYear() + 1900) + " - ");
        System.out.println(" los años transcurridos desde la fecha ingresada es :" + fecha1.calcularAnio(dia, mes, anio) + " años");
        System.out.println("\n ----- fin del programa ----");
    }

}
