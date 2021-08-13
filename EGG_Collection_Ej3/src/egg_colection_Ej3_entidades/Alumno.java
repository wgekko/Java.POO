/*
 *Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.

 */
package egg_colection_Ej3_entidades;

import java.util.HashSet;

/**
 *
 * @author WALTER GOMEZ
 */
public class Alumno {
    private String nombreAlumno;
    private HashSet<Integer> notas;

    public Alumno() {
        this.notas = new HashSet();
    }

    public Alumno(String nombreAlumno, HashSet<Integer> notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    public HashSet<Integer> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<Integer> notas) {
        this.notas = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }
    
}
