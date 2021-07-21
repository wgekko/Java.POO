/*
 *  *  VER VIDEOS:
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

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class DateCalendarControl {
    
     public DateCalendar pedirDatos() {
         
         DateCalendar dato = new DateCalendar();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dato dia. ");
        dato.setDia(leer.nextInt());
        while (dato.getDia() <= 0 || dato.getDia() > 31) {
            System.out.println("ERROR, Ingrese el dato dia nuevamente.... ");
            dato.setDia(leer.nextInt());
        }        
        System.out.println("Ingrese el dato mes. ");
        dato.setMes(leer.nextInt());
         while (dato.getMes() <= 0 || dato.getMes() > 12) {
            System.out.println("ERROR, Ingrese el dato mes nuevamente.... ");
            dato.setMes(leer.nextInt());
        }        
        System.out.println("Ingrese el dato año. ");
        dato.setAnio(leer.nextInt());
         while (dato.getAnio() <= 990 || dato.getAnio() > 2100) {
            System.out.println("ERROR, Ingrese el dato año nuevamente.... ");
            dato.setAnio(leer.nextInt());
        }       

        return dato;
    }
     
     public static int calcularAnio(DateCalendar dato) {

        Calendar inicioF = Calendar.getInstance(); // ingreso de fecha 
        inicioF.set(dato.getAnio(), dato.getMes() - 1, dato.getDia());

        Calendar hoy = Calendar.getInstance(); // se crea la fecha de hoy 
        int difAnios = hoy.get(Calendar.YEAR) - inicioF.get(Calendar.YEAR);

        if (inicioF.get(Calendar.DAY_OF_YEAR) > hoy.get(Calendar.DAY_OF_YEAR)) {
            difAnios--;
        }
            return difAnios;
    }
    
    public static int calcularTiempo(DateCalendar dato, boolean incluirdia) {

        Calendar inicioF = Calendar.getInstance(); // ingreso de fecha 
        inicioF.set(dato.getAnio(), dato.getMes() - 1, dato.getDia());
        inicioF.set(Calendar.HOUR,0); inicioF.set(Calendar.HOUR_OF_DAY,0);
        inicioF.set(Calendar.MINUTE,0); inicioF.set(Calendar.SECOND,0);              

        Calendar hoy = Calendar.getInstance(); // se crea la fecha de hoy 
         hoy.set(Calendar.HOUR,0); hoy.set(Calendar.HOUR_OF_DAY,0);
        hoy.set(Calendar.MINUTE,0); hoy.set(Calendar.SECOND,0);       
        
        long finMS = hoy.getTimeInMillis(); long inicioMS = inicioF.getTimeInMillis();
        
        int dias = (int) ((Math.abs(finMS-inicioMS))/(1000*60*60*24));
        if (incluirdia == true){
            dias++;
        }
        
      return dias;
    }
}
