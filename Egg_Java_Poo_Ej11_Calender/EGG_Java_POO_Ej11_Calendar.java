/*
 * * VER VIDEOS:
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
package Egg_Java_Poo_Ej11_Calender;

//import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej11_Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");  
        
        DateCalendarControl datofecha = new DateCalendarControl();
        DateCalendar fecha = datofecha.pedirDatos();
        Calendar fecha2 = Calendar.getInstance();
        System.out.println(" fecha ingresada es dia: " + fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio() + " - ");
        //System.out.println(sdf.format(fecha));
        System.out.println(" la fecha de hoy es : " + fecha2.get(Calendar.DATE) + "/" + (fecha2.get(Calendar.MONTH) + 1) + "/" + fecha2.get(Calendar.YEAR) + " - ");
         //System.out.println(sdf.format(fecha2));
        System.out.println(" los años transcurridos desde la fecha ingresada  hasta hoy es :  " + datofecha.calcularAnio(fecha) + " años");
        System.out.println(" los días transcurridos desde la fecha ingresada  hasta hoy es :  " + datofecha.calcularTiempo(fecha, true) + " días");
        System.out.println("\n ----- fin del programa ----");

    }

}
