/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package egg_6coection_ej5b_servicios;

import egg_6colection_Ej5B_entidades.Paises;
import java.util.*;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServicioPaises {

    private static Scanner leer;
    private static Set<Paises> paisesList;

    public ServicioPaises() {
        ServicioPaises.leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPaises.paisesList = new TreeSet();   //para poder lograr  un mejor ordenamiento se implement el conjunto como TreeSet    
    }

    private Paises crearPaises() {
        System.out.println("Digite el Pais....");
        String n = leer.next().toUpperCase().trim();
        return new Paises(n);
    }

    public void crearListPaises() {
        String dato = "S";
        do {
            paisesList.add(crearPaises());
            System.out.println("Desea agregar otro Pais...SI=s/ NO=n?");
            dato = leer.next().toUpperCase().trim();
        } while (dato.equalsIgnoreCase("S"));
        mostrarPaises();
    }

    private void mostrarPaises() {
        System.out.println("Detalle de Paises  ingresados");
        System.out.println("------------------------------------------------");
        paisesList.forEach(System.out::println);
        System.out.println("------------------------------------------------");
    }

    public void buscarEliminar() {
        boolean aux = true;
        Iterator<Paises> it = paisesList.iterator();
        System.out.println("Ingrese el pais a buscar y posteriormente a eliminar de la lista...");
        String datof = leer.next().toUpperCase();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(datof)) {
                it.remove();
                aux = true;
                break;
            } else { aux = false;   }
        }
        if (aux) {
            System.out.println("Encontre el Pais " + datof + " y se ha procedido a eliminar de la lista...");
        } else {
            System.out.println("No se ha encontrado el pais ingresado en la lista.... " + datof);
        }
        mostrarPaises();
    }
}
