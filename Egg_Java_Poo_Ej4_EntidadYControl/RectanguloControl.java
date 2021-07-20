/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 privado base y un atributo privado altura. La clase incluirá un método para crear el
 rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 método para calcular la superficie del rectángulo y un método para calcular el
 perímetro del rectángulo. Por último, tendremos un método que dibujará el
 rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 los métodos getters, setters y constructores correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Egg_Java_Poo_Ej4_EntidadYControl;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class RectanguloControl {

    Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        Rectangulo recta = new Rectangulo();
        System.out.println("Digite los datos de base y altura del rectángulo");
        System.out.println("Ingrese el valor de la base...");
        recta.setBase(leer.nextFloat());
        System.out.println("Ingrese el valor de la altura...");
        recta.setAltura(leer.nextFloat());
        return recta;
    }

    public void Superficie(Rectangulo recta1) {
        DecimalFormat df = new DecimalFormat("###.##");
        float sup = 0;
        sup = recta1.getBase() * recta1.getAltura();
        System.out.println("La superficie de rectángulo es :" + df.format(sup));
    }

    public void getPerimetro(Rectangulo recta1) {
        DecimalFormat df = new DecimalFormat("###.##");
        float perimetro;
        perimetro = (recta1.getBase() + recta1.getAltura()) * 2;
        System.out.println("El perímetro del rectángulo es :" + df.format(perimetro));
    }

    public void dibujarRectangulo(Rectangulo recta1) {
        int altura = (int) recta1.getAltura();
        int base = (int) recta1.getBase();
        System.out.println("El dibuja el rectángulo .....\n");
              for(int i = 0; i < base; i++) {
                System.out.print("*");
            }
            System.out.println();       
            for (int i = 0; i < altura-2; i++) {
             System.out.print("*");
                for (int j = 0; j < base-2; j++) {
                  System.out.print(" ");   
                }
                 System.out.println("*");   
        }
               for(int i = 0; i < base; i++) {
                System.out.print("*");
            }
        System.out.println("\n");
       
    }

}
