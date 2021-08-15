/*
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
20
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package egg_1colection_MEEj3_servicio;

/**
 *
 * @author WALTER GOMEZ
 */
import egg_1coletion_MEEj3_entidad.Libro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioLibro {

    private static ServicioLibro instance;
    Scanner scan = new Scanner(System.in);

    private ServicioLibro() {

    }

    public static ServicioLibro getInstance() {
        if (instance == null) {
            instance = new ServicioLibro();
        }
        return instance;
    }

    public Libro crearLibro() {
        System.out.println("Ingrese el nombre del libro");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = scan.nextLine();
        System.out.println("Ingrese la cantidad de ejemplares del libro");
        int ejemplares = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese la cantidad de ejemplares prestados");
        int ejemplaresPrestados = Integer.valueOf(scan.nextLine());
        return new Libro(nombre, autor, ejemplares, ejemplaresPrestados);
    }

    public void prestarLibro(HashSet<Libro> libros) {
        System.out.println("Ingrese el nombre del libro que desea prestar");
        String nombre = scan.nextLine();
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro temp = it.next();
            if (temp.getTitulo().equalsIgnoreCase(nombre)) {
                if ((temp.getEjemplaresPrestados() + 1) > temp.getEjemplares()) {
                    System.out.println("No quedan ejemplares disponibles para prestar");
                } else {
                    temp.setEjemplaresPrestados(temp.getEjemplaresPrestados() + 1);
                    System.out.println("Libro prestado, por favor devolver dentro de una semana");
                }
            }
        }
    }

    public void devolverLibro(HashSet<Libro> libros) {
        System.out.println("Ingrese el nombre del libro que desea devolver");
        String nombre = scan.nextLine();
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro temp = it.next();
            if (temp.getTitulo().equalsIgnoreCase(nombre)) {
                if (temp.getEjemplaresPrestados() == 0) {
                    System.out.println("Este libro no ha sido prestado");
                } else {
                    temp.setEjemplaresPrestados(temp.getEjemplaresPrestados() - 1);
                    System.out.println("Libro devuelto. Gracias, vuelva pronto");
                }
            }
        }
    }
}
