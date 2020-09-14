package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica() {} por ser una clase abstracta no permite crear objetos
         FiguraGeometrica figura = new Rectangulo("Rectangulo"); // UpCasting
         figura.dibujar();

    }

}
