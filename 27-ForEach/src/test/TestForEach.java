package test;
import  domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,10};
        for(int edad: edades){
            System.out.println("Edad = "+ edad);
        }
        Persona personas[] = {new Persona ("juan"),new Persona("marcos"),new Persona ("Renzo")};
        for (Persona persona: personas){
            System.out.println("persona = "+ persona);
        }
    }

}
