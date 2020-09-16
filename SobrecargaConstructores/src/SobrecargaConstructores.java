public class SobrecargaConstructores {
    public static void main (String [] args){
        Persona persona1 = new Persona("Lilia", 22);
        System.out.println("persona1 = " + persona1);
        Empleado empleado1 = new Empleado("Juan", 23, 18000);
        System.out.println("empleado1 = " + empleado1);
    }
}
