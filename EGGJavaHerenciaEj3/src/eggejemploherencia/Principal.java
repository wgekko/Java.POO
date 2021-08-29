/*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
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
package eggejemploherencia;

import eggejemploherencia_Entidad.Electrodomestico;
import eggejemploherencia_Servicio.Electro;
import java.util.*;

/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List< Electrodomestico> electros = Electro.crearArrayElectrodomesticos();

        double precios[] = Electro.calcularPrecios(electros);

        System.out.println("\t\033[33mEl precio de los Electrodomesticos es : " + precios[0]);
        System.out.println("\t\033[33mEl precio de las Lavadoras es : " + precios[2]);
        System.out.println("\t\033[33mEl precio de los Televisores es : " + precios[1]);
        System.out.println("\t\033[33mEl precio total es  :  " + (precios[0] + precios[1] + precios[2]));
    }

}
