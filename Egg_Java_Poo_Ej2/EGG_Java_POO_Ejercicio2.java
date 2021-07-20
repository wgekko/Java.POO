/*
 *  POO Ejercicio # 2 
Declarar una clase llamada Circunsferencia que tenga como atributo 
privado el RADIO de tipo real. A continuación, de deben crear los siguiente 
métodos
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunsferencia.
c) Método para crear Circunsferenia(): que pida el radio y lo guarda 
en el atriuto del objeto 
d) Método area(): para calcular el +area de la circunsferencia  ()AREA= PI * RADIO ^2)
e) Método perimetro(): para calcular el perímetro (PERIMETRO = 2 * PI * RADIO)

 */
package Egg_Java_Poo_Ej2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat("###.##");
       double radio=0; 
       Scanner leer = new Scanner (System.in);
        do{
        System.out.println("Ingrese el valor del Radio");
        radio = leer.nextDouble();
        }while(radio <= 0 );   
        Circunferencia circulo = new Circunferencia();
         circulo.crearCircunferencia(radio);
        System.out.println("el radio ingresado es :"+circulo.getRadio());
        System.out.println("el area de la circunsferencia..."+ df.format(circulo.getArea()));
        System.out.println("el perímetro de la circunsferencia..."+ df.format(circulo.getPerimetro()));
    }
    
}
