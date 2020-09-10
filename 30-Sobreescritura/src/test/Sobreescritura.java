package test;

import domain.Gerente;

public class Sobreescritura {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Renzo", 25000, "Ciruja");
        System.out.println("Gerente1= "+ gerente1.obtenerDetalles());
    }
}
