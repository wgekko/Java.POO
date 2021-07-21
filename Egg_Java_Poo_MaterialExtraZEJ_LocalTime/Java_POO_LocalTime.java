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
public class Java_POO_LocalTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DateLocalTimeControl datofecha = new DateLocalTimeControl();
        DateLocalTime fecha = datofecha.perdirDatos();
        // System.out.println(fecha.toString());       
        datofecha.mostrarDatos(fecha);
        System.out.println("\n ----- fin del programa ----");

    }

}
