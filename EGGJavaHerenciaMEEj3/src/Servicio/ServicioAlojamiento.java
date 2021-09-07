/*
 * Una compañía de promociones turísticas desea mantener información sobre la
infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente encargado
del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco
estrellas. Las características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
16
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Residencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author WALTER GOMEZ
 */
public class ServicioAlojamiento {
     Scanner leer;

    public ServicioAlojamiento() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menu(ArrayList<Alojamiento> alojamientos) {
        int op = 0;
        do {
            System.out.println("\n\n\n");
            System.out.println("   ---   Alojamiento   ---   ");
            System.out.println(" 1. opción todos los Alojamientos ");
            System.out.println(" 2. opción de Hoteles por precio");
            System.out.println(" 3. Campings c/restorant ");
            System.out.println(" 4. Residencias c/descuento ");
            System.out.println(" 5. Salir ");
            System.out.println("--------------------------------------------");
            System.out.println("\nDigie una opcion ...");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    muestraTodo(alojamientos);
                    break;
                case 2:
                    hotelesPorPrecio(alojamientos);
                    break;
                case 3:
                    campingResto(alojamientos);
                    break;
                case 4:
                    residenciaDesc(alojamientos);
                    break;
                case 5:
                    System.out.println(".... salio del sistema ........");
                    break;
                default:
                    System.out.println("Ha ingresado  una opcion no valida");
            }

        } while (op != 5);
    }

    private void muestraTodo(ArrayList<Alojamiento> lista) {

        lista.forEach(aux -> {
            System.out.println(aux);
        });

    }

    private void hotelesPorPrecio(ArrayList<Alojamiento> lista) {

        ArrayList<Alojamiento> auxiliar = new ArrayList();
        lista.stream().filter(aux -> (aux instanceof Hotel)).forEachOrdered(aux -> {
            auxiliar.add(aux);
        }
        );
        ArrayList<Hotel> hoteles = new ArrayList(auxiliar);
        Collections.sort(hoteles, porPrecio);
        hoteles.forEach(aux -> {
            System.out.println(aux);
        });

    }

    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {        
            return h2.getPrecioHabitacion().compareTo(h1.getPrecioHabitacion());
        }
    };
    
    private void campingResto(ArrayList<Alojamiento> lista) {

        for (Alojamiento aux : lista) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isRestorant()) {
                    System.out.println(aux);
                }
            }
        }
    }
    
    private void residenciaDesc (ArrayList<Alojamiento> lista) {
        for (Alojamiento aux : lista) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescGremio()) {
                    System.out.println(aux);
                }
            }
        }
    }
    
}
