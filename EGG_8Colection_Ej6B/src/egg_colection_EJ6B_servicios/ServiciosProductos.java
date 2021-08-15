/*

Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 * 

 */
package egg_colection_EJ6B_servicios;

import egg_colection_Ej6B_entidades.Productos;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosProductos {
    private static Scanner leer;
    private static HashMap<Integer, Float> listaProductos;
   Productos p = new Productos();
   
    public ServiciosProductos() {
        ServiciosProductos.leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosProductos.listaProductos = new HashMap();

    }

    public void menuOpciones() {
        int op = 0;   float precio;     Integer codigo;

        while (op != 5) {
            System.out.println("\033[33m---------------------------------------------------------------------");
            System.out.println("\033[33m Menú - seleccione la opción deseada : ");
            System.out.println("\033[33m1.- Introducir producto");
            System.out.println("\033[33m2.- Modificar precio");
            System.out.println("\033[33m3.- Mostrar todos los productos");
            System.out.println("\033[33m4.- Eliminar producto");
            System.out.println("\033[33m5.- Salir");
            System.out.println("\033[33m---------------------------------------------------------------------");
            op = leer.nextInt();
            System.out.println("\033[33m----------------------------------------------------------------------");
            switch (op) {
                case 1:
                    System.out.println("\033[33m Introduce el código del producto : ");
                    p.setCodigo(leer.nextInt());
                    System.out.println("\033[33m Introduce el precio del producto : ");
                    p.setPrecio(leer.nextFloat());                   
                    guardarProducto(p.getCodigo(), p.getPrecio(), listaProductos);
                    break;
                case 2:
                    System.out.println("\033[33m Introduce el código del producto a modificar el precio :");
                    codigo = leer.nextInt();                    
                    modificarPrecio(codigo, listaProductos);
                    break;
                case 3:
                    mostrarProductos(listaProductos);
                    break;
                case 4:
                    System.out.println("\033[33m Introduce el código del producto que desea eliminar : ");
                    codigo = leer.nextInt();
                    eliminarProducto(codigo, listaProductos);
                    break;
                case 5:
                    System.out.println("\033[33m Salio correctamente del programa \n");
                    break;  
                default:
                    System.out.println("\033[33m ERROR; debe introducir una opción valida");
            }
        }
    }

    public void guardarProducto(Integer codigo, float precio, HashMap<Integer, Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            System.out.println("\033[33m ERROR; No se puede introducir el producto. El código esta repetido.");
        } else {
            listaProductos.put(codigo, precio);
        }
    }

    public void modificarPrecio(Integer codigo, HashMap<Integer, Float> listaProductos) {
      // Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(codigo)) {
            System.out.println("\033[33m Introduce el nuevo  precio del producto:");
            listaProductos.put(codigo, leer.nextFloat());
        } else {
            System.out.println("\033[33m Verificar, No hay ningun producto con ese código.");
        }
    }

    public void mostrarProductos(HashMap<Integer, Float> listaProductos) {
        Integer clave;
        Iterator<Integer> productos = listaProductos.keySet().iterator();
        System.out.println("\033[33m Listados de los productos disponibles :");
        while (productos.hasNext()) {
            clave = productos.next();
            System.out.println(clave + " - " + listaProductos.get(clave));
        }
    }

    public void mostrarProductos2(HashMap<Integer, Float> listaProductos) {
        Iterator iterador = listaProductos.entrySet().iterator(); //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
        Map.Entry producto;
        while (iterador.hasNext()) {
            producto = (Map.Entry) iterador.next();   //producto = iterador.next(); Si se usase tambien la otra linea comentada.
            System.out.println(producto.getKey() + " - " + producto.getValue());
        }
    }

    public void eliminarProducto(Integer codigo, HashMap<Integer, Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
            System.out.println(" \033[33mel codigo " + codigo + "  ha sido eliminado... ");
        } else {
            System.out.println("\033[33m No se ha encontrado ningún producto con ese código.");
        }
    }
    
}
