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
package Entidad;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Hotel4 extends Hotel {
    
   
    private String nombRestaurant;
    private Integer capRestaurante;
    private Gimnasio gym;

    public Hotel4() {
    }

    public Hotel4(String nombRestaurant, Integer capRestaurante, Gimnasio gym, Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.nombRestaurant = nombRestaurant;
        this.capRestaurante = capRestaurante;
        this.gym = gym;
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public Integer getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(Integer capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    public Gimnasio getGym() {
        return gym;
    }

    public void setGym(Gimnasio gym) {
        this.gym = gym;
    }
    
    public void creaHotel4E(){
        super.creaHotel();
        System.out.println("Resto y Gimnasio : ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el nombre del Restorant? : ");
        this.nombRestaurant = leer.next().toUpperCase();
        System.out.println("Cantidad de comensales : ");
        this.capRestaurante = leer.nextInt();
        System.out.println("De que Categoria es el Gimnasio? A ó B ...");
        char gy = leer.next().toUpperCase().charAt(0);
        this.gym = compruebaGym(gy);
        
    }
    
    private Gimnasio compruebaGym(char letra){
        Gimnasio g;
        switch(letra){
            case 'A':
                g= Gimnasio.A;
                break;
            case 'B':
                g= Gimnasio.B;
                break;
            default:
                System.out.println("Se  ha Ingresado una opcion no validad se asignara tipo B");
                g= Gimnasio.B;
        }
        return g;
    }
    
    @Override
    public void precioHabitacion(){
       super.precioHabitacion();
       double vAgregado=0;
       
       if(this.capRestaurante>50){
           vAgregado+=50;
       }else if(this.capRestaurante>30){
           vAgregado+=30;
       }else {
           vAgregado+=10;
       }
           if(this.gym==Gimnasio.A){
               vAgregado+=50;
           }else{
               vAgregado+=30;
           }
       
       super.precioHabitacion += vAgregado;
        
    }
      @Override
    public String toString() {
        System.out.println(super.toString());
        return "Resto: " + nombRestaurant + " Capacidad " + capRestaurante + " Comensales, Gimnasio de tipo " + gym;
    }
    
    public enum Gimnasio {
    A,B;
}
    
}
