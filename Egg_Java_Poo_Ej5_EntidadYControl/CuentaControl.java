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
 * 
 */
package Egg_Java_Poo_Ej5_EntidadYControl;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class CuentaControl {

    Cuenta cuenta = new Cuenta();

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----   Carga de datos -----");
        System.out.println("Ingrese el numero de cuenta : ");
        cuenta.setnCuenta(leer.nextInt());
        System.out.println("Ingrese el N° DNI : ");
        cuenta.setDni(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese nombre y apellido : ");
        cuenta.setNombre(leer.nextLine());
        System.out.println("Ingrese domicilio  : ");
        cuenta.setDomicilio(leer.nextLine());
        System.out.println("Ingrese N° de telefono : ");
        cuenta.setTelefono(leer.nextLine());
        System.out.println("Ingrese el saldo");
        cuenta.setSaldoactual(leer.nextDouble());
       // leer.close();
    }

    public void ingresar(double ingreso) {
        Scanner leer = new Scanner(System.in);
        double saldo;
        saldo = cuenta.getSaldoactual();
        while (ingreso < 0) {
            System.out.println("el importe de a ingresar debe mayor a 0");
            ingreso = leer.nextDouble();
        }
        cuenta.setSaldoactual(saldo + ingreso);
    }

    public void retirar(double retiro) {
        double saldo;
        saldo = cuenta.getSaldoactual();
        if (saldo < retiro) {
            System.out.println("fondos insuficientes......");
            cuenta.setSaldoactual(0);
        } else {
            cuenta.setSaldoactual(saldo - retiro);
        }
    }
    
    public void extraccionRapida(double extrapida) {
        Scanner leer = new Scanner(System.in);
        double saldo;
        saldo = cuenta.getSaldoactual();
            if( saldo * 0.20 >extrapida ){
                    cuenta.setSaldoactual(saldo - extrapida);
            }else{
                    System.out.println("Importe mayor al limite de retiro ......\n .. ingrese otro importe ...");
                    extrapida= leer.nextDouble();
            }
    }
    public void consultarSaldo() {
        System.out.println("Saldo Disponible : "+cuenta.getSaldoactual());
    }

    public void consultarDatos() {
        System.out.println(" -----   Datos personales del cliente   -----   ");
        System.out.println("Cuenta N° :" + cuenta.getnCuenta());
        System.out.println("Nombre : " + cuenta.getNombre());
        System.out.println("Domicilio : " + cuenta.getDomicilio());
        System.out.println("N° de DNI : " + cuenta.getDni());
        System.out.println("N° de teléfono :" + cuenta.getTelefono());
        System.out.println("Saldo disponible :" + cuenta.getSaldoactual());

    }

}
