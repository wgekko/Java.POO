/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Egg_Java_Poo_Ej5_EntidadYControl;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dato = "";
        double ingreso = 0, retiro = 0, extrapida = 0;

        CuentaControl cuenta = new CuentaControl();
        // ingresamos los datos de la cuenta         
        cuenta.crearCuenta();
        // ingresar dinero a la cuenta 
        do {
            // se muestra por consola el saldo disponible 
            cuenta.consultarSaldo();
            System.out.println("Desea ingresar dinero en la cuenta ....(SI=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
            if (dato.equals("S")) {
                System.out.println("ingrese el importe a ingresar ...");
                ingreso = leer.nextDouble();
                cuenta.ingresar(ingreso);
            } else { break; }
        } while (dato.equals("S"));

       // leer.nextLine(); // limpio la variable dato
        // retirar dinero 
        do {
            // se muestra por consola el saldo disponible 
            cuenta.consultarSaldo();
            System.out.println("Desea hacer un retiro dinero en la cuenta ....(SI=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
            if (dato.equals("S")) {
                System.out.println("ingrese el importe a retirar ...");
                retiro = leer.nextDouble();
                cuenta.retirar(retiro);
            } else {  break;  }
        } while (dato.equals("S"));

        //leer.nextLine(); // limpio la variable dato
        do {
            // se muestra por consola el saldo disponible 
            cuenta.consultarSaldo();
            System.out.println("Desea hacer un extracción rápida  dinero en la cuenta ....(SI=s / NO=n)");
            dato = leer.nextLine().toUpperCase().trim();
            if (dato.equals("S")) {
                System.out.println("ingrese el importe de la extracción rápida ...");
                extrapida = leer.nextDouble();
                cuenta.extraccionRapida(extrapida);
            } else {  break;  }
        } while (dato.equals("S"));

        leer.nextLine(); // limpio la variable dato        
        // consulta de datos personales 
        System.out.println("Desea consultar los datos personales del cliente ....(SI=s / NO=n)");
        dato = leer.nextLine().toUpperCase().trim();
        if (dato.equals("S")) {
            cuenta.consultarDatos();
        }

        System.out.println("   -----   fin del programa   -----   \n");

    }

}
