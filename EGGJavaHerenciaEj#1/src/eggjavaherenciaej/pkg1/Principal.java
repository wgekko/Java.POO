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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaracion del objeto PERRO
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.Alimentarse();

        //Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();

        //Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        
        //Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
    }

}
