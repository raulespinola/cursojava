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
        System.out.println("elemento = " + elemento1);
        imprimir(miLista);
        /*for(Object elemento: miLista){
            //  la lista tiene elementos de tipo String//
            System.out.println("elemento = " + elemento);
        }
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });*/

        Set miSet = new HashSet();
        miSet.add(miSet);

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //imprimir(miSet);

        Map miMap = new HashMap();
        miMap.put("Valor1", "Juan");// Object key/ Object value
        miMap.put("Valor2", "Sonia");
        miMap.put("Valor3", "Alfredo");

        //String elemento = miMap.get("Valor1");
        String elemento = (String)miMap.get("Valor1");
        //System.out.println("elemento = " + elemento);
       // imprimir(miMap.keySet());
       // imprimir(miMap.values());
    }

    public static void imprimir(Collection<String> coleccion) {// se detalla que la coleccion es de tipo String
        for (Object elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}



