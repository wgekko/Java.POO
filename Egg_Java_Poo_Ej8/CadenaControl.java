/*
 * * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Egg_Java_Poo_Ej8;

/**
 *
 * @author WALTER GOMEZ
 */
public class CadenaControl {
    
    Cadena cadena = new Cadena();

    public void crearFrase(String frase) {
        cadena.setFrase(frase);
    }

    public int mostrarVocales() {
        int vocales = 0;
        int longitud = cadena.getLongitud();
        String frase = cadena.getFrase().toUpperCase().trim();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals("A") || frase.substring(i, (i + 1)).equals("E")
                    || frase.substring(i, (i + 1)).equals("I") || frase.substring(i, (i + 1)).equals("O")
                    || frase.substring(i, (i + 1)).equals("U")) {
                vocales += 1;
            }
        }
        return vocales;
    }

    public String invertirFrase() {
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        String fraseInvertida = "";
        int i = longitud;
        while (i > 0) {
            fraseInvertida += frase.substring((i - 1), i);
            i -= 1;
        }
        return fraseInvertida;
    }

    public int vecesRepetido(String letra) {
        int repetido = 0;
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals(letra)) {
                repetido += 1;
            }
        }
        return repetido;
    }

    public void compararLongitud(String fraseIngresada) {
        String fraseInicial = cadena.getFrase();
        if (fraseInicial.length() > fraseIngresada.length()) {
            System.out.println("La frase " + fraseInicial + " es más larga...");
        } else {
            System.out.println("La frase " + fraseIngresada + " es más larga...");
        }
        if (fraseInicial.length() == fraseIngresada.length()) {
            System.out.println("Ambas frases son iguales en longitud...");
        }
    }

    public void unirFrases(String fraseIngresada) {
        String fraseInicial = cadena.getFrase();
        String frase;
        System.out.println("Ingrese la frase/palabra a unir...");
        frase = fraseInicial + " " + fraseIngresada;
        System.out.println(frase);
    }

    public void reemplazar(String letra) {
        String frase = cadena.getFrase();
        String nuevaFrase = "";
        int longitud = cadena.getLongitud();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals("a")) {
                nuevaFrase += letra;
            } else {
                nuevaFrase += frase.substring(i, (i + 1));
            }
        }
        System.out.println(nuevaFrase);
    }

    public boolean contiene(String letra) {
        int longitud = cadena.getLongitud();
        boolean contiene = false;
        String frase = cadena.getFrase();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals(letra)) {
                return true;
            }
        }
        return contiene;
    }
    
}
