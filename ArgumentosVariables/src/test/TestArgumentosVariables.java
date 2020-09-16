package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {

        imprimirNumeros(5,7);
        System.out.println("");
        imprimirNumeros(2,5,1);
        variosParametros("ArregloVariable", 2,4);
    }
    private static void variosParametros(String nombre, int...numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int...numeros){
        for (int i= 0; i < numeros.length; i++){
            System.out.println("Elemento: " + numeros[i]);

        }
    }
}
