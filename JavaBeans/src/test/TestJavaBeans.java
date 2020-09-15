package test;

import domain.PersonaBeans;

public class TestJavaBeans {
    public static void main(String[] args) {

        PersonaBeans persona1 = new PersonaBeans();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");

        System.out.println("persona1 = " + persona1);
        System.out.println("Persona Nombre = " + persona1.getNombre());
        System.out.println("Persona Apellido = " + persona1.getApellido());
    }
}
