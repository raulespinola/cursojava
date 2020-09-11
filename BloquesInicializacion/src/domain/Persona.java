package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    static{
        System.out.println("Ejecucion Bloque Estatico");
        ++Persona.contadorPersonas;
    }
    {
        System.out.println("Iniciacion de bloque NO estatico");
        this.idPersona=contadorPersonas++;
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
