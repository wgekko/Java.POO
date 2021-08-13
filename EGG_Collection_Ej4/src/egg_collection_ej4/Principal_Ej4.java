/*
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.

 */
package egg_collection_ej4;
import egg_colection_Ej4_servicios.ServiciosPelicula;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


/**
 *
 * @author WALTER GOMEZ
 */
public class Principal_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {

        
        ServiciosPelicula movie = new ServiciosPelicula();
        
        movie.pedirPelis();
        robotLimpiador();  System.out.println("\n\n");  
        
        movie.mostrarPelis();
        
         for (int i = 0; i <= 1; i++) {
            retardarSegundo();
            System.out.println("... Se esta generando la información espero un momento......");
            retardarSegundo();
        }
        movie.buscarHora();
            for (int i = 0; i <= 1; i++) {
            retardarSegundo();
             System.out.println("... Se esta generando la información espero un momento......");
            retardarSegundo();
        }
        movie.ordenarPeliXDuracionMayor();
          for (int i = 0; i <= 1; i++) {
            retardarSegundo();
             System.out.println("... Se esta generando la información espero un momento......");
            retardarSegundo();
        }
          movie.ordenarPeliXDuracionMenor(); 
         for (int i = 0; i <= 1; i++) {
            retardarSegundo();
             System.out.println("... Se esta generando la información espero un momento......");
            retardarSegundo();
        }
        movie.ordenarPeliXTitulo(); 
     
         for (int i = 0; i <= 1; i++) {
            retardarSegundo();
             System.out.println("... Se esta generando la información espero un momento......");
            retardarSegundo();
        }
        movie.ordenarPeliXDirector();
        
    }
    public static void robotLimpiador() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    }

    private static void retardarSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
