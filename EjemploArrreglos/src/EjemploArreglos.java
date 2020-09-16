public class EjemploArreglos {
    public static void main(String[] args) {
        int[] edades;
        edades = new int[3];
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        System.out.println("Indice cero = " + edades[0]);
        System.out.println("Indice uno =  " + edades[1]);
        System.out.println("Indice dos =  " + edades[2]);

        Persona[] personas;
        personas = new Persona[4];
        personas[0] = new Persona("Pedro");
        personas[1] = new Persona("Luisa");
        System.out.println("Indice 0: " + personas[0]);
        System.out.println("Indice 1: " + personas[1]);
        System.out.println("Indice 2: " + personas[2]);
        System.out.println("Indice 3: " + personas[3]);

        String nombres[] = {"Raul", "Luana", "Paula", "Marcos"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Indice: " + i + " Nombre: "+ nombres[i]);
        }
    }
}
