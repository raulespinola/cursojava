package test;

import Excepciones.OperacionExcepcion;

import static aritemtica.Aritmetica.division;

public class TestExepciones {
    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10, 0);

        }//se debe empezar por las excepciones de menor jerarquia
        catch(OperacionExcepcion e){
            System.out.println("ocurrio un erro de tipo Operacion Excepcion");
            System.out.println(e.getMessage());
        }
            //capturamos la exepcion en la variable e
        catch (Exception e){
              System.out.println("Ocurrio un error de tipo exception ");
              //imprimimos por pantalla el error capturado
              //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        //siempre se ejecuta por mas que haya exepciones
        finally {
            System.out.println("Se reviso la division entre 0");
        }
            System.out.println("Resultado: " +resultado);
    }
}
