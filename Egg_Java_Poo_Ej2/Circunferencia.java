/*
 POO Ejercicio # 2 
Declarar una clase llamada Circunsferencia que tenga como atributo 
privado el RADIO de tipo real. A continuación, de deben crear los siguiente 
métodos
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunsferencia.
c) Método para crear Circunsferenia(): que pida el radio y lo guarda 
en el atriuto del objeto 
d) Método area(): para calcular el +area de la circunsferencia  ()AREA= PI * RADIO ^2)
e) Método perimetro(): para calcular el perímetro (PERIMETRO = 2 * PI * RADIO)

 */
package Egg_Java_Poo_Ej2;

import static java.lang.Math.PI;

/**
 *
 * @author WALTER GOMEZ
 */
public class Circunferencia {
   
    private double radio;
    
    // Método constructor 
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        double area;
        area = PI * Math.pow(this.radio, 2);
        return area;
    }

    public double getPerimetro() {
        double perimetro;
        perimetro = 2 * PI * this.radio;
        return perimetro;
    }
}
