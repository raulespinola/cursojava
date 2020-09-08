package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    //codigo de bloque estatico se ejecuta antes del constructor
    //se ejecuta 1 vez cuando se carga en memoria la clase
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;

    }
    {//bloque de inicializacion no estatico
        //se ejecuta antes del constructor
        //se ejecuta cada vez que se cree el objeto de la clase
        System.out.println("ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;

    }
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
