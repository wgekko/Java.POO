/*
 *Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios
 */
package egg_1coletion_MEEj2_entidad;

import java.util.Objects;

/**
 *
 * @author WALTER GOMEZ
 */
public class Cantante {
    
    private String nombre;
    private String discoConMasVentas;

    public Cantante() {
    }

    public Cantante(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return this.discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public Cantante nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Cantante discoConMasVentas(String discoConMasVentas) {
        setDiscoConMasVentas(discoConMasVentas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cantante)) {
            return false;
        }
        Cantante cantante = (Cantante) o;
        return Objects.equals(nombre, cantante.nombre)
                && Objects.equals(discoConMasVentas, cantante.discoConMasVentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, discoConMasVentas);
    }

    @Override
    public String toString() {
        return  " Cantante :  " + getNombre() + "\n" + "disco más Vendido : " + getDiscoConMasVentas()  + "\n";
    }
    
}
