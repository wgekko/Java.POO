/*
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package egg_1coletion_MEEj1_entidad;

import java.util.ArrayList;

/**
 *
 * @author WALTER GOMEZ
 */
public class Numero {
    
 private ArrayList<Integer> numero;

    public Numero() {
    }

    public Numero(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    public ArrayList<Integer> getNumero() {
        return numero;
    }

    public void setNumero(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }

    
}
