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
import egg_1coletion_MEEj4_entidad.Libro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioLibro {
      static boolean bandera;
    Scanner leer;
    HashSet<Libro> biblioteca;
    Iterator<Libro> it;

    public ServicioLibro() {
        this.biblioteca = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.it = biblioteca.iterator();
        ServicioLibro.bandera = false;
    }
    private Libro crearLibro() {
        Libro p = new Libro();
        System.out.println("Ingrese el Titulo del Libro");
        p.setTitulo(leer.next().toUpperCase());
        System.out.println("Ingrese el Autor");
        p.setAutor(leer.next().toUpperCase());
        System.out.println("Cuantos Ejemplares tiene la Biblioteca?");
        p.setNroEjemplares(leer.nextInt());
        p.setEjemplaresPrestados(0);
        return p;
    }
    private void agregarLibro() {
        String op;
        do {
            biblioteca.add(crearLibro());
            System.out.println("Desea agregar otro Libro? Si=S/No=N...");
            op = leer.next().toUpperCase().trim();
        } while (op.equalsIgnoreCase("S"));
    }
    private void mostrar() {
        biblioteca.forEach(aux -> {
            System.out.println(aux);
        });
    }
    private void borrar() {
        System.out.println("Ingrese el libro a  borrar");
        String buscado = leer.next().toUpperCase();
        while (it.hasNext()) {
            if (it.next().getTitulo().equals(buscado)) {
                it.remove();
                bandera = true;
                break;
            } else {
                bandera = false;
            }
            if (bandera) {
                System.out.println("No se ha encontrado ese libro ....... " + buscado);
            } else {
                System.out.println(" Se ha borrado de la lista a exitosamete.... " + buscado);
            }
        }
    }
    private void prestar() {
        System.out.println("Ingrese el libro a prestar....");
        String buscado = leer.next().toUpperCase();

        while (it.hasNext()) {
            if (it.next().getTitulo().equals(buscado)) {
                bandera = it.next().prestamo();
            } else {
                bandera = false;
            }
        }

        if (bandera) {
            System.out.println("No se ha prestado ese  Libro.... " + buscado);
        } else {
            System.out.println("Se ha prestado  ese Libro.... " + buscado);
        }
    }
    private void devolver() {
        System.out.println("Ingrese el libro a devolver");
        String buscado = leer.next().toUpperCase();

        while (it.hasNext()) {
            if (it.next().getTitulo().equals(buscado)) {
                bandera = it.next().devolucion();
            } else {
                bandera = false;
            }
        }

        if (bandera) {
            System.out.println("No se ha devuelto  el Libro " + buscado);
        } else {
            System.out.println("Se ha devuelto  el Libro " + buscado);
        }
    }      
    private void venta() {
        System.out.println("Ingrese el libro a devolver");
        String buscado = leer.next().toUpperCase();
        while (it.hasNext()) {
            if (it.next().getTitulo().equals(buscado)) {
                int ejemplares = it.next().getNroEjemplares();
                it.next().setNroEjemplares(ejemplares - 1);
                bandera = true;
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("El libro se ha vendido .... " + buscado);
        } else {
            System.out.println("No existe el Libro " + buscado + " para vender");
        }
    }
    public void menu() {
        int op = 0;
        do {
            System.out.println("------ Menú Biblioteca -----------");
            System.out.println(" - 1. Agregar Libros ");
            System.out.println(" - 2. Borrar Libros "); 
            System.out.println(" - 3. Mostrar libros "); 
            System.out.println(" - 4. Prestar libros ");            
            System.out.println(" - 5. Devolver libros");            
            System.out.println(" - 6. Venta  de libros ");         
            System.out.println(" - 7. Salir del Menú ");
            System.out.println("---------------------------------------------");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();
              System.out.println("-------------------------------------------");
            switch (op) {
                case 1:
                     agregarLibro();   
                    break;
                case 2:
                   borrar(); 
                    break;
                case 3:
                    mostrar(); 
                    break;
                case 4:
                    prestar();
                    break;
                case 5:
                    devolver();
                    break;
                case 6:
                    venta();
                    break;
                case 7:
                    System.out.println("\n --- Salió correctamente del programa ......  \n");
                    break;
                default:
                    System.out.println("ERROR; Ingresó una opcion no validad");
                    op = 0;
            }
        } while (op != 7);
    }
}
