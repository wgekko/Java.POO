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
package Egg_Java_Poo_Ej4;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author walter
 */
public class EGG_Java_POO_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calcular();
        /*
         DecimalFormat df = new DecimalFormat("###.##");
         float a=0; float b=0; 
         Scanner leer = new Scanner (System.in);
         System.out.println("Digite los datos de base y altura del rectángulo");
         do{
         System.out.println("Ingrese el valor de la base...");
         b = leer.nextFloat();
         System.out.println("Ingrese el valor de la altura...");
         a = leer.nextFloat();
         }while(b<= 0 || a <=0 );   
         Rectangulo recta = new Rectangulo(b,a);
         recta.crearRectangulo(b,a);
         System.out.println("El rectángulo tiene por base : "+recta.getBase()+"  y si altura :"+recta.getAltura());
         System.out.println("La superficie del rectángulo es : ..."+ df.format(recta.getSuperficie()));
         System.out.println("el perímetro del rectángulo es :..."+ df.format(recta.getPerimetro()));
         */
    }

    public static void Calcular() {
        DecimalFormat df = new DecimalFormat("###.##");
        float a = 0; float b = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los datos de base y altura del rectángulo");
        do {
            System.out.println("Ingrese el valor de la base...");
            b = leer.nextFloat();
            System.out.println("Ingrese el valor de la altura...");
            a = leer.nextFloat();
        } while (b <= 0 || a <= 0);
        Rectangulo recta = new Rectangulo(b, a);
        recta.crearRectangulo(b, a);
        System.out.println("El rectángulo tiene por base : " + recta.getBase() + "  y si altura :" + recta.getAltura());
        System.out.println("La superficie del rectángulo es : ..." + df.format(recta.getSuperficie()));
        System.out.println("el perímetro del rectángulo es :..." + df.format(recta.getPerimetro()));
        System.out.println("se dibuja el rectángulo a continuación -.........\n");
        recta.dibujarRectangulo(b, a);
    }

}
