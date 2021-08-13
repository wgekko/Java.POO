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
package egg_colection_Ej4_servicios;

import egg_collection_Ej4_entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosPelicula {
    
     private Scanner leer;
    //aca creo mi Coleccion de Objetos Pelicula
    private ArrayList<Pelicula> misPelis;

    //constructor vacio pero con instanciacion del scanner y la lista
    public ServiciosPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.misPelis = new ArrayList();
    }

//String titulo, String director, double duracionHs
    private void crearPeli() {
        System.out.println(" - Ingresar el titulo de la Pelicula...");
        String titulo = leer.next();
        System.out.println(" - Digitar el Director.....");
        String director = leer.next();
        System.out.println(" - Duración de la Pelicula  (en horas formato 1,35)?");
        double duracion = leer.nextDouble();
        
        Pelicula p = new Pelicula(titulo,director,duracion);
        misPelis.add(p);
    }
    
    public void pedirPelis(){
        String dato ="S";        
        do{
            crearPeli();
            System.out.println("Desea agregar otra pelicula....? Si=S /No=N");
            dato = leer.next().toUpperCase().trim();
        }while(dato.equalsIgnoreCase("S") );
        
    }
    public void mostrarPelis(){
        
        System.out.println("Cantidad de Peliculas ingresadas es .. : " + misPelis.size()); 
        System.out.println("Las peliculas ingresadas son...");
        for (Pelicula aux : misPelis) {
            System.out.println("- Tiulo : "+aux.getTitulo()+"\t -  Director : "+ aux.getDirector()+"\t - Duración : "+ aux.getDuracionHs());
        }
    }
  public void buscarHora() {
        System.out.println(" la peliculas con duración mayor a una horas ...... ");   
        if (misPelis.stream().filter(Pelicula -> Pelicula.getDuracionHs()>1).map(Pelicula->Pelicula.getTitulo()) == null){
             System.out.println(" OOPPSSS, no se encontraron  peliculas con duración mayor a una horas ...... ");   
        } else{
        misPelis.stream().filter(Pelicula -> Pelicula.getDuracionHs()>1).map(Pelicula->Pelicula.getTitulo()).forEach(System.out::println);
        }
  }
  
   public void ordenarPeliXDuracionMayor() {
        System.out.println("  Películas  ordenadas en forma descendente de acuerdo a su duración...");                    
        Comparator<Pelicula> comparar = (Pelicula p2, Pelicula p1 )->((Double) p2.getDuracionHs()).compareTo(p1.getDuracionHs());        
        Collections.sort(misPelis, comparar.reversed());            
        misPelis.forEach(Pelicula -> {  System.out.println(" Titulo : "+Pelicula.getTitulo()+"\t duración :"+Pelicula.getDuracionHs()+" hs.");
        });//muestra lo ordenado
     
        System.out.println("\n");
    }

//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarPeliXDuracionMenor() {
        System.out.println(" Peliculas ordenadas en forma ascendente de acuerdo a su duración ...");
        Comparator<Pelicula> comparador = (Pelicula p1, Pelicula p2) ->((Double) p1.getDuracionHs()).compareTo(p2.getDuracionHs());               
        Collections.sort(misPelis, comparador);        
        misPelis.forEach(Pelicula -> { System.out.println(" Titulo : "+Pelicula.getTitulo()+"\t Duración  :"+Pelicula.getDuracionHs()+ " hs.");
        });//muestra lo ordenado
        System.out.println("");
    }

//Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.    
    public void ordenarPeliXTitulo() {
        System.out.println(" Peliculas ordenadas por el Titulo alfabeticamente...");
        Comparator<Pelicula> comparaTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());        
        Collections.sort(misPelis, comparaTitulo);//ordena con el Comparator comparaTitulo        
        misPelis.forEach(Pelicula -> { System.out.println(" Titulo : "+Pelicula.getTitulo());
        });//muestra lo ordenado
        System.out.println("");
    }
    
//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.    
    public void ordenarPeliXDirector() {
        System.out.println("  Peliculas ordenadas por el Director alfabeticamente ...");
        Comparator<Pelicula> comparaDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());        
        Collections.sort(misPelis, comparaDirector);//ordena con el Comparator comparaDirector        
        misPelis.forEach(Pelicula -> { System.out.println(" Titulo : "+Pelicula.getTitulo() +" Director : "+Pelicula.getDirector());
        });//muestra lo ordenado
        System.out.println("");
    }
  }


    
