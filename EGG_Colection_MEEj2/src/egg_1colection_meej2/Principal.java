/*
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios
 */
package egg_1colection_meej2;

import egg_1colection_MEEj2_servicio.ServicioCantante;
import egg_1coletion_MEEj2_entidad.Cantante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
     
         List<Cantante> cantantes = new ArrayList<Cantante>();
        ServicioCantante s = ServicioCantante.getInstance();
        int operacion = 0;       
        cantantes.add(s.crearCantante("ELTON JHON", "Sacriface"));
        cantantes.add(s.crearCantante("Lady Gaga", "Poker Face"));
        cantantes.add(s.crearCantante("Phill Collins", "Home By the Sear"));
        cantantes.add(s.crearCantante("Michael  Jackson", "Thriller"));
        cantantes.add(s.crearCantante("Andrea Bocelli", "Prayers"));
        
        while (operacion != 4) {
            System.out.println("--------------------------------------------");
            System.out.println("\tMENU");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
                System.out.println("--------------------------------------------");
            operacion = Integer.valueOf(leer.nextLine());
             System.out.println("--------------------------------------------");
            if (operacion == 1) {
                System.out.println("Ingrese el nombre del cantante");
                String nombre = leer.nextLine();
                System.out.println("Ingrese el disco mas vendido");
                String disco = leer.nextLine();
                cantantes.add(s.crearCantante(nombre, disco));
            }
            if (operacion == 2) {
                System.out.println(cantantes);
            }
            if (operacion == 3) {
                System.out.println("Ingrese el nombre del cantante a borrar");
                String nombre = leer.nextLine();
                Iterator<Cantante> it = cantantes.iterator();
                while (it.hasNext()) {
                    if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                        it.remove();
                        System.out.println("el cantante ha sido eliminado correctamente...");
                    }else{
                        System.out.println("el cantante no se ha encontrado...");
                    }
                }
            }
            if (operacion == 4) {
                System.out.println("FIn del programa ");
                return;
            }
}
    }
}