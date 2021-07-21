/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg_Java_Poo_MaterialExtraZEJ_LocalTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class DateLocalTimeControl {

    public DateLocalTime perdirDatos() {

        DateLocalTime dato = new DateLocalTime();
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

    public void mostrarDatos(DateLocalTime dato) {

        LocalDate fecha1 = LocalDate.of(dato.getAnio(), dato.getMes(), dato.getDia());
        LocalDate hoy = LocalDate.now();

        System.out.println("fecha  " + fecha1.getDayOfMonth() + "/" + fecha1.getMonth() + "/" + fecha1.getYear());
        System.out.println("actual  " + hoy.getDayOfMonth() + "/" + hoy.getMonth() + "/" + hoy.getYear());

        Period periodo = Period.between(fecha1, hoy);
        System.out.println("la diferencia entre las dos fechas arroja ....");
        System.out.println("la cantidad de años es :" + periodo.getYears());
        System.out.println("la cantidad de meses es :" + periodo.getMonths());
        System.out.println("la cantidad de dias es :" + (periodo.getDays() + 1));
    }
}
