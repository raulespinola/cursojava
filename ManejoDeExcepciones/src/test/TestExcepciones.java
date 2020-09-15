package test;

public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;

        try {
           resultado = 10 / 0;// linea de codigo que genera el error
       } catch (Exception e){
            e.printStackTrace(System.out);
            System.out.println("Error por excepcion");
       }// envuelvo la linea del conflicto con un bloque Try/Catch
        // (Exception puedo llamarla como lo desee e, x, z...

        System.out.println("resultado = " + resultado);// El resultado impreso es el de inicializacion
        //no el resultado de la operacion
    }
}
