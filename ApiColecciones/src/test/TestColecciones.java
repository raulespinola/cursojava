package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {

        List miLista = new ArrayList();
        //La variable miLista almacenara cada elemento (Dias de la semana)
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Viernes");
        //la lista mantiene el orden de los elementos conforme se van agregando
        // List permite a diferencia de Set duplicar elementos
        //imprimir(miLista);
        /*for(Object elemento: miLista){// Utilizamos el metodo foreach para recorrer los elementos de la lista
            //  la lista tiene elementos de tipo object//
            System.out.println("elemento = " + elemento);

        }*/
        /*miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        // Utilizacion del ciclo forEach  con otra sintaxis como alternativa al anterior
        // no utilizamos Var ni indicamos el tipo Object*/

        Set miSet = new HashSet(); //el metodo Set no reproduce el orden en que fueron agreados los elementos
        miSet.add(miSet);// el metodo add corresponde a la interface padre Collection
        // Set y List son clases hijas de Collection por esto acceden a sus metodos
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //imprimir(miSet);// se imprime en un orden diferente al que fueron agregados los elementos
        // se recomienda el uso de Set cuando se requiere mayor velocidad en las operaciones y no interesa el orden
        // Set no permite duplicar elementos se elimina

        Map miMap = new HashMap();
        miMap.put("Valor1", "Juan");// Object key/ Object value
        miMap.put("Valor2", "Sonia");// se usa el metodo put heredado de la interface padre Map
        miMap.put("Valor3", "Alfredo");

        //String elemento = miMap.get("Valor1"); dado que Valor1 es de tipo Object debemos convertirlo (Downcasting)
        String elemento = (String)miMap.get("Valor1"); // Downcasting de object a String
        System.out.println("elemento = " + elemento);
        imprimir(miMap.keySet());//El metodo keySet no va a regresar todos los datos solo los set (valor1,valor2...)
        imprimir(miMap.values());// imprime todos los valores primeros Object key y luego Object Value
    }

    public static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {// Utilizamos el metodo foreach para recorrer los elementos de la lista
            //  la lista tiene elementos de tipo object//
            System.out.println("elemento = " + elemento);
        }
    }
}
