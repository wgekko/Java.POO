/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
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

/**
 *
 * @author WALTER GOMEZ
 */
public class MatematicaControl {
    Matematica operacion = new Matematica();

    public MatematicaControl(double numero1, double numero2) {
        operacion.setNumero1(numero1);
        operacion.setNumero2(numero2);
    }

    public double devolverMayor() {
        double n1 = operacion.getNumero1();
        double n2 = operacion.getNumero2();
        double m= Math.max(n1, n2);
        return m;
      
    }

    public int calcularPotencia() {      
        int  n1 = (int) Math.round(operacion.getNumero1());
        int n2 = (int) Math.round(operacion.getNumero2());
         return (int)  Math.pow(Math.max(n1, n2), Math.min(n1, n2));
    /*
        if (devolverMayor() == n1) {
            return (int) Math.pow(n1, n2);
        } else  {
            return (int) Math.pow(n2, n1);
        }
     */
    }

    public double calcularRaiz() {
        
        int n1 = Math.abs((int) operacion.getNumero1());
        int n2 = Math.abs((int) operacion.getNumero2());
        return Math.sqrt(Math.min(n1, n2));
       /* 
        if (devolverMayor() == 1) {
            return Math.sqrt(n2);
        } else {
            return Math.sqrt(n1); 
        }
*/
    }
    
}
