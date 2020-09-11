package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Renzo",25000, TipoEscritura.MODERNO);
        //System.out.println("Empleado : " + empleado );


        //System.out.println(empleado.obtenerDetalles());
        //se convierte la variable al tipo de la clase hija
        //en este caso hay que indicar al compilador
        //DOWNCASTING
        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();

        //Asignar una variable del tipo hija al tipo padre el compilador no tiene problemas
        //UPCASTING
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());

    }
}
