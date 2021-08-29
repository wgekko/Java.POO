/*
 *Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
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
public class Televisor extends Electrodomestico{        
    //Variables
    int resolucion;
    boolean sintonizador_TDT;

    //Constructores
    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizador_TDT = false;
    }

    public Televisor(double precioBase, double peso) {
        super();

    }

    public Televisor(double precioBase, double peso, String color, char miconsumo, int resolucion, boolean sintonizador_TDT) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = Electro.comprobarConsumoEnergetico(miconsumo);
        this.color = Electro.comprobarColor(color);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }  

    @Override
    public double precioFinal() {

        double preciofinal = super.precioFinal();

        if (getResolucion() > 40) {
            preciofinal = (preciofinal * 30) / 100;
        }

        if (isSintonizador_TDT()) {
            preciofinal = preciofinal + 50;
        }

        return preciofinal;
    }

    //Geters & Seters
    public int getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(int pulgadas) {
        this.resolucion = pulgadas;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
    
      @Override
    public String toString() {
        return "Televisor [" + "resolucion : " + resolucion + ", sintonizador_TDT : " + sintonizador_TDT + "]";
    }
}
