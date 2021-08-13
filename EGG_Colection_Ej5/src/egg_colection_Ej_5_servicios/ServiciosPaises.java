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
 * 
 */
package egg_colection_Ej_5_servicios;

import egg_colection_Ej5_entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosPaises {
    
      private Scanner leer;    
    private ArrayList<Paises> paisesList;

    public ServiciosPaises() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        //aca la instancio
        this.paisesList = new ArrayList();
    }
 
    private Paises crearPaises() {
        System.out.println("Por Favor, digite el país .........");
        String pa = leer.next().toUpperCase();
        Paises p = new Paises(pa);
        if (paisesList.contains(p)){
            
        }
        paisesList.add(p);
        return p;
    }
    private void mostrarPaises() {
        System.out.println("Los paises ingresados son ...");
        for (Paises aux : paisesList) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad de paises ingresados : " + paisesList.size());
    }
    public void agregarPaises() {
        String dato="S";
        do {
            crearPaises();
            System.out.println("Desea agregar otro Pais...."
                    + " continuar Si=S  o  Salir No=N");
            dato = leer.next().toUpperCase().trim();
        } while (dato.equalsIgnoreCase("S"));

        mostrarPaises();
    }
       public void ordenarPaisesAlfa() {
        System.out.println(" Los Paises ordenados en forma alfabeticamente ...");
        Comparator<Paises> comparador = (Paises p1, Paises p2) ->( p1.getPaises()).compareTo(p2.getPaises());               
        Collections.sort(paisesList, comparador);        
         paisesList.forEach(Paises -> { System.out.println(" Nombre del país : "+Paises.getPaises());
        });
        System.out.println("");
    }
    public void buscarEliminar() {     
        System.out.println("Ingresa el país  a buscar (y se procedera a elminar).... ");
        String buscarPais = leer.next().toUpperCase();
        boolean bandera = true;
        Iterator<Paises> it = paisesList.iterator();        
        while (it.hasNext()) {
            Paises aux = it.next();
            if (aux.getPaises().equalsIgnoreCase(buscarPais) ) {
                it.remove();
                bandera = true;
                break;
            }else{
                bandera = false;
            }
        }        
        if(bandera){
            System.out.println("Se encontró el pais ingresado... " + buscarPais);
        }else{
            System.out.println("No está el pais  ingresado a bucar ....");
        }                     
        paisesList.forEach((e) -> System.out.println(e));
    }
 }
