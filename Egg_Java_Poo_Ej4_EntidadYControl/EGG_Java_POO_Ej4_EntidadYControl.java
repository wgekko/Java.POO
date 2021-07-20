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

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej4_EntidadYControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String dato="N";
        do{
        RectanguloControl rectacontrol = new RectanguloControl();
        Rectangulo recta1 = rectacontrol.crearRectangulo();     
        System.out.println(recta1.toString());
        rectacontrol.Superficie(recta1);
        rectacontrol.getPerimetro(recta1);
        rectacontrol.dibujarRectangulo(recta1);
       
            System.out.println("Desea calcular otro rectángulo....(SI= s / NO = n)");            
            dato = leer.nextLine().toUpperCase().trim();
            // leer.nextLine();
        }while( dato.equals( "S") );
        
        // Rectangulo recta2 = rectacontrol.crearRectangulo();
        // rectacontrol.Superficie(recta2);
        //rectacontrol.getPerimetro(recta2);
        //rectacontrol.dibujarRectangulo(recta2);
        
    }
    
}
