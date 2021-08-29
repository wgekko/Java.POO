/*
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
15
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
package Principal;

import java.text.DecimalFormat;
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

        List<Edificio> ed = new ArrayList();
        DecimalFormat df = new DecimalFormat("##,###.##");

        Edificio ed1 = new Polideportivo("Polideportivo # 1 ", "abierto", 56.7, 135.6, 4.5);
        Edificio ed2 = new Polideportivo("Polideportivo # 2 ", "cerrado", 66.4, 167.6, 4.5);
        Edificio ed3 = new EdificioOficina(120, 486, 4, 33.4, 55.7, 12.0);
        Edificio ed4 = new EdificioOficina(300, 878, 6, 44.5, 45.8, 18.0);

        ed.add(ed1);
        ed.add(ed2);
        ed.add(ed3);
        ed.add(ed4);

        for (Edificio e : ed) {
            if (e instanceof Polideportivo) {
                Polideportivo obj = (Polideportivo) e;
                System.out.println(" nombre " + ((Polideportivo) e).getNombre()
                        + "\n tiene una superficie en m2 de : " + df.format(e.calcularSup())
                        + "\n y un volumen de : " + df.format(e.calcularVol()));
                //continue;
            }
            if (e instanceof EdificioOficina) {
                EdificioOficina obj = (EdificioOficina) e;
                System.out.println(" Edificio de Oficina con  : " + ((EdificioOficina) e).getCantPersOfic()
                        + " oficinas  \n tiene una superficie en m2 de : " + df.format(e.calcularSup())
                        + "\n y un volumen de : " + df.format(e.calcularVol()));
                //continue;
            }

        }

    }
}
