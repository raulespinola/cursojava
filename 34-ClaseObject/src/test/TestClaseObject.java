package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado =  new Empleado("Renzo", 5000);
        Empleado empleado2 = new Empleado("Renzo", 5000);

        if (empleado == empleado2){
            System.out.println("Tienen la misma referencia en memoria");

        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }

    if (empleado.equals(empleado2)){
        System.out.println("los objetos son iguales en contenido");
    }else{
        System.out.println("los objetos son distinto en contenido");
    }

    if (empleado.hashCode() == empleado2.hashCode()){
        System.out.println("El valor hashcode es igual");
    }else {
        System.out.println("el valor es distinto");
    }
    }
}
