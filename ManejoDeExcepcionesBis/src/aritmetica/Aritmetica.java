package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador){//throws OperacionExcepcion
        //throws palabra reservada, firma en el metodo que indica que es posible que se produzca una excepcion
        //en RunTimeException la firma en el metodo no es necesaria
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero");
            // throw palabra reservada para crear un objeto de tipo excepcion
        }
        return numerador/denominador;

    }
}
