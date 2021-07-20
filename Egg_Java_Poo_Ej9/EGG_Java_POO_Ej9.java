/*
 *Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
20
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 


 */
package Egg_Java_Poo_Ej9;

import java.text.DecimalFormat;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej9 {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
          DecimalFormat df = new DecimalFormat("###.##");
        double numero1, numero2;
         numero1 = (Math.random() * (10-1)+1);
         numero2 = (Math.random() * (10-1)+1);
         System.out.println("Numero 1: " + df.format(numero1));
         System.out.println("Numero 2: " + df.format(numero2));
         MatematicaControl operacion = new MatematicaControl(numero1, numero2);
         System.out.println("El numero mayor es: " + df.format(operacion.devolverMayor()));
         System.out.println("La potencia es: " + operacion.calcularPotencia());
         System.out.println("La raiz es: " +df.format(operacion.calcularRaiz()));      
        System.out.println("--- fin del programa ---\n");
    }
  
}
   

