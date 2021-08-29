/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaherenciaej4;

import eggjavaherenciaej4.Interface.CalculoFigura;

/**
 *
 * @author WALTER GOMEZ
 */
public class Triangulo extends Figura implements CalculoFigura {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

//Implementación del método interface area()        
    
    @Override
    public double calcularArea() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    //Implementación del método interface  perimetro()         
    @Override
    public double calcuarPerimetro() {
        return lado1 + lado2 + lado3;
    }

}
