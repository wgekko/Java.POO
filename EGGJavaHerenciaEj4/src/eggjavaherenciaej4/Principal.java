/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjavaherenciaej4;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Triangulo t = new Triangulo(3.45, 6.55, 4.79);
        DecimalFormat at = new DecimalFormat("###.##"); // se cargan datos directamente 
        JOptionPane.showMessageDialog(null, " - Triángulo....\n" + "lado 1 : 3,45 cm\n " + "lado 2 : 6,55 cm\n " + " lado 3 : 4,79 cm\n " + " - Área del triángulo   : "
                + at.format(t.area()) + " - Perimetro del triángulo   : " + at.format(t.perimetro()));
        Rectangulo r = new Rectangulo(6.70, 4.29);
        DecimalFormat ar = new DecimalFormat("###.##");// se cargan datos directamente 
        JOptionPane.showMessageDialog(null, " - Rectángulo...\n" + "lado 1 : 6,70 cm\n " + "lado 2 : 4,29 cm\n " + " - Área del rectángulo   :  "
                + ar.format(r.area()) + " - Perímetro del rectángulo   :  " + ar.format(r.perimetro()));
        Circulo cir = new Circulo(7.34, 2.35);
        DecimalFormat c = new DecimalFormat("###.##");// se cargan datos directamente 
        JOptionPane.showMessageDialog(null, " - Circulo....\n" + " diametro  : 7,34 cm\n " + " radio : 2,35 cm\n " + " - Área del cículo   :  "
                + c.format(cir.area()) + " - Perímetro del cículo   :  " + c.format(cir.perimetro()));
    }

}
