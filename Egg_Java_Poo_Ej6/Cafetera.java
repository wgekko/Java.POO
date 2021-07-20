/*
 * 
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
18
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Egg_Java_Poo_Ej6;

/**
 *
 * @author WALTER GOMEZ
 */
public class Cafetera {

    private int capacidadMaxima,  cantidadActual;
    int tazaExpreso=10,tazaCortado=16, tasaCappuccino=28, relleno;

    /**
     * se aplican los Getters y Setters
     *
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //se empiezan a declarar los constructores
    //se establece la capacidad maxima en 1000 y se inicializa la cantidad actual
    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    //llena la cafetera a la capacidad maxima
    public Cafetera(int capacidadMaxima) {
        cantidadActual = capacidadMaxima;

    }

    //contiene la capacidad maxima y la actual, si la actual es superior, la ajusta al maximo
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;

        this.cantidadActual = (cantidadActual > capacidadMaxima) ? capacidadMaxima
                : cantidadActual;
        /*usamos el operador condicional para que si la cantidad actual supera a la maxima
    *la cantidad maxima, sea la actual (adopta el valor)
         */
    }

    //empezamos a declarar los metodos
    public double llenarCafetera() {
        cantidadActual = capacidadMaxima;
        //la cantidad actual, es llenada a su capacidadMaxima
        return cantidadActual;
    }

    public void servirTaza(int taza) {
        if (taza > cantidadActual) {

            vaciarCafetera();
        } else {
            cantidadActual -= taza;
        }
        //la cantidad actual menos la taza servida, sera el resultado de cantidadActual

    }

    public double vaciarCafetera() {
        cantidadActual = 0;
        return cantidadActual;

    }

    public double agregarCafe(int relleno) {

        cantidadActual = cantidadActual+ relleno;
        // se le añade a cantidadActual, la cantidad introducida
        return cantidadActual;

    }
}
