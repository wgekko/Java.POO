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
package egg_1colection_MEEj2_servicio;

import egg_1coletion_MEEj2_entidad.Cantante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServicioCantante {
 Scanner leer;
    ArrayList<Cantante> lista;

    public ServicioCantante() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.lista = new ArrayList<>();
       
        this.lista.add(new Cantante("ELTON JHON", "Sacriface"));
        this.lista.add(new Cantante("Lady Gaga", "Poker Face"));
        this.lista.add(new Cantante("Phill Collins", "Home By the Sear"));
        this.lista.add(new Cantante("Michael  Jackson", "Thriller"));
        this.lista.add(new Cantante("Andrea Bocelli", "Prayers"));
    }

    private Cantante crearCantante() {
        System.out.println("Ingrese el nombre del Cantante");
        String nomb = leer.next().toUpperCase();
        System.out.println("Cual fue el disco mas vendido de " + nomb);
        String dMVend = leer.next().toUpperCase();
        return new Cantante(nomb, dMVend);
    }
    private void crearLista() {
        String op;
        do {
            lista.add(crearCantante());
            System.out.println("Desea agregar otro cantante? S/N");
            op = leer.next().toUpperCase().trim();
        } while (op.equalsIgnoreCase("S"));
    }
    private void mostrar() {
        lista.forEach(aux -> {
            System.out.println(aux);
        });
        System.out.println("\n");
    }
    private void borrar() {
        boolean bandera = false;
        System.out.println("Ingrese el cantante a borrar");
        String buscado = leer.next().toUpperCase();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(buscado)) {
                bandera = true;
                lista.remove(i);
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("No se ha encontrado el cantante " + buscado);
        } else {
            System.out.println("Se ha borrado de la lista al cantante... " + buscado);
        }
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println(" --- Menú Lista de Cantantes ---");
            System.out.println(" - 1. Agregar Lista ");            
            System.out.println(" - 2. Borrar Cantante ");
            System.out.println(" - 3. Mostrar Cantante");            
            System.out.println(" - 4. Salir de programa ");
            System.out.println("-------------------------------------------------");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();
            System.out.println("-------------------------------------------------");
            switch (op) {
                case 1:
                    crearLista();
                    break;
                case 2:
                    borrar();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    System.out.println("\n Lista de Cantantes disponible ...\n");
                    mostrar();
                    System.out.println("\n ---- salió del programa................  \n");
                    break;
                default:
                    System.out.println("ERROR, Ingresó una opcion no validad");
                    op = 0; break;
            }
        } while (op != 4);
    }

}
