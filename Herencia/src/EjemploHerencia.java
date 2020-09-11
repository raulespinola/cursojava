import java.util.Date;

public class EjemploHerencia {
    public static void main (String [] args){
        Empleado empleado1 = new Empleado("Juan", 30000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Buenos Aires 1453");
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Carla");
        cliente1.setEdad(31);
        cliente1.setDireccion("Luis Campos 34");
        cliente1.setGenero('F');
        System.out.println("cliente1 = " + cliente1);
    }
}
