/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.* 

 */
package DistPuntosGrafica;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.BasicStroke;
import java.awt.Color;
 
import javax.swing.JFrame;
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author WALTER GOMEZ
 */
public class PuntosControl {
     
    
    public Puntos crearPuntos() {

        Puntos punto = new Puntos();
             
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x  del punto :");
        punto.setX(leer.nextDouble());
        System.out.println("Ingrese la coordenada y  del punto :");
        punto.setY(leer.nextDouble());

        return punto;
    }

    public void distancia(Puntos punto1, Puntos punto2) {
        DecimalFormat df = new DecimalFormat("###.##");
        double c1 = (punto2.getX() - punto1.getX());
        double c2 = (punto2.getY() - punto1.getY());
        double distancia = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("la distancia ente los puntos es :" + df.format(distancia));

    }
    public void tipoRecta( Puntos punto1 , Puntos punto2){
        double d1= punto1.getX() - punto2.getX();
        double d2= punto1.getY()- punto2.getY();
        int pendiente = (d1==0 && d2==0)?0:
                                   (d1 !=0 && d2==0)?1:
                                   (d1 ==0 && d2!=0)?2:
                                   (d2/d1>0)?3:4;
        switch(pendiente){
            case 0: System.out.println(" No exite la recta... es sólo un punto....");break;
            case 1: System.out.println(" Es una recta horizontal...."); break;
            case 2:System.out.println(" Es una recta vertical......");break;
            case 3: System.out.println(" Es una recta con pendiente positiva....."); break;
            case 4: System.out.println(" Es una recta con pendiente negativa.....");break;
            default: System.out.println(" Error, en los datos "); break;
        }
    }     
    
    public void graficar(Puntos punto1, Puntos punto2){
        double ejx = (punto1.getX()>punto2.getX())? Math.abs(punto1.getX())+2:Math.abs(punto2.getX())+2;
         double ejy = (punto1.getY()>punto2.getY())? Math.abs(punto1.getY())+2:Math.abs(punto2.getY())+2;
        
        XYSeries pto = new XYSeries("Puntos ingresados");
        pto.add(punto1.getX(), punto1.getY());
        pto.add(punto2.getX(), punto2.getY());
        XYSeries ejex = new XYSeries("ejex");
        ejex.add(ejx, 0.0);
        ejex.add(-ejx, 0.0);
        XYSeries ejey = new XYSeries("ejey");
         ejey.add(0.0, ejy);
         ejey.add(0.0, -ejy);
        XYSeriesCollection dataset = new XYSeriesCollection();      
        dataset.addSeries(pto);
        dataset.addSeries(ejex);
        dataset.addSeries(ejey);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Grafico de la distancia entre  XY", 
                "Eje X", 
                "Eje Y", 
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
        XYPlot plot = xylineChart.getXYPlot();        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();             
        renderer.setSeriesPaint(0, Color.BLUE);    
         renderer.setSeriesPaint(1, Color.BLACK);    
          renderer.setSeriesPaint(2, Color.BLACK);    
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));       
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));       
         renderer.setSeriesStroke(2, new BasicStroke(3.0f));       
        plot.setRenderer(renderer);
        
        ChartPanel panel = new ChartPanel(xylineChart); 
        // Creamos la ventana
        JFrame ventana = new JFrame("Eje Cartesiano");
        ventana.setVisible(true);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.add(panel);
}
}