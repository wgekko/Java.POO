/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
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
package egg_colection_Ej3_servivios;

import egg_colection_Ej3_entidades.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ServiciosAlumno {
    
    private Scanner leer;
    //aca creo mi Coleccion de Objetos Perros
    private ArrayList<Alumno> alumnosList;

    /**
     * constructor sin parametros (o vacio) pero que instacia el scanner y la
     * lista
     */
    public ServiciosAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnosList = new ArrayList();
    }
//Metodo privado porque lo voy a llamar solo desde esta clase

    private Alumno creaAlumno() {
        System.out.println("Ingrese el nombre del Alumno...");
        String nombre = leer.next().toUpperCase();
        HashSet<Integer> notas = new HashSet(3);
        System.out.println("Ingrese las 3 notas del alumno");
        System.out.print("nota# 1 :"); int n1 = leer.nextInt();
        notas.add(n1);
        System.out.print("nota# 2 :");int n2 = leer.nextInt();
        notas.add(n2);
        System.out.print("nota# 3 :");int n3 = leer.nextInt();
        notas.add(n3);

        Alumno a = new Alumno(nombre, notas);
        alumnosList.add(a);

        return a;
    }

    public void crearAlumnos() {
        char op;   
        do {
            creaAlumno();//llamo al metodo privado que pide los datos al usuario
            System.out.println("Desea agregar otro Alumno"
                    + " Si=S / N0= N ...");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');   
    }

    public void notaFinal() {
        System.out.println("Digite el nombre del alumno  que desea calcular la nota final");
        String buscado = leer.next().toUpperCase();
        Iterator<Alumno> it = alumnosList.iterator();// se genera el Iterator con la lista de alumnos
        while (it.hasNext()) {
            Integer acumulaNota = 0;//se inicializa la variable para acumular las notas en cero 
//Objeto auxiliar de la clase Alumno conde voy a ir asignando las iteraciones de it            
            Alumno aux = it.next(); 
//comparo si el nombre del objeto auxiliar es igual al nombre "buscado"            
            if (aux.getNombreAlumno().equals(buscado)) {  //cuando encuentra el nombre crea una coleccion HashSet auxiliar para asignar las
//notas del alumno encontrado y asi poder recorrer y sumar las notas
                HashSet<Integer> notasAux = aux.getNotas();
                for (Integer notaFin : notasAux) {
                    acumulaNota += notaFin;
                }
                System.out.println("La nota final promedio  del alumno  : " +aux.getNombreAlumno()+" es de : "+ acumulaNota / 3);
            }

        }
    }
    
}
