package Test;
import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        //siempre es mejor indicar el tipo que va a recibir ya que el object es muy generico
        List<String> milista = new ArrayList<>();
        System.out.println("COLECCIONES GENERICA LIST");
        //List es ordenado pero la desventaja es que suele ser
        //mas lento para procesar debido a que guarda el orden
        //con cual se guardan los elementos
        //tambien se puede duplicar los elementos se almacena
        //al final de la lista
        milista.add("Lunes");
        milista.add("martes");
        milista.add("miercoles");
        milista.add("jueves");
        milista.add("viernes");
        String elemento = milista.get(0);
        System.out.println("Elemento:" + elemento);

        imprimir(milista);

        /*for (Object elemento: milista){
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("");

        //funcion lambda
        milista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });*/

        System.out.println("");
        System.out.println("COLECCIONES GENERICA SET");
        //No suele devolver ordenado, la ventaja es mas rapido para
        //agregar objetos
        //no se puede duplicar elementos
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("viernes");
        imprimir(miSet);

        System.out.println("");
        System.out.println("Colecciones GENERICA HASHMAP");
        //se indica un indice para acceder
        //no devuelve organizado
        Map<String,String> mimapa = new HashMap<>();
        mimapa.put("valor1","JUan");
        mimapa.put("valor2","Carla");
        mimapa.put("valor3","Rosario");
        //si agrego otro dato con un valor de llave repetido sobreescribe el anterior
        mimapa.put( "valor3", "gregorio");


        String elemento1 =mimapa.get("valor1");
        System.out.println("elemento: "+ elemento1);
        imprimir(mimapa.keySet());
        imprimir(mimapa.values());
    }
    //utilizamos un tipo mas generico que abarque ambas colecciones
    public static void imprimir(Collection<String> coleccion){
        for (String elemento: coleccion){
            System.out.println("Elemento = " + elemento);
        }
        /*coleccion.forEach(elemento -> {
            System.out.println("Elemento: "+ elemento);
        });*/
    }

}
