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

/**
 *
 * @author WALTER GOMEZ
 */
public class Persona {
      private String nombre;
    private int dia;
    private int mes;
    private int year;

    public Persona() {

    }

    public Persona(String nombre, int dia, int mes, int year) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = (mes - 1);
        this.year = (year - 1900);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = (mes - 1);
    }

    public void setYear(int year) {
        this.year = (year - 1900);
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getYear() {
        return this.year;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Date getFechaNacimiento() {
        Date fecha = new Date(this.year, this.mes, this.dia);
        return fecha;
    }
    
    
}
