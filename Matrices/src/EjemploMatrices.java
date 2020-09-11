import java.security.spec.RSAOtherPrimeInfo;

public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] edades;
        edades = new int[3][2];
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 30;
        System.out.println("Matriz de enteros indice 0 0: " + edades[0][0]);
        System.out.println("Matriz de enteros indice 0 1: " + edades[0][1]);
        System.out.println("Matriz de enteros indice 1 0: " + edades[0][0]);
        System.out.println("Matriz de enteros indice 1 1: " + edades[0][1]);
        System.out.println("Matriz de enteros indice 2 0: " + edades[0][0]);
        System.out.println("Matriz de enteros indice 2 1: " + edades[0][1]);

        Persona[][] personas = new Persona[1][2];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Ludmila");
        System.out.println("Indice 0: " + personas[0][0]);
        System.out.println("Indice 1: " + personas[0][1]);
        System.out.println();
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Personas indice: " + i + "-" + j +" "+ personas[i][j]);
            }
        }
        String [][] nombres = {{"Teresa", "Cesar","Williams"}, {"Pedro", "Sonia","Pablo"}};
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("Nombres indice: " + i + "-" + j +" "+ nombres[i][j]);
            }
        }

    }
}