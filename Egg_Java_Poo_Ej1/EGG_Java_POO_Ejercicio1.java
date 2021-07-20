/*
POO Ejercicio # 1 
Crear  una clase llamada Libro que contenga los siguientes atributos 
ISBN, tiltulo, Autor, Nùmero pàgina, y un constructor con todos los atributos 
pasados por paràmetro y un constructor vacio. Crear un mètodo para 
cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor  del libro y el número de páginas *

 */
package Egg_Java_Poo_Ej1;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        Libro libro1[ ] =new Libro[3];
        String dIsbn =" "; String dTitulo =" "; String dAutor=""; int dPag=0;
        
        /*
        datos para cargar el el arreglo
        978-849-75925-81 - EL nombre de la Rosa - Umberto Eco - 784
        978-844-14213-32 El arte de la guerra - Sun Tzu - 194
        978-987-20609-47 - EL pendulo de Foulcault - Umberto Eco - 832
        
        */
        
        for (int i = 0; i < libro1.length; i++) {
            System.out.println("Está ingresando  "+(i+1)+" de 3 libros ...");
            System.out.println("Ingrese el  n° ISBN (formato 000-000-0000-0)");
            dIsbn= leer.nextLine().toUpperCase().trim();
             System.out.println("Ingrese el  título del libro :");
            dTitulo= leer.nextLine().toUpperCase().trim();
             System.out.println("Ingrese el  Autor del libro :");
            dAutor= leer.nextLine().toUpperCase().trim();
             System.out.println("Ingrese la cantidad de paginas :");
            dPag= leer.nextInt();
            leer.nextLine();
            libro1[i]= new Libro(dIsbn, dTitulo, dAutor, dPag);
        }
        for (int i = 0; i < libro1.length; i++) {
            System.out.println("N° de ISBN: "+libro1[i].getIsbn()+"\t Título :"+libro1[i].getTitulo()+"\t Autor :"+libro1[i].getAutor()+"\t Total de páginas :"+libro1[i].getPag());
            
        }
        
        /* se muestra desde un metodo de la clase Libro -.
           Libro libro = new Libro();
        libro.setLibro("84-473-0000-5", "El Nombre de la Rosa", "Umberto Eco", 467);
        libro.getLibro(); */
    }
    
}
