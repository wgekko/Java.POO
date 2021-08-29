/*
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta
 */
package eggjavaherenciaej.pkg1;

/**
 *
 * @author WALTER GOMEZ
 */
public abstract class Animal {

    private String nombre, tipo_alimentacion;
    private int edad;

    public Animal(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

    /**
     * @Tittle METODO ABSTRACTO
     * @Content Este metodo se crea cuando declaramos abstract la funcion
     */
    public abstract void Alimentarse();

    public void Moverse() {
        System.out.println("El animal se esta moviendo...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal [" + "nombre : " + nombre + ", tipo alimentació : " + tipo_alimentacion + ", edad : " + edad + "]" ;
    }

}
