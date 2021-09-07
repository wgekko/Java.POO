/*
 *Una compañía de promociones turísticas desea mantener información sobre la
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
package Entidad;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public final  class Hotel5 extends Hotel4 {
    
    
    private Integer cantSalonDeConferencias, cantDeSuits, cantDeLimosinas;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalonDeConferencias, Integer cantDeSuits, Integer cantDeLimosinas, String nombRestaurant, Integer capRestaurante, Gimnasio gym, Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombRestaurant, capRestaurante, gym, cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonDeConferencias = cantSalonDeConferencias;
        this.cantDeSuits = cantDeSuits;
        this.cantDeLimosinas = cantDeLimosinas;
    }

    public Integer getCantSalonDeConferencias() {
        return cantSalonDeConferencias;
    }

    public void setCantSalonDeConferencias(Integer cantSalonDeConferencias) {
        this.cantSalonDeConferencias = cantSalonDeConferencias;
    }

    public Integer getCantDeSuits() {
        return cantDeSuits;
    }

    public void setCantDeSuits(Integer cantDeSuits) {
        this.cantDeSuits = cantDeSuits;
    }

    public Integer getCantDeLimosinas() {
        return cantDeLimosinas;
    }

    public void setCantDeLimosinas(Integer cantDeLimosinas) {
        this.cantDeLimosinas = cantDeLimosinas;
    }

    public void creaHotel5E() {
        super.creaHotel4E();
        System.out.println("Salones y Suits : ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos Salones de Eventos tiene? : ");
        this.cantSalonDeConferencias = leer.nextInt();
        System.out.println("Cantidad de SUITs : " );
        this.cantDeSuits = leer.nextInt();
    }

     @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        super.precioHabitacion += this.cantDeLimosinas * 15;

    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return cantDeSuits + " Suits y, " + cantDeLimosinas + " Limusinas";
    }


    
    
}
