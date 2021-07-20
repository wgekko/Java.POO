/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Ejemplo vector como atributo: VectorAtributo
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
25
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package Egg_Java_Poo_MaterialExtraEj6;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class AhorcadoControl {
     Ahorcado ahorcado = new Ahorcado();

    public void crearJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de turnos maximos");
        int turnos = leer.nextInt();
        char[] palabraAhorcado = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraAhorcado[i] = palabra.charAt(i);
        }
        ahorcado.setPalabra(palabraAhorcado);
        ahorcado.setCantidadLetrasEncontradas(0);
        ahorcado.setCantidadTurnosRestantes(turnos);
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().size());
    }

    public void buscarLetra() {
        Scanner leer = new Scanner(System.in);
        int encontrado = 0;
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
        if (encontradas(letra)) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            for (int i = 0; i < ahorcado.getPalabra().size(); i++) {
                if (ahorcado.getPalabra().elementAt(i).toString().charAt(0) == letra) {
                    encontrado += 1;
                }
            }
            ahorcado.setCantidadLetrasEncontradas(ahorcado.getCantidadLetrasEncontradas() + encontrado);
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            ahorcado.setCantidadTurnosRestantes(ahorcado.getCantidadTurnosRestantes() - 1);
        }
        System.out.println("Numero de letras(encontradas, faltantes): (" + ahorcado.getCantidadLetrasEncontradas()
                + ", " + (ahorcado.getPalabra().size() - ahorcado.getCantidadLetrasEncontradas()) + ")");

    }

    public boolean encontradas(char letra) {
        for (int i = 0; i < ahorcado.getPalabra().size(); i++) {
            if (ahorcado.getPalabra().elementAt(i).toString().charAt(0) == letra) {
                return true;
            }
        }
        return false;
    }

    public int intentos() {
        return ahorcado.getCantidadTurnosRestantes();
    }

    public void juego() {
        crearJuego();
        while (intentos() > 0) {
            buscarLetra();
            longitud();
            System.out.println("Numero de oportunidades restantes: " + intentos());
            if (intentos() > 1 && ahorcado.getCantidadLetrasEncontradas() == ahorcado.getPalabra().size()) {
                System.out.println("Ha ganado.....!!!!!!!!");
                break;
            }
            if (intentos() == 0) {
                System.out.println("Ahorcado..........!!!!!");
                break;
            }
        }
    }
    
}
