/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.


 */
package egg_colection_Ej6_servicios;

import egg_colection_Ej6_entidades.Productos;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosProductos {

    private static Scanner leer;
    private static HashMap<String, Float> listaProductos;
   Productos p = new Productos();
   
    public ServiciosProductos() {
        ServiciosProductos.leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosProductos.listaProductos = new HashMap();

    }

    public void menuOpciones() {
        int op = 0; float precio; String daton;
        while (op != 5) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println(" Menú - seleccione la opción deseada : ");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            System.out.println("---------------------------------------------------------------------");
            op = leer.nextInt();
            System.out.println("----------------------------------------------------------------------");
            switch (op) {
                case 1:
                    System.out.println("Introduce el nombre del producto : ");
                    p.setNombre(leer.next());
                    System.out.println("Introduce el precio del producto : ");
                    p.setPrecio(leer.nextFloat());                   
                    guardarProducto(p.getNombre(), p.getPrecio(), listaProductos);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del producto a modificar el precio :");
                    daton = leer.next();                    
                    modificarPrecio(daton, listaProductos);
                    break;
                case 3:
                    mostrarProductos(listaProductos);
                    break;
                case 4:
                    System.out.println("Introduce el nombre del producto que desea eliminar : ");
                    daton = leer.next();
                    eliminarProducto(daton, listaProductos);
                    break;
                case 5:
                    System.out.println("Salio correctamente del programa \n");
                    break;  
                default:
                    System.out.println("ERROR; debe introducir una opción valida");
            }
        }
    }

    public void guardarProducto(String daton, float precio, HashMap<String, Float> listaProductos) {
        if (listaProductos.containsKey(daton)) {
            System.out.println("ERROR; No se puede introducir el producto. El código esta repetido.");
        } else {
            listaProductos.put(daton, precio);
        }
    }

    public void modificarPrecio(String daton, HashMap<String, Float> listaProductos) {
        //Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(daton)) {
            System.out.println("Introduce el nuevo  precio del producto:");
            listaProductos.put(daton, leer.nextFloat());
        } else {
            System.out.println("Verificar, No hay ningun producto con ese nombre....");
        }
    }

    public void mostrarProductos(HashMap<String, Float> listaProductos) {
        String clave;
        Iterator<String> productos = listaProductos.keySet().iterator();
        System.out.println("Listados de los productos disponibles :");
        while (productos.hasNext()) {
            clave = productos.next();
            System.out.println(clave + " - " + listaProductos.get(clave));
        }
    }

    public void mostrarProductos2(HashMap<String, Float> listaProductos) {
        Iterator iterador = listaProductos.entrySet().iterator(); //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
        Map.Entry producto;
        while (iterador.hasNext()) {
            producto = (Map.Entry) iterador.next();   //producto = iterador.next(); Si se usase tambien la otra linea comentada.
            System.out.println(producto.getKey() + " - " + producto.getValue());
        }
    }

    public void eliminarProducto(String daton, HashMap<String, Float> listaProductos) {
        if (listaProductos.containsKey(daton)) {
            listaProductos.remove(daton);
            System.out.println("el producto con el nombre : " + daton + "  ha sido eliminado... ");
        } else {
            System.out.println("No se ha encontrado ningún producto con ese nombre...");
        }
    }
}
