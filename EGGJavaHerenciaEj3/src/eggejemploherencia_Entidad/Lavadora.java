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
public class Lavadora extends Electrodomestico {
    
    //Variables
    int carga;

    //Constructores
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(int precioBase, int peso) {
        super();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Lavadora(double precioBase, double peso, String color, char miconsumo, int carga) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = Electro.comprobarConsumoEnergetico(miconsumo);
        this.color = Electro.comprobarColor(color);
        this.carga = carga;
    }

    public double precioFinal() {

        double preciofinal = super.precioFinal();

        if (getCarga() > 30) {
            preciofinal += 50;
        }

        return preciofinal;
    }

    //Geters & Seters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora[" + "carga : " + carga + "]";
    }

}
