package test;

import domain.Empleado;

public class TestClaseObjects {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado ("Antonio Rios", 3500);
        Empleado empleado2 = new Empleado ("Antonio Rios" , 3500);

     if (empleado1 == empleado2){//comparacion Referencia en memoria
         System.out.println("Los objetos tienen la misma referencia en memoria.");
     }
     else{
         System.out.println("Los objetos tienen distintas referencias en memoria.");
     }
    if( empleado1.equals(empleado2)){// comparacion contenido de los objetos, metodo equals regresa true o false
        System.out.println("Los objetos son iguales en contenidos.");
    }
    else{
        System.out.println("Los objetos tienen diferentes contenidos.");
    }
    if (empleado1.hashCode() == empleado2.hashCode()){// comparacion por un valor entero.
        System.out.println("El valor HashCode de ambos objetos es igual.");
    }
    else{
        System.out.println("El valor HashCode de ambos objetos es diferente.");
    }

    }
}
