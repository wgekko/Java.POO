/*
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package Egg_Java_Poo_MaterialExtraEj5;

/**
 *
 * @author WALTER GOMEZ
 */
public class Meses {

      private String mes;
      
    public Meses() {
    }

    public Meses(String mes) {
        this.mes = mes;
    }
    
       public void setMes(String mes) {
        this.mes = mes;
    }
    
     public static String getMes() {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre",
                "octubre", "noviembre", "diciembre" };
        String mesSecreto = meses[4];
        return mesSecreto;
    }

    
    
}
