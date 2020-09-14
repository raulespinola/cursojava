public class PalabraThis {
    public static void main (String [] args){
Persona persona = new Persona("Juan");
    }
}
class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);
    }
}
class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Impresion argumento = " + p);
        System.out.println("Impresin Objeto actual(this) " + this);
    }
}