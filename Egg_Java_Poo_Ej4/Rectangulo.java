/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Egg_Java_Poo_Ej4;
/**
 *
 * @author walter
 */
public class Rectangulo {
    private float base; private float altura;

    public Rectangulo() {
    }

    public Rectangulo( float b, float a) {
        this.altura= a;
        this.base = b;
    }
    
    
    public float getBase() {
        return base;
    }

    public void setBase(float b) {
        this.base = b;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }
    
     public void crearRectangulo(float b, float a) {
        this.base = b; this.altura=a;
    }

    public float getSuperficie() {
        float sup;
        sup = this.base* this.altura;
        return sup;
    }

    public float getPerimetro() {
        float perimetro;
        perimetro =(this.base+this.altura)  * 2;
        return perimetro;
    }
    public void dibujarRectangulo(float b, float a){
          
        int altura = (int ) a; int base=(int) b;    
        
          System.out.println("El dibuja el rectángulo .....\n");
              for(int i = 0; i < base; i++) {
                System.out.print("*");
            }
            System.out.println();       
            for (int i = 0; i < altura-2; i++) {
             System.out.print("*");
                for (int j = 0; j < base-2; j++) {
                  System.out.print(" ");   
                }
                 System.out.println("*");   
        }
               for(int i = 0; i < base; i++) {
                System.out.print("*");
            }
        System.out.println("\n");
    }
}
