package test;

import genericos.ClasesGenericas;

public class TestGenerics {
    public static void main(String[] args) {
        ClasesGenericas<Integer> objetoInt = new ClasesGenericas<>(15);
        // modificamos un objeto a un entero utilizando Integer
        //Autoboxing
        objetoInt.obtenerTipo();
        ClasesGenericas <String> objetoString = new ClasesGenericas<>("Luisa");
        objetoString.obtenerTipo();
    }
}
