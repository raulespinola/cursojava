package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("ENUMERACIONES");
        System.out.println("DIAS DE LA SEMANA");
        System.out.println("Dia 1: "+ Dias.LUNES);
        System.out.println("");
        // NO se pueden pasar cadenas para el switch
        System.out.println("El martes es el ");
        indicarDiaSemana(Dias.MARTES);

        System.out.println("");
        System.out.println("CONTINENTES");
        System.out.println("");
        System.out.println("Continente n° 4: " + Continentes.ASIA);
        System.out.println("N° de paises en el 4to contienente: "+ Continentes.ASIA.getPaises());
        System.out.println("Continente n° 1: " + Continentes.AFRICA);
        System.out.println("N° de paises en el 4to contienente: "+ Continentes.AFRICA.getPaises());
    }
    private static void indicarDiaSemana (Dias dias){
     switch (dias){
         case LUNES:
             System.out.println("Primer dia de la semana");
             break;
         case MARTES:
             System.out.println("Segundo dia de la semana");
             break;
         case MIERCOLES:
             System.out.println("Tercer dia de la semana");
             break;
         case JUEVES:
             System.out.println("Cuarto dia de la semana");
             break;
         case VIERNES:
             System.out.println("Quinto dia de la semana");
             break;
         case SABADO:
             System.out.println("Sexto dia de la semana");
             break;
         case DOMINGO:
             System.out.println("Septimo dia de la semana");
             break;
     }
    }
}
