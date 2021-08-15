/*
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package egg_1colection_MEEj1_servicio;

/**
 *
 * @author WALTER GOMEZ
 */
import egg_1coletion_MEEj1_entidad.Numero;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioNumero {

    private static Scanner leer;
    private static ArrayList<Numero> nroList;

    public ServicioNumero() {   //constructor vacio pero con instanciacion del scanner y la lista
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.nroList = new ArrayList();
    }
    public void agregarNro() {
        int n;
        do {
            ArrayList<Integer> num = new ArrayList();
            System.out.println("\033[33m Digite los  números enteros. para finalizar ingrese -99.... ");
            System.out.print("\033[33m Numero # : ");
            n = leer.nextInt();
            if (n != -99) {
                num.add(n);
                Numero dato = new Numero(num);
                nroList.add(dato);
            }
        } while (n != -99);
        //System.out.println("\033[33m Ha introducido: " + nroList.size() + " de números....");
    }
    public void mostrarNro() {
        System.out.println("\033[33m Los números cargados ...");
        for (Numero aux : nroList) {
            System.out.println( "\033[33m"+aux.getNumero());
        }
        System.out.println("\033[33m Cantidad ingresda de números : " + nroList.size());
    }
    public void calcularProm() {
        Iterator<Numero> it = nroList.iterator();// se genera el Iterator con la lista de alumnos
        Integer sumarNro = 0;
        while (it.hasNext()) {
            Numero aux = it.next();
            ArrayList<Integer> nroAux = aux.getNumero();
            for (Integer nroTotal : nroAux) {
                sumarNro = sumarNro + nroTotal;            }
        }
        System.out.println("\033[33m El promedio de los números ingresados es :" + sumarNro / nroList.size());
    }
}
