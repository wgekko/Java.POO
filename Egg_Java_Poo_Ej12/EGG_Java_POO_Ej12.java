/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
21
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Egg_Java_Poo_Ej12;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
                System.out.println("Ingrese la edad a comprar ......"); 
        edad=leer.nextInt();  
        PersonaControl persona = new PersonaControl();
        persona.crearPersona();
        System.out.println(persona.calcularEdad());     
        if (persona.menorQue(edad) == false) {
            System.out.println("-------------------------------------------------------------");
            System.out.println(" La edad a comparar es: " +edad+ " -  SI  es menor que " + persona.calcularEdad());
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println(" La edad a comprar es : " +edad+" -  NO es menor que.... " + persona.calcularEdad());
        }
        persona.mostrarPersona();
    }
}
