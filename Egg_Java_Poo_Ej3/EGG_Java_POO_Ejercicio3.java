/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
17
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package Egg_Java_Poo_Ej3;
;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author walter
 */
public class EGG_Java_POO_Ejercicio3 {
    public static void main(String[] args) {
     DecimalFormat df = new DecimalFormat("###.##");
       int n1; int n2; 
       Scanner leer = new Scanner (System.in);
       
        do{   
    
        System.out.println("Ingrese el 1er. número :");
        n1 = leer.nextInt();
         System.out.println("Ingrese el 2do. número :");
        n2 = leer.nextInt();
        
        }while (n1< 0 || n2<0 );
        Operacion calculo  = new Operacion(n1,n2);
         calculo.crearOperacion(n1,n2);
        System.out.println("El 1er. numero ingresado es :"+calculo.getNumero1());
        System.out.println("El 2do. numero ingresado es :"+calculo.getNumero2());
        System.out.println("La suma es igual a : "+ df.format(calculo.getSumar()));
        System.out.println("La resta es igual a : "+ df.format(calculo.getRestar()));
        System.out.println("La resta es igual a : "+ df.format(calculo.getMultiplicacion()));
        System.out.println("La resta es igual a : "+ df.format(calculo.getDivision()));
    }
}
