/*
POO Ejercicio # 1 
Crear  una clase llamada Libro que contenga los siguientes atributos 
ISBN, tiltulo, Autor, Nùmero pàgina, y un constructor con todos los atributos 
pasados por paràmetro y un constructor vacio. Crear un mètodo para 
cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor  del libro y el número de páginas
*/
package Egg_Java_Poo_Ej1;

/**
 *
 * @author WALTER GOMEZ
 */
public class Libro {
      private String isbn;
    private String titulo;
    private String autor;
    private int pag;
    
        public Libro(String isbn, String titulo, String autor, int pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }

    public Libro() {
        isbn = " ";
       titulo = " ";
       autor = " ";
       pag = 0;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }
/*
    public void setLibro(String isbn, String titulo, String autor, int pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }
    public void getLibro() {
        System.out.println(this.isbn+" - "+this.titulo+" - "+this.autor+" - "+this.pag);
         System.out.println("N° de codigo ISBN: "+this.isbn);
        System.out.println("Título libro : "+this.titulo);
        System.out.println("Autor : "+this.autor);
        System.out.println("total de páginas "+this.pag);
    }
    */
}
