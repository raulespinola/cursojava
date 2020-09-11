package test;

import domain.*;
public class instanceOf {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Renzo", 100000);
        //determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "ventas");
        determinarTipo(empleado);
    }
       public static void determinarTipo (Empleado empleado){
       // si deseamos determinar el tipo de objecto debemos primero
           // empezar por el chico al mas abarcativo y utilizar el else
        if (empleado instanceof Gerente){
            System.out.println("es del tipo gerente");
            //como no podemos acceder directamente al metodo
            //debemos convertir la variable al tipo hijo
           // para ello se usa instanceof para saber si se puede hacer la conversion de manera segura
            //1.
            Gerente gerente =(Gerente)empleado;
            System.out.println("gerente: " +gerente.getDepartamento());

            //2.este tipo tambien aplica realiza toda la conversion en
            //1 linea
            //((Gerente) empleado).getDepartamento()
        }
        else if (empleado instanceof  Empleado){
            System.out.println("es de tipo empleado");
            //si estamos parados en la clase padre, no podemos acceder a
            //los metodos de la clase hijo, ya que se provocaria
            //un error en tiempo de ejecucion ya que no podemos aplicar
            //la conversion forzada de padre a hijo (CLASS CAST)
            //Gerente gerente =(Gerente)empleado; empleado apunta a la clase padre
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Sueldo: " + empleado.getSueldo());

        }
        else if ( empleado instanceof Object){
            System.out.println("es de tipo object");
            // en el object ya no tenemos acceso a ningun metodo
            empleado.toString();
        }
    }

}
