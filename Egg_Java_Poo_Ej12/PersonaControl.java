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

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class PersonaControl {
    Persona persona = new Persona();

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese su fecha de nacimiento (dia)");
        persona.setDia(leer.nextInt());
        System.out.println("Ingrese su fecha de nacimiento (mes)");
        persona.setMes(leer.nextInt());
        System.out.println("Ingrese su fecha de nacimiento (year)");
        persona.setYear(leer.nextInt());
        leer.close();
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        int year = fechaActual.getYear();
        int mes = fechaActual.getMonth();
        int dia = fechaActual.getDate();
        int anios = 0;
        if (mes < persona.getFechaNacimiento().getMonth()) {
            anios = year - persona.getFechaNacimiento().getYear() - 1;
        } else if (mes == persona.getFechaNacimiento().getMonth()) {
            if (dia < persona.getFechaNacimiento().getDate()) {
                anios = year - persona.getFechaNacimiento().getYear() - 1;
            } else {
                anios = year - persona.getFechaNacimiento().getYear();
            }
        } else {
            anios = year - persona.getFechaNacimiento().getYear();
        }
        return anios;
    }

    public boolean menorQue(int edad) {
        if (calcularEdad() < edad) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPersona() {
        String fechaNacimiento;
        System.out.println("---------------------------------------------------------");
        System.out.println("Nombre: " + persona.getNombre());
          System.out.println("---------------------------------------------------------");
        fechaNacimiento = persona.getDia() + "/" + (persona.getMes() + 1) + "/" + (persona.getYear() + 1900);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
          System.out.println("---------------------------------------------------------");
    
}
}