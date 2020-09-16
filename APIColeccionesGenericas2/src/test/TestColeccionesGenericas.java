package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        List <String> miLista = new ArrayList<>();
        //String entre <> para indicar el tipo con el cual se trabajara
        // del lado derecho no es necesario detallar el tipo
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Viernes");
        String elemento1 =  miLista.get(0);//Indicamos el indice (0) que corresponde a "Lunes"
        //System.out.println("elemento = " + elemento1);
        //imprimir(miLista);
        /*for(Object elemento: miLista){
            //  la lista tiene elementos de tipo String//
            System.out.println("elemento = " + elemento);
        }
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });*/

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //imprimir(miSet);

        Map<String, String> miMap = new HashMap<>();//indicamos de forma separada los tipos para  key y Value
        miMap.put("Valor1", "Juan");// Object key/ Object value
        miMap.put("Valor2", "Sonia");
        miMap.put("Valor3", "Alfredo");

        String elementoMap = miMap.get("Valor1");// ya no requiere conversion por haberse especificado el tipo String
        System.out.println("Elemento Map = " + elementoMap);
        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }

    public static void imprimir(Collection<String> coleccion) {// se detalla que la coleccion es de tipo String
        for (String elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}



