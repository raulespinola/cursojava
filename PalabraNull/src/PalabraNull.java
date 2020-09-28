public class PalabraNull {
    public static void main (String[] args){
    Persona per1 = new Persona("Juan");
        System.out.println("per1 = " + per1.obtenerNombre());
        Persona per2 = per1;
        System.out.println("per2 = " + per2.obtenerNombre());
        per1 = null; // la variable per1 ya no apunta a ningun objeto
        per2 = null;
        System.gc();
        //System.out.println("per1 = " + per1.obtenerNombre());
        if (per1 != null){
            System.out.println("per1 = " + per1.obtenerNombre());
        }

        }
    }

class Persona{
    String nombre;
    Persona (String nombre){
        this.nombre = nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
}