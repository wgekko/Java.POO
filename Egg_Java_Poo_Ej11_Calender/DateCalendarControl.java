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

/**
 *
 * @author WALTER GOMEZ
 */
public class DateCalendarControl {
    
    
    public static int calcularTiempo(int dia, int mes, int anio, boolean incluirdia) {

        Calendar inicioF = Calendar.getInstance(); // ingreso de fecha 
        inicioF.set(anio, mes - 1, dia);
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
    
   public static int calcularAnio(int dia, int mes, int anio) {

        Calendar inicioF = Calendar.getInstance(); // ingreso de fecha 
        inicioF.set(anio, mes - 1, dia);

        Calendar hoy = Calendar.getInstance(); // se crea la fecha de hoy 
        int difAnios = hoy.get(Calendar.YEAR) - inicioF.get(Calendar.YEAR);

        if (inicioF.get(Calendar.DAY_OF_YEAR) > hoy.get(Calendar.DAY_OF_YEAR)) {
            difAnios--;
        }
            return difAnios;
    }
}
