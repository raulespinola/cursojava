package test;
import domain.*;
public class TestJavaBean {

    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        //se utiliza el SET para cargar los datos
        //y se usa el GET para leer los datos
        persona.setApellido("Espinola");
        persona.setNombre("Renzo");

        System.out.println(persona);
        System.out.println("NOMBRE: "+ persona.getNombre());
        System.out.println("APELLIDO: " + persona.getApellido());

    }
}
