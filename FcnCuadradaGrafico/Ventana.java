/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FcnCuadradaGrafico;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import FcnCuadradaGrafico.FcnCuadradaGrafica;


/**
 *
 * @author WALTER GOMEZ
 */
public class Ventana extends JFrame implements ActionListener{
     @Override

    public void actionPerformed(ActionEvent e) { 
       FcnCuadradaGrafica.plano.paintSQRFunc(FcnCuadradaGrafica.plano.getGraphics(),-0.2,2,-15,-200,200);

    }
}
