/*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
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
    

