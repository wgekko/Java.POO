/*
 *  * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Egg_Java_Poo_MaterialExtraEj3;

import java.text.DecimalFormat;

/**
 *
 * @author WALTER GOMEZ
 */
public class RaicesControl {
    Raices raices = new Raices();

    public RaicesControl(double a, double b, double c) {
        raices.setA(a);
        raices.setB(b);
        raices.setC(c);
    }

    public double getDiscriminante() {
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();
        double discriminante;
        discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    public boolean tieneRaices() {       
        boolean dato = (getDiscriminante() > 0 )? true:  false;
        return dato;
        /*
        if (getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }*/
    }

    public boolean tieneRaiz() {
        boolean datoR =(getDiscriminante() == 0) ? true : false;
        return datoR;
        /*
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }*/
    }

    public void obtenerRaices() {
         DecimalFormat df = new DecimalFormat("###.##");
        if (tieneRaices()) {    // la formula es  (-b +- sqrt(b^2 - 4 ac)) / -2a
            double raiz1;
            double raiz2;
            double a = raices.getA();
            double b = raices.getB();
            double c = raices.getC();
            raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("Raiz 1: " + df.format(raiz1));
            System.out.println("Raiz 2: " + df.format(raiz2));
        } else {
            System.out.println("No tiene raices o solo tiene 1");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {   // la formula es  (-b +- sqrt(b^2 - 4 ac)) / -2a
            double raiz;
            double a = raices.getA();
            double b = raices.getB();
            raiz = (-b / (2 * a));
            System.out.println("La raiz es :" + raiz);
        } else {
            System.out.println("No tiene raices");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene solucion");
        }
    }
    
    
}
