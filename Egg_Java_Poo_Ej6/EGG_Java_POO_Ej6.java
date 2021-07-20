/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
18
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 *
 */
package Egg_Java_Poo_Ej6;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dato = "S"; int relleno;
        CafeteraControl cafetera = new CafeteraControl();
        System.out.println("se procede a llenar la cafetera ");
        cafetera.llenarCafetera();
        for (int i = 0; i < 3; i++) {
            System.out.println("un momento llenando la cafetera......");
            retardarSegundo();
        }
        System.out.println("La cafetera esta llena !!!...");

        do  {
            System.out.println("Desea servirse una taza de café ....(Si=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
            if(dato.equals("S")){
                 cafetera.servirTaza();
            }else{break;}
           
        }while (dato.equals("S"));
        
        //leer.nextLine();
          cafetera.vaciarCafetera();
        /*
         do  {
            System.out.println("Desea vaciar la cafetera  ....(Si=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
            if(dato.equals("S")){
            cafetera.vaciarCafetera();
                System.out.println("la cafetera se ha vaciado exitosamente....!!!");
            break;
            }else{break;}
        }while (dato.equals("S"));
         */
         
         do  {
            System.out.println("Desea llenar nuevamente  la cafetera  ....(Si=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
             if(dato.equals("S")){
                   System.out.println("Ingrese la cantidad de gramos ( 1kg=1000grs) a agregar a la cafetera...");
                 relleno= leer.nextInt();
            cafetera.agregarCafe(relleno);
             System.out.println("la cafetera se ha agregado café  exitosamente....!!!"); break;
               }else{break;}
        }while (dato.equals("S"));
         System.out.println("   -----   FIN DEL PROGRAMA   -----   ");

    }

    private static void retardarSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
  