/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FcnCuadradaGrafico;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author WALTER GOMEZ
 */
public class FcnCuadradaGrafica {
 public static plano plano;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         //Importante, plano debe ser publico y estatico     
        //Creando la ventana y el plano de dibujo
        Ventana frame = new Ventana();
        
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        
        frame.setBounds(300, 300, 510, 600);
        frame.setLayout(new BorderLayout());
        plano = new plano();
        //Configuración del Boton
        JButton start = new JButton("Iniciar");
        start.addActionListener(frame);
        start.setText("Iniciar");
        //Bordes al panel
        frame.add( plano, BorderLayout.CENTER);
        frame.add(start, BorderLayout.SOUTH);
        frame.setVisible( true );

    }
}

