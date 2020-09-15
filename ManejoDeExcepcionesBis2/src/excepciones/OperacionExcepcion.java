package excepciones;
//uncheck exception el compilador no requiere un proceso para indicar la excepcion
public class OperacionExcepcion  extends RuntimeException{

    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
