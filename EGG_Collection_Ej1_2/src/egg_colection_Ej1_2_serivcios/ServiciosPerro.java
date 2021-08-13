/*
 * Consiga ejercicio # 1 
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
  Consigna ejercicio# 2 
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.

 */
package egg_colection_Ej1_2_serivcios;

import egg_colection_ej1_2_entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosPerro {
    private Scanner leer;
    //aca creo mi Coleccion de Objetos Perros
    private ArrayList<Perro> perrosList;

    public ServiciosPerro() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        //aca la instancio
        this.perrosList = new ArrayList();
    }    
    private Perro crearPerro() {
        System.out.println("Ingrese la Raza del Perro");
        String laRaza = leer.next().toUpperCase();
        Perro p = new Perro(laRaza);
        perrosList.add(p);
        return p;
    }
    private void mostrarPerros() {
        System.out.println("Las razas de perros cargadas son...");
        for (Perro aux : perrosList) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad ingresda de razas de perro : " + perrosList.size());
    }   
    public void agregarPerros() {
        String op;
        do {
            crearPerro();
            System.out.println("Desea agregar otro Perro"
                    + " continuar Si=S  o  Salir No=N");
            op = leer.nextLine().toUpperCase().trim();
        } while (op.equalsIgnoreCase("S"));

        mostrarPerros();
    }
    public void buscarEliminar() { //le pido al usuario la raza a buscar        
        System.out.println("Ingresa la Raza a buscar (y se procedera a elminar).... ");
        String buscaRaza = leer.next().toUpperCase();
    //creo una bandera logica para saber si encontre o no la raza
        boolean bandera = true;
    //Iterator fr tipo Perro llamado it con lo que tiene el arraylist perrosList
        Iterator<Perro> it = perrosList.iterator();
    //Mientras haya otro objeto en la lista hacer        
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.getRaza().equals(buscaRaza)) {
                it.remove();
                bandera = true;
                break;
            }else{
                bandera = false;
            }
        }
        if(bandera){
            System.out.println("Se encontró  la raza " + buscaRaza);
        }else{
            System.out.println("No está la raza  ingresada a bucar ....");
        }               
        //podria llamar al metodo mostrarPerros pero quiero ver como es con
        //forech de una linea
        perrosList.forEach((e) -> System.out.println(e));
    }
}
