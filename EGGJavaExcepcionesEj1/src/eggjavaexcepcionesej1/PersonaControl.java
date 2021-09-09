/*
 *  Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
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
package eggjavaexcepcionesej1;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class PersonaControl {

    Persona persona = new Persona();
    double mayores = 0, menores = 0, menosPeso = 0, buenPeso = 0, masPeso = 0;

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Nombre y apellido de la persona ");
        persona.setNombre(leer.nextLine());
        System.out.println("Edad de la persona ");
        persona.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Sexo de la persona ");
        persona.setSexo(leer.nextLine());
        System.out.println("Peso de la persona ");
        persona.setPeso(leer.nextDouble());
        System.out.println("Altura de la persona (formato 1,70) ");
        persona.setAltura(leer.nextDouble());
        return persona;
    }

    public int calcularIMC(Persona per) {
        double imc, peso, altura;
        altura = persona.getAltura();
        peso = persona.getPeso();
        imc = peso / (Math.pow(altura, 2));
        if (imc >= 20 && imc <= 25) {
            return 0;
        } else if (imc < 20) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona per) {
          boolean mayor = false;
           try {
            if (persona.getEdad() > 18) {
              //  return true;
               mayor = true;
                //contMayor++;
            } else {
                //contMenor++;
                return false;
            }            
        } catch (Exception e) {
            System.out.println("La persona recibida no se puede analizar");
        }
        return mayor;
    }
//
//        if (persona.getEdad() >= 18) {
//            return true;
//        } else {
//            return false;
//        }
    }

