package genericos;

public class ClasesColeccionesGenericas<T> {
    private T objeto;// atributo de tipo generico "T"

    public ClasesColeccionesGenericas(T objeto){
        this.objeto = objeto;
    }
    public void obtenerTipo(){
        System.out.println(" El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
