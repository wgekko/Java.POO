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
/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {    
        ServicioCantante s = new ServicioCantante();
        s.menu();
    }
}