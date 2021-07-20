/*
 *Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Egg_Java_Poo_MaterialExtraEj1;

/**
 *
 * @author WALTER GOMEZ
 */
public class EGG_Java_POO_MaterialExtraEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Si bastasen un par de canciones", "Eros Ramazzotti");
        System.out.println(cancion.getAutor());
        System.out.println(cancion.getTitulo());
        cancion.setAutor("Mariah Carey");
        cancion.setTitulo("Heroe ");
        System.out.println(cancion.getAutor());
        System.out.println(cancion.getTitulo());

    }

}
