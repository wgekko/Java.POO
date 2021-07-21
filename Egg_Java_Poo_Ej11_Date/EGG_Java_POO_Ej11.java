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
import java.text.SimpleDateFormat;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        DateControl datofecha = new DateControl();
        Date fecha = datofecha.pedirDatos();
        Date fecha2 = new Date();
        //System.out.println(" fecha ingresada es dia: "+sdf.format(fecha));        
        System.out.println(" fecha ingresada es dia: " + fecha.getDate() + "/" + (fecha.getMonth()) + "/" + (fecha.getYear()) + " - ");
        System.out.println(" la fecha de hoy es : " + fecha2.getDate() + "/" + (fecha2.getMonth() + 1) + "/" + (fecha2.getYear() + 1900) + " - ");
        System.out.println(" los años transcurridos desde la fecha ingresada es :" +datofecha.calcularAnio(fecha) + " años");
        System.out.println("\n ----- fin del programa ----");
    }
}
