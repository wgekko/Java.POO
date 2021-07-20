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
package Egg_Java_Poo_Ej4_EntidadYControl;

/**
 *
 * @author WALTER GOMEZ
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
    
     @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}
