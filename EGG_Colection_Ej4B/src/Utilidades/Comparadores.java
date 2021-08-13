/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
 */
package Utilidades;

import egg_colection_Ej4B_entidades.Pelicula;
import java.util.Comparator;
/**
 *
 * @author WALTER GOMEZ
 */
public class Comparadores {
    
    //Comparator con su declaracion estandar
    //Compara las películas por titulo, alfabéticamente.
    public static Comparator<Pelicula> porTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };

//Comparadores declarados con expresion Lambda
    //Compara las películas de acuerdo a su duración de mayor a menor.        
    public static Comparator<Pelicula> porDuracionMayor = (Pelicula o1, Pelicula o2) -> o2.getDuracionHs().compareTo(o1.getDuracionHs());
    //Compara las películas de acuerdo a su duración de menor a mayor.
    public static Comparator<Pelicula> porDuracionMenor = (Pelicula o1, Pelicula o2) -> o1.getDuracionHs().compareTo(o2.getDuracionHs());
    //Compara Peliculas por el Director, alfabeticamente.
    public static Comparator<Pelicula> porDirector = (Pelicula o1, Pelicula o2) -> o1.getDirector().compareTo(o2.getDirector());
    
}
