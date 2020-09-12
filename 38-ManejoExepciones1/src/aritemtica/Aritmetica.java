package aritemtica;

import Excepciones.OperacionExcepcion;

public class Aritmetica {
   /* //throws puede llegar a arrojar
    public static int division (int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0 ){
            //throw arroja la excepcion
            throw new OperacionExcepcion("Division entre 0");
        }
        return numerador/denominador;
    }*/

    public static int division (int numerador, int denominador){
        if (denominador == 0 ){
            //throw arroja la excepcion
            throw new OperacionExcepcion("Division entre 0");
        }
        return numerador/denominador;
    }
}
