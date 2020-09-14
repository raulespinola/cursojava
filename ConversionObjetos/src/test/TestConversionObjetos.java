package test;
import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {

        Empleado empleado;
        empleado = new Escritor("Juan Acevedo", 1500, TipoEscritura.CLASICO);
       // System.out.println("Empleado = " + empleado);
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }
}
