package test;
import domain.*;
public class TestClasesAbs {
    public static void main(String[] args) {
        //Una de las reglas de las clases abst es que no
        // se puede crear un objeto de ella
        //el objetivo es no trabajar con la clase padre
        //FiguraGeometrica figura = new FiguraGeometrica();

        //upcasting aplicamos un tipo hijo a un tipo padre
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        //aplicamos polimorfismo al llamar el metodo dibujar
        // en tiempo de ejecucion se decide cual se tiene que
        //ejectuar ( padre o hijo)
        figura.dibujar();

    }
}
