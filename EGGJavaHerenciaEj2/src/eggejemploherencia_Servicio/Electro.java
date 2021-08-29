/*
 *Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
11
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg
$100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
12
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package eggejemploherencia_Servicio;

import eggejemploherencia_Entidad.Electrodomestico;
import eggejemploherencia_Entidad.Lavadora;
import eggejemploherencia_Entidad.Televisor;
import java.util.*;

/**
 *
 * @author WALTER GOMEZ
 */
public class Electro {
        
       public static Electrodomestico.ConsumoElectronico comprobarConsumoEnergetico(char letra) {
        String consumos = "ABCDEF";
        if (!(consumos.contains(String.valueOf(letra)))) {
            return Electrodomestico.ConsumoElectronico.B;
        } else {
            return Electrodomestico.ConsumoElectronico.valueOf(Character.toString(letra));
        }
    }

    public static Electrodomestico.Colores comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("BLANCO");
        colores.add("METAL");
        colores.add("ROJO");
        colores.add("VERDE");
        colores.add("AZUL");

        if (!(colores.contains(color))) {
            return Electrodomestico.Colores.BLANCO;
        }
        return Electrodomestico.Colores.valueOf(color);
    }

    public static Electrodomestico[] crearArrayElectrodomesticos() {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(100, 20, "ROJO", 'A');
        electrodomesticos[2] = new Electrodomestico(200, 30, "VERDE", 'B');
        electrodomesticos[3] = new Lavadora(300, 20, "ROJO", 'F', 35);
        electrodomesticos[4] = new Electrodomestico(400, 50, "METAL", 'D');
        electrodomesticos[5] = new Lavadora(200, 20, "AZUL", 'E', 45);
        electrodomesticos[6] = new Electrodomestico(300, 40, "BLANCO", 'C');
        electrodomesticos[7] = new Televisor(400, 5, "METAL", 'A', 30, false);
        electrodomesticos[8] = new Electrodomestico(100, 20, "ROJO", 'G');
        electrodomesticos[9] = new Televisor(350, 5, "VERDE", 'C', 30, true);

        return electrodomesticos;
    }

    public static double[] calcularPrecios(Electrodomestico[] electrodomesticos) {
        double electrodomesticosPrecio = 0;
        double televisorPrecio = 0;
        double lavadoraPrecio = 0;

        //  private static ArrayList<Electrodomestico> electrodomesticos ArrayList<>
        double[] precios = new double[3];

        for (int i = 0; i < 10; i++) {
            if (electrodomesticos[i] instanceof Televisor) {
                televisorPrecio += electrodomesticos[i].precioFinal();
                //System.out.println("Televisor "+televisorPrecio);
            } else if (electrodomesticos[i] instanceof Lavadora) {
                lavadoraPrecio += electrodomesticos[i].precioFinal();
                //System.out.println("Lavadora "+lavadoraPrecio);
            } else if (!(electrodomesticos[i] instanceof Televisor) && !(electrodomesticos[i] instanceof Lavadora)) {
                electrodomesticosPrecio += electrodomesticos[i].precioFinal();
                //System.out.println("electrodomestico "+electrodomesticosPrecio);
            }
        }

        precios[0] = electrodomesticosPrecio;
        precios[1] = televisorPrecio;
        precios[2] = lavadoraPrecio;

        return precios;
    }
    
}
