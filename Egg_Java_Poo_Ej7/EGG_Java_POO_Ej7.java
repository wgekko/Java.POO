/*
 ** Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package Egg_Java_Poo_Ej7;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class EGG_Java_POO_Ej7 {
  static double mPeso = 0, bPeso = 0, MPeso = 0;
   static double may = 0, me = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int dato; boolean dato1;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaControl per = new PersonaControl(); // creo un objeto persona 
        Persona per1 = per.crearPersona(); /* System.out.println(per1.toString());*/ 
        dato1=per.esMayorDeEdad( per1); MensajeMEdad(dato1); dato= per.calcularIMC(per1); MensajePeso(dato);  
        Persona per2 = per.crearPersona(); /* System.out.println(per2.toString());*/  
        dato1=per.esMayorDeEdad( per2); MensajeMEdad(dato1); dato= per.calcularIMC(per2); MensajePeso(dato);    
        Persona per3 = per.crearPersona(); /* System.out.println(per3.toString());*/  
        dato1=per.esMayorDeEdad( per3); MensajeMEdad(dato1); dato= per.calcularIMC(per3); MensajePeso(dato); 
        Persona per4 = per.crearPersona();/* System.out.println(per4.toString());*/  
        dato1=per.esMayorDeEdad( per4); MensajeMEdad(dato1); dato= per.calcularIMC(per4); MensajePeso(dato);  
       
         System.out.println("Hay " + may + " mayores, porcentualmente  un ... " + ((may / 4 )* 100) + " %");
        System.out.println("Hay " + me + " menores, porcentualmente  un ... " + ((me / 4) * 100) + " %");
        if (((mPeso / 4 )* 100)>0){
                  System.out.println("Hay " + mPeso + " bajo peso,  porcentualmente  un  ... " + ((mPeso / 4 )* 100) + " %");            
        } else if ((bPeso / 4 * 100)>0){
                        System.out.println("Hay " + bPeso + " peso ideal, porcentualemente  un ... " + (bPeso / 4 * 100) + " %");
        }else if ((MPeso / 4 * 100)>0){
                         System.out.println("Hay " + MPeso + " sobrepeso, porcentualmente  un ... " + (MPeso / 4 * 100) + " %");   
        }
    }
     
    public static void MensajePeso(  int dato ) {           
         //double mPeso = 0, bPeso = 0, MPeso = 0;
           switch (dato) {
            case 0:
                System.out.println("La persona esta en su peso ideal...");
                bPeso+=1;
                break;
            case -1:
                System.out.println("La persona esta por debajo de su peso ideal...");
               mPeso+=1; 
                break;
            case 1:
                System.out.println("La persona esta por encima de su peso ideal...");
                MPeso+=1;
                break;
        }
    }
    
     public static void MensajeMEdad(  boolean dato1 ) {     
          //double may = 0, me = 0;
         if (dato1){
             may+=1;
              System.out.println(" es mayor de edad...");
              
         }else {        
             me+=1;
          System.out.println(" es menor de edad ..."); ;
           
        }
    }
}
