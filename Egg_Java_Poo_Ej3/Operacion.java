/*
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
17
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package Egg_Java_Poo_Ej3;

/**
 *
 * @author walter
 */
public class Operacion {
    
    private  int numero1; private  int numero2;
    
     public Operacion() {
         
    }
    
    public Operacion(int n1, int n2) {
        this.numero1=n1;
        this.numero2=n2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int n1) {
        this.numero1 = n1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int n2) {
        this.numero2 = n2;
    }
      public void crearOperacion(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    public int getSumar(){
        int suma=0;
        suma = this.numero1+this.numero2;
        return suma;
    }
   public int getRestar(){
      int restar=0;
      restar= this.numero1-this.numero2;
       return restar;
   }
   public int getMultiplicacion(){
       int multi=0;
       if (this.numero1==0|| this.numero2==0){
           return multi=0;
       }else{
       multi=this.numero1*this.numero2;
       return multi;
   }
       }
public float getDivision(){
    float div=0;
    if (this.numero1==0 || this.numero2==0){
        return div=0;
    }else {
        div=this.numero1/this.numero2;
        return div;
    }
    
}
    
    
    
}
