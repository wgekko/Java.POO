/*
 * 
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
package egg_8colection_ej6b;


import egg_colection_Ej6B_entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {
        static Scanner leer= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
Map<Integer, Producto> productos = new HashMap<>();
        int operacion = 0;
        while (operacion != 5) {
            System.out.println("\tMENU");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Borrar producto");
            System.out.println("4. Ver productos");
            System.out.println("5. Salir");
            operacion = Integer.valueOf(leer.nextLine());
            if (operacion == 1) {
                agregar(productos);
            }
            if (operacion == 2) {
                modificar(productos);
            }
            if (operacion == 3) {
                eliminar(productos);
            }
            if (operacion == 4) {
                System.out.println(productos.values());
            }
            if (operacion == 5) {
                return;
            }
        }
}

    public static void agregar(Map<Integer, Producto> productos) {
        boolean agregar = true;
        String nuevoElemento = "s";
        String producto;
        double precio;
        int i = 1;
        while (agregar) {
            if (nuevoElemento.equalsIgnoreCase("s")) {
                System.out.println("Nombre producto");
                producto = leer.nextLine();
                System.out.println("Precio producto");
                precio = Double.valueOf(leer.nextLine());
                productos.put(i, new Producto(producto, precio));
                i++;
            }
            System.out.println("Desea agregar un nuevo elemento? S/N");
            nuevoElemento = leer.nextLine();
            if (nuevoElemento.equalsIgnoreCase("n")) {
                agregar = false;
            }
        }
    }

    public static void modificar(Map<Integer, Producto> productos) {
        System.out.println("Que producto quiere modificar?");
        String producto = leer.nextLine();
        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();
            if (producto.equalsIgnoreCase(value.getProducto())) {
                System.out.println("Indique el nuevo nombre");
                value.setProducto(leer.nextLine());
                System.out.println("Indique el nuevo precio");
                value.setPrecio(Double.valueOf(leer.nextLine()));
            }
        }
    }

    public static void eliminar(Map<Integer, Producto> productos) {
        String producto;
        System.out.println("Que producto desea eliminar?");
        System.out.println(productos.values());
        producto = leer.nextLine();
        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer id = entry.getKey();
            Producto value = entry.getValue();
            if (producto.equalsIgnoreCase(value.getProducto())) {
                productos.remove(id);
                System.out.println("Producto eliminado");
                break;
            }
        }
        
    }
    
}
