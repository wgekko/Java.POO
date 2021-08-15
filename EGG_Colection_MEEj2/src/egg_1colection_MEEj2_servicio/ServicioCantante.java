/*
 *    Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
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

/**
 *
 * @author WALTER GOMEZ
 */
public class ServicioCantante {
  public static ServicioCantante instance;  
private ServicioCantante() {
    }
    public static ServicioCantante getInstance() {
        if (instance == null) {
            instance = new ServicioCantante();
        }
        return instance;
    }
    public Cantante crearCantante(String nombre, String disco) {
        return new Cantante(nombre, disco);
    }  
}
