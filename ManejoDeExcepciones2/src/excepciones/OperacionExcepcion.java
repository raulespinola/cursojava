package excepciones;
//check exception requiere un proceso para indicar la excepcion
public class OperacionExcepcion  extends Exception{

    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
