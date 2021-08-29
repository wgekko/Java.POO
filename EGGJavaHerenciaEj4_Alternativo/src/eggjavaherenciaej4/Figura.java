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
public abstract class Figura {
    
    private int numLados;
    private double radio;
    private double diametro;

    public Figura() {
    }

    public Figura(int numLados) {
        this.numLados = numLados;       
    }

    public Figura(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    
    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
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
    
    //Declaración del método abstracto area()
    //public abstract double area(); 
     //Declaración del método abstracto perimetro()
     //public abstract double perimetro(); 

   
    
}
