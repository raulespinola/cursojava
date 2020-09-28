package test;

import genericos.ClasesColeccionesGenericas;

public class TestColeccionesGenerics {
    public static void main(String[] args) {
        ClasesColeccionesGenericas<Integer> objetoInt = new ClasesColeccionesGenericas<>(15);
        // modificamos un objeto a un entero utilizando Integer
        //Autoboxing
        objetoInt.obtenerTipo();
        ClasesColeccionesGenericas<String> objetoString = new ClasesColeccionesGenericas<>("Luisa");
        objetoString.obtenerTipo();
    }
}
