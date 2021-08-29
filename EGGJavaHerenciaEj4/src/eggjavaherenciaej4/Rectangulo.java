/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaherenciaej4;

/**
 *
 * @author WALTER GOMEZ
 */
public class Rectangulo extends Figura  {
    
    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {                                                               
        
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    //Implementación del método abstracto area()                                                                  
    //heredado de la clase Polígono 
    
    public double area(){
        return lado1 * lado2;
    }
    //Implementación del método abstracto perimetro()                                                                  
    //heredado de la clase Figura
     public double perimetro(){
        return lado1 + lado1 +  lado2 + lado2;
    }
}
