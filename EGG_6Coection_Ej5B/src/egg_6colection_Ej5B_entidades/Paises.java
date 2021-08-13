/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
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
package egg_6colection_Ej5B_entidades;
import java.util.Objects;

/**
 *
 * @author WALTER GOMEZ
 */
public class Paises implements Comparable<Paises> {
       private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//Sobreescrituras de metodos
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "\nPais: " + nombre;
    }

    @Override
    public int compareTo(Paises o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
