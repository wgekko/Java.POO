/*
 *Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package eggejemploherencia_Servicio;

import eggejemploherencia_Entidad.Electrodomestico;
import eggejemploherencia_Entidad.Lavadora;
import eggejemploherencia_Entidad.Televisor;
import java.util.*;

/**
 *
 * @author WALTER GOMEZ
 */
public class Electro {   
    
       public static Electrodomestico.ConsumoElectronico comprobarConsumoEnergetico(char letra) {
        String consumos = "ABCDEF";
        if (!(consumos.contains(String.valueOf(letra)))) {
            return Electrodomestico.ConsumoElectronico.B;
        } else {
            return Electrodomestico.ConsumoElectronico.valueOf(Character.toString(letra));
        }
    }

    public static Electrodomestico.Colores comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("BLANCO");
        colores.add("METAL");
        colores.add("ROJO");
        colores.add("VERDE");
        colores.add("AZUL");

        if (!(colores.contains(color))) {
            return Electrodomestico.Colores.BLANCO;
        }
        return Electrodomestico.Colores.valueOf(color);
    }
 public static List<Electrodomestico> crearArrayElectrodomesticos() {
    
       List<Electrodomestico> electros = new ArrayList();

        Electrodomestico electro1 = new Electrodomestico(1000, 20, "ROJO", 'A');
        Electrodomestico electro2 = new Electrodomestico(2000, 30, "VERDE", 'B');
        Lavadora electro3 = new Lavadora(3000, 20, "ROJO", 'F', 35);
        Electrodomestico electro4 = new Electrodomestico(4000, 50, "METAL", 'D');
        Lavadora electro5 = new Lavadora(2000, 20, "AZUL", 'E', 45);
        Electrodomestico electro6 = new Electrodomestico(3000, 40, "BLANCO", 'C');
        Televisor electro7 = new Televisor(4000, 5, "METAL", 'A', 30, false);
        Electrodomestico electro8 = new Electrodomestico(1000, 20, "ROJO", 'G');
        Televisor electro9 = new Televisor(3500, 5, "VERDE", 'C', 30, true);

        electros.add(electro1);
        electros.add(electro2);
        electros.add(electro3);
        electros.add(electro4);
        electros.add(electro5);
        electros.add(electro6);
        electros.add(electro7);
        electros.add(electro8);
        electros.add(electro9);
        
         return electros;
 }   
    
   public static double[]  calcularPrecios( List<Electrodomestico>electros) {
        double electrodomesticosPrecio = 0;
        double televisorPrecio = 0;
        double lavadoraPrecio = 0;

        //  private static ArrayList<Electrodomestico> electrodomesticos ArrayList<>
        double[] precios = new double[3];     
        
         for (Electrodomestico e : electros) {
           if (e instanceof Electrodomestico){
             Electrodomestico object = (Electrodomestico) e;
            System.out.println(" "
                    + "\tElectrodomestico el precio final es : "+ e.precioFinal());
              electrodomesticosPrecio += e.precioFinal();
               //continue;
           }
           if (e instanceof Lavadora){
              Lavadora object = (Lavadora) e;
             System.out.println("\tLavadora el precio final es : "+ e.precioFinal());
             lavadoraPrecio += e.precioFinal();
              //continue;
          }
            if (e instanceof Televisor){
                Televisor object = (Televisor) e;
            
              System.out.println("\tTelevisor el precio final es : "+ e.precioFinal());
              televisorPrecio += e.precioFinal();
               //continue;
           }              
    
        precios[0] = electrodomesticosPrecio;
        precios[1] = televisorPrecio;
        precios[2] = lavadoraPrecio;
         }
        return precios;    
   }
}
