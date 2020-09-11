package test;
import domain.*;

public class TestPolimorfismo {

    public static void main(String[] args) {

        Empleado empleado = new Empleado ("Renzo", 1000);
        imprimir(empleado);
        //Reutilizamos las misma variable, al ser del tipo padre se puede asignar la referencia
        // del tipo hija
        empleado = new gerente("Carlos", 10000, "Ventas");
        imprimir(empleado);
    }
    //AQUI OCURRE POLIMORFISMO
    //Multiples comportamientos depenesdiendo al objeto que te apuntando en memoria
    //en tiempo de ejecucion se va deciendo que comportamiento utilizar
    public static void imprimir (Empleado empleado){
        System.out.println(empleado.obtenerInformacion());
    }

}
