/*
 *Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package egg_1colection_MEEj4_servicio;

/**
 *
 * @author WALTER GOMEZ
 */
import egg_1coletion_MEEj4_entidad.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioCodigoPostal {

    private Scanner leer;
    HashMap<String, CodigoPostal> codigoPostal; 

    public ServicioCodigoPostal() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.codigoPostal = new HashMap<>();     
    }

    private void agregar() {
        String op = "S";
        do {
            System.out.println("\033[33m - Ingrese el nombre de la Ciudad");
            String ciudad = leer.next().toUpperCase();
            System.out.println("\033[33m - Ingrese el Departamento");
            String depto = leer.next().toUpperCase();
            System.out.println("\033[33m - Ingrese el código postal");
            Integer cp = leer.nextInt();
            codigoPostal.put(ciudad, new CodigoPostal(depto, cp));
            System.out.println("\033[33m - Desea agregar otro código/Ciudad...... S/N");
            op = leer.next().toUpperCase().trim();
        } while (op.equalsIgnoreCase("S"));

    }

    private void mostrar() {
        for (Map.Entry<String, CodigoPostal> entry : codigoPostal.entrySet()) {
            System.out.println("Ciudad  \n"+ entry.getKey() + "  -  " + entry.getValue());
        }
    }

    private void modificar() {
        System.out.println("Ingresa la ciudad a modificar");
        String dato = leer.next().toUpperCase();
        if (codigoPostal.containsKey(dato)) {
            CodigoPostal aux = codigoPostal.get(dato);
            System.out.println("Ingrese el nuevo Código Postal");
            aux.setCodigo(leer.nextInt());
            codigoPostal.put(dato, aux);
        } else {
            System.out.println("No se encontró el código de la ciudad");
        }
    }

    private void borrar() {
        System.out.println("Ingrese la ciudad a borrar");
        String dato = leer.next().toUpperCase();
        if (codigoPostal.containsKey(dato)) {
            codigoPostal.remove(dato);
        } else {
            System.out.println("No se encontro la ciudad");
        }
    }

    private void borrarM() {
        System.out.println("Digite la cantidad de cuidades que desea eliminar :");
        int d = leer.nextInt();
        for (int i = 0; i < d; i++) {
            System.out.println("Ingrese la ciudad a borrar");
            String dato = leer.next().toUpperCase();
            if (codigoPostal.containsKey(dato)) {
                codigoPostal.remove(dato);
            } else {
                System.out.println("No se encontro la ciudad");
            }
        }
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("\033[33m------------------------------------------------------------");
            System.out.println("\033[33m Menú de Código de Cuidades Postales");
            System.out.println("\033[33m - 1. Agregar código/ciudad");
            System.out.println("\033[33m - 2. Borrar código/ciudad");
            System.out.println("\033[33m - 3. Borrar más de una código/ciudad (de acuerdo a consigna)");
            System.out.println("\033[33m - 4. Modificar Código de ciudad");
            System.out.println("\033[33m - 5. Mostrar los códigos de las cuidades");
            System.out.println("\033[33m - 6. Salir del programa");
            System.out.println("\033[33m-------------------------------------------------------------");
            System.out.println("\033[33m  -  Ingrese la opcion...\n");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    agregar();
                    break;
                case 2:
                    borrar();
                    break;
                case 3:
                    borrarM();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    System.out.println("\033[33m  Fin del Programa...........  \n");
                    break;
                default: {
                    System.out.println("ERROR, Ingresó una opcion no valida");
                    op = 0;
                    break;
                }
            }
        } while (op != 6);
    }

}
