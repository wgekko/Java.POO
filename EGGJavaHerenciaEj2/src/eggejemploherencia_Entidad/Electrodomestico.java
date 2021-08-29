/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
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
package eggejemploherencia_Entidad;

import eggejemploherencia_Servicio.Electro;

/**
 *
 * @author WALTER GOMEZ
 */
public class Electrodomestico {
    
      //Variables
    protected double precioBase;
    protected double peso;
    protected Colores color;
    protected ConsumoElectronico miConsumo;


    //Constructores
    public Electrodomestico() {
        this.precioBase = 1000;
        this.peso = 5;
        this.color = Colores.BLANCO;
        this.miConsumo = ConsumoElectronico.B;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.color = Colores.BLANCO;
        this.miConsumo = ConsumoElectronico.B;
    }

    public Electrodomestico(double precioBase, double peso, String color, char miconsumo) {

        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = Electro.comprobarConsumoEnergetico(miconsumo);
        this.color = Electro.comprobarColor(color);
    }

    //metodos get and set
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public ConsumoElectronico getMiConsumo() {
        return miConsumo;
    }

    public void setMiConsumo(ConsumoElectronico miConsumo) {
        this.miConsumo = miConsumo;
    }

    //Metodo Precio Final
    public double precioFinal() {

        double precioFinal = 0.0;

        switch (getMiConsumo()) {
            case A:
                precioFinal = getPrecioBase() + 1000;
                break;
            case B:
                precioFinal = getPrecioBase() + 800;
                break;
            case C:
                precioFinal = getPrecioBase() + 600;
                break;
            case D:
                precioFinal = getPrecioBase() + 500;
                break;
            case E:
                precioFinal = getPrecioBase() + 300;
                break;
            case F:
                precioFinal = getPrecioBase() + 100;
                break;
            default :
                  precioFinal = getPrecioBase() + 100;
                break;
        }

        if (getPeso() <= 19) {
            precioFinal += 100;
        } else if (getPeso() <= 49) {
            precioFinal += 500;
        } else if (peso <= 79) {
            precioFinal += 800;
        } else {
            precioFinal += 1000;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico [" + "precioBase : " + precioBase + ", peso : " + peso + ", color : " + color + ", miConsumo : " + miConsumo + "]";
    }

    

    //Enums
    public enum Colores {
        BLANCO, METAL, ROJO, VERDE, AZUL;
    }

    public enum ConsumoElectronico {A, B, C, D, E, F; }
}
    

