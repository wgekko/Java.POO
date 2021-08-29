/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaherenciaej4;

import static java.lang.Math.PI;

/**
 *
 * @author WALTER GOMEZ
 */
public class Circulo extends Figura  {
    
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

    //Implementación del método abstracto area()                                                                  
    //heredado de la clase Figura 
    
    public double area(){
        double Area;
        Area = PI * Math.pow(radio, 2);
        return Area;
    }
     //Implementación del método abstracto perimetro()                                                                  
    //heredado de la clase Figura 
      public double perimetro(){
        double Perimetro;
        Perimetro = PI * diametro;
        return Perimetro;
    }
    
    
}

