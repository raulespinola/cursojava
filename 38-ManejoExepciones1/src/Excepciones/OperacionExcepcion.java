package Excepciones;

/*public class OperacionExcepcion extends Exception {

    public OperacionExcepcion(String mensaje){
        super(mensaje);

    }*/
public class OperacionExcepcion extends RuntimeException {

    public OperacionExcepcion(String mensaje){
        super(mensaje);

    }

}
