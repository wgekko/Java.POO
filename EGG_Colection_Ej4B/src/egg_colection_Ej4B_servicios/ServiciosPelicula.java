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
package egg_colection_Ej4B_servicios;

import Utilidades.Comparadores;
import egg_colection_Ej4B_entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosPelicula {
     private static Scanner leer;    
    private static ArrayList<Pelicula> misPelis; //aca creo mi Coleccion de Objetos Pelicula
  
    public ServiciosPelicula() {   //constructor vacio pero con instanciacion del scanner y la lista
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.misPelis = new ArrayList();
    }

//String titulo, String director, Integer duracionHs
    private Pelicula creaPeli() {
        System.out.println("Ingrese el  título de la Pelicula...");
        String titis = leer.next();
        System.out.println("Ingrese el Director.....");
        String mandamas = leer.next();
        System.out.println("Digitar la duración de la pelicula en minutos....");
        Integer hs = leer.nextInt();
        //Agrego la pelicula creada a la coleccion de peliculas
        return new Pelicula(titis, mandamas, hs);
    }

    public void misPelis() {
        String dato="S";
        do {
            misPelis.add(creaPeli());
            System.out.println("Desea agregar otra pelicula? S/N");
            dato = leer.nextLine().toUpperCase().trim();
        } while (dato.equalsIgnoreCase("S"));

    }
//Mostrar en pantalla todas las películas.    

    public void mostrarPeliculas() {
        System.out.println(" Detalle de todas las películas...");
        misPelis.forEach(aux -> {
            System.out.println(aux);
        });
    }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliculasde1Hs() {
        System.out.println(" Detalle de las películas con una duración mayor a 1 hora ...");
        misPelis.stream().filter(peli -> (peli.getDuracionHs() > 60)).forEachOrdered(peli -> {
            System.out.println(peli);
        });
        System.out.println("");
    }
//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.        
    public void ordenarPeliXDuracionMayor() {
        System.out.println(" Detalle de las películas ordenadas en forma descendente...");
        Collections.sort(misPelis, Comparadores.porDuracionMayor);
        misPelis.forEach(peli -> { System.out.println(peli);  }); 
        System.out.println("");
    }

//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarPeliXDuracionMenor() {
        System.out.println("** Mostrar películas de acuerdo a su duración de menor a mayor **");
        Collections.sort(misPelis, Comparadores.porDuracionMenor);//ordena con el Comparator porDuracionMenor
        misPelis.forEach(peli -> { System.out.println(peli); });
        System.out.println("");
    }

//Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.    
    public void ordenarPeliXTitulo() {
        System.out.println("** Mostrar las peliculas ordenadas por el Titulo alfabeticamente **");
        Collections.sort(misPelis, Comparadores.porTitulo);//ordena con el Comparator porTitulo
        misPelis.forEach(peli -> {  System.out.println(peli);  });//muestra lo ordenado
        System.out.println("");
    }

//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.    
    public void ordenarPeliXDirector() {
        System.out.println("** Mostrar las Peliculas ordenadas por el Director alfabeticamente");
        Collections.sort(misPelis, Comparadores.porDirector);//ordena con el Comparator porDirector
        misPelis.forEach(peli -> {  System.out.println(peli);   });
        System.out.println("");
    }   
}
