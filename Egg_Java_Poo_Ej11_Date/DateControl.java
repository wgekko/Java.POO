/*
 ** VER VIDEOS:
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
public class DateControl {

    public Date pedirDatos() {
        Date dato = new Date();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dato dia. ");
        dato.setDate(leer.nextInt());             
        System.out.println("Ingrese el dato mes. ");
        dato.setMonth(leer.nextInt());       
        System.out.println("Ingrese el dato año. ");
        dato.setYear(leer.nextInt());
     
        return dato;
    }

    public static int calcularAnio(Date dato) {

        Date hoy = new Date();
        int diahoy = hoy.getDate();
        int meshoy = hoy.getMonth()-1 ;
        int aniohoy = hoy.getYear()+1900 ;
        int difanios = aniohoy - dato.getYear();
        if (meshoy <= dato.getMonth()) {
            if (meshoy == dato.getMonth()) {
                if (diahoy > dato.getDate()) {
                    difanios--;
                }
            } else {
                difanios--;
            }
        }
        return difanios;
    }

}
