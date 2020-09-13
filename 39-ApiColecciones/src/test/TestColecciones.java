package test;
import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List milista = new ArrayList();
        System.out.println("COLECCIONES LIST");
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
        System.out.println("COLECCIONES SET");
        //No suele devolver ordenado, la ventaja es mas rapido para
        //agregar objetos
        //no se puede duplicar elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("viernes");
        imprimir(miSet);

        System.out.println("");
        System.out.println("Colecciones HASHMAP");
        //se indica un indice para acceder
        //no devuelve organizado
        Map mimapa = new HashMap();
        mimapa.put("valor1","JUan");
        mimapa.put("valor2","Carla");
        mimapa.put("valor3","Rosario");

        String elemento =(String)mimapa.get("valor1");
        System.out.println("elemento: "+ elemento);
        imprimir(mimapa.keySet());
    }
    //utilizamos un tipo mas generico que abarque ambas colecciones
    public static void imprimir(Collection coleccion){
        /*for (Object elemento: coleccion){
            System.out.println("Elemento = " + elemento);
        }*/
        coleccion.forEach(elemento -> {
            System.out.println("Elemento: "+ elemento);
        });
    }

}
