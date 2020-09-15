package test;

import static aritmetica.Aritmetica.division;//agrego static y division

// Runtime exception  el compilador no muestra error ya que este  ocurre en tiempo de ejecucion
//Uncheck exception no requiere procesar la excepcion
public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;

        try {
           resultado = division(10, 0);
       } catch (Exception e){
            e.printStackTrace(System.out);
            System.out.println("Error por excepcion");
            System.out.println(e.getMessage());
       }// envuelvo la linea del conflicto con un bloque Try/Catch
        // (Exception puedo llamarla como lo desee e, x, z...

        System.out.println("resultado = " + resultado);// El resultado impreso es el de inicializacion
        //no el resultado de la operacion
    }
}
