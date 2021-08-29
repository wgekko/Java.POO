/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaherenciaej4;

import eggjavaherenciaej4.Interface.CalculoFigura;
import static java.lang.Math.PI;

/**
 *
 * @author WALTER GOMEZ
 */
public class Circulo extends Figura implements CalculoFigura {
    
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
//Implementación del método interface area()        
    @Override
    public double calcularArea() {
       double Area;
        Area = varPi * Math.pow(radio, 2);
        return Area;
    }  
 //Implementación del método interface  perimetro()
    @Override
    public double calcuarPerimetro() {
           double Perimetro;
        Perimetro = varPi * diametro;
        return Perimetro;
    }
    
    
}

