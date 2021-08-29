/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
11
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg
$100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
12
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electro también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package eggjavaherenciaej.pkg2;
/**
 *
 * @author WALTER GOMEZ
 */
public class Electrodomestico {
 
     //Constantes   
    /**
     * Color por defecto
     */
    protected final static String COLOR_DEF="blanco";   
    /**
     * Consumo energetico por defecto
     */
    protected final static char CONSUMO_ENERGETICO_DEF='F';   
    /**
     * Precio base por defecto
     */
    protected final static double PRECIO_BASE_DEF=1000;   
    /**
     * Peso por defecto
     */
    protected final static double PESO_DEF=5;   
    //Atributos    
    /**
     * El precio base del electrodomestico
     */
    protected double precioBase;   
    /**
     * Color del electrodomestico
     */
    protected String color;   
    /**
     * Indica el consumo energetico del electrodomestico
     */
    protected char consumoEnergetico;   
    /**
     * Peso del electrodomestico
     */
    protected double peso;    
    
    //Constructores   
    /**
     * Contructor por defecto
     */
    public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }   
    /**
     * Contructor con 2 parametros
     * @param precioBase del electrodomestico
     * @param peso del electrodomestico
     */
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }   
    /**
     * Constructor con 4 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    //Métodos privados   
    private void comprobarColor(String color){
   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }                  
    }
      
    /**
     * Comprueba el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     * @param consumoEnergetico
     */
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }          
    }
   
    //Métodos publicos
    /**
     * Devuelve el precio base del electrodomestico
     * @return precio base del electrodomestico
     */
    public double getPrecioBase() {
        return precioBase;
    }
    /**
     * Devuelve el color del electrodomestico
     * @return color del elesctrodomestico
     */
    public String getColor() {
        return color;
    }   
     /**
     * Devuelve el consumo energetico del electrodomestico
     * @return consumo energetico del electrodomestico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    /**
     * Devuelve el peso del electrodomestico
     * @return peso del electrodomestico
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Precio final del electrodomestico
     * @return precio final del electrodomestico
     */
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=1000;
                break;
            case 'B':
                plus+=800;
                break;
            case 'C':
                plus+=600;
                break;
            case 'D':
                plus+=500;
                break;
            case 'E':
                plus+=300;
                break;
            case 'F':
                plus+=100;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=100;
        }else if(peso>=20 && peso<49){
            plus+=500;
        }else if(peso>=50 && peso<=79){
            plus+=800;
        }else if(peso>=80){
            plus+=1000;
        }
   
        return precioBase+plus;
    }  
    
}
    

