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
 */
package Egg_Java_Poo_Ej6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class CafeteraControl {
     DecimalFormat df = new DecimalFormat("###.##");
     int tazaExpresso=10,tazaCortado=16, tazaCappuccino=28, relleno;
       Cafetera cafetera = new Cafetera();

    public void llenarCafetera() {
        int capacidadMaxima = cafetera.getCapacidadMaxima();
        cafetera.setCantidadActual(capacidadMaxima);
    }

    public void servirTaza() {
        Scanner leer = new Scanner(System.in);
        int cantidadTotal = cafetera.getCantidadActual();
        int taza, tipotaza, cant=0;  int ctaza=0; double resto=0; 
        System.out.println("cantidad en la cafetera"+cantidadTotal);
        System.out.println("Seleccione tipo de tasa para servir el café...\n"
                + "\t 1 - Expresso (chica) \n\t 2 - Cortado (mediana) \n\t 3 - Cappuccino (grande)");
        taza = leer.nextInt(); 
         switch (taza) {
             case 1: 
                 taza = tazaExpresso; break;
             case 2:
                 taza = tazaCortado; break;
             case 3: 
                 taza = tazaCappuccino; break;
             default: 
                 break;
         } 
         System.out.println("Cantidad de tazas a servir :");
          cant = leer.nextInt();
          tipotaza=cant*taza;
          
        if (cantidadTotal == 0) {
            System.out.println("No hay cafe, por favor rellene la cafetera");
        } else {
            if (cantidadTotal < tipotaza) {
                System.out.println("La/s taza/s  no se lleno completamente.....");
                resto= (double)cantidadTotal; double porctaza=0.0005;
                while (resto-taza >0){
                    resto= resto-taza; ctaza  +=1;     
                }             
               porctaza= (resto/taza)*100;             
                System.out.println("Se llenó/ llenaron  " + ctaza+ " taza/s  y 1 al "+df.format(porctaza)+" % ");               
                cafetera.setCantidadActual(0);
            } else {
                System.out.println("La taza se lleno completamente");
                cafetera.setCantidadActual(cantidadTotal - tipotaza);
            }
        }
    }
    public void vaciarCafetera() {   
         //cafetera.setCantidadActual(0);
          Scanner leer = new Scanner(System.in);
                String dato = "S";
         do  {
            System.out.println("Desea vaciar la cafetera  ....(Si=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
            if(dato.equals("S")){
            cafetera.vaciarCafetera();
                System.out.println("la cafetera se ha vaciado exitosamente....!!!");
            break;
            }else{break;}
        }while (dato.equals("S"));
    }
    
     public void agregarCafe(int relleno) {
            cafetera.agregarCafe(relleno);
            System.out.println("la cafetera tiene actualmente ..."+cafetera.getCantidadActual()+" gramos disponibles ");
    }

}

