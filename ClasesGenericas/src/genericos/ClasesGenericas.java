package genericos;

public class ClasesGenericas <T> {
    private T objeto;// atributo de tipo generico "T"

    public ClasesGenericas (T objeto){
        this.objeto = objeto;
    }
    public void obtenerTipo(){
        System.out.println(" El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
