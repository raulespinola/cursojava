package test;

import excepciones.OperacionExcepcion;

import static aritmetica.Aritmetica.division;//agrego static y division

// Runtime exception  el compilador no muestra error ya que este  ocurre en tiempo de ejecucion
//Uncheck exception no requiere procesar la excepcion
public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;

        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e){
            System.out.println("Error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }// Puedo agregar excepciones y tipificarlas
        catch (Exception e){
            e.printStackTrace(System.out);
            System.out.println("Ocurrio un error de tipo Excepcion");
            System.out.println(e.getMessage());
        }// envuelvo la linea del conflicto con un bloque Try/Catch
         // (Exception puedo llamarla como lo desee e, x, z...*/
        // RunTimeException tampoco requiere el bloque trycatch
        //el compilador No mostrara error pero a la hora de ejecutar el programa se mostrara el problema

        finally {//finally hace que el bloque TryCatch se ejecute siempre haya o no una excepcion
            System.out.println("Se reviso la division entre cero");
        }

        System.out.println("resultado = " + resultado);// El resultado impreso es el de inicializacion
        //no el resultado de la operacion
    }
}
