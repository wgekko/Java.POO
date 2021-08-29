/*
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
15
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
package Principal;

/**
 *
 * @author WALTER GOMEZ
 */
public class EdificioOficina extends Edificio {
    
    protected  Integer nroOfic, cantPersOfic, nroPisos;

    public EdificioOficina() {
        super();
    }

    public EdificioOficina(Integer nroOfic, Integer cantPersOfic, Integer nroPisos) {
        this.nroOfic = nroOfic;
        this.cantPersOfic = cantPersOfic;
        this.nroPisos = nroPisos;
    }

    public EdificioOficina(Integer nroOfic, Integer cantPersOfic, Integer nroPisos, double ancho, double largo, double alto) {
        super(ancho, alto, largo);
        this.nroOfic = nroOfic;
        this.cantPersOfic = cantPersOfic;
        this.nroPisos = nroPisos;
    }
    

    public Integer getNroOfic() {
        return nroOfic;
    }

    public void setNroOfic(Integer nroOfic) {
        this.nroOfic = nroOfic;
    }

    public Integer getCantPersOfic() {
        return cantPersOfic;
    }

    public void setCantPersOfic(Integer cantPersOfic) {
        this.cantPersOfic = cantPersOfic;
    }

    public Integer getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(Integer nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public String toString() {
        return "EdificioOficiona " + "\n Número de oficinas  :" + nroOfic + "\n Cantidad de personas por oficinas : " + cantPersOfic + "\n Númeor de Pisos : " + nroPisos + " -";
    }

    @Override
    public double calcularSup() {
           double sup=0;
      sup= largo* ancho*nroPisos;
        return sup;
    }

    @Override
    public double calcularVol() {
       double vol=0;
        vol = largo* ancho*alto;
        return vol;
    }
    

   
    
}
