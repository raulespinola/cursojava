package enumeracion;
import enumeracion.Dias;
import enumeracion.Continentes;
public class TestEnumeraciones {
    public static void main(String[] args) {

        //System.out.println("DIA 1: " + Dias.LUNES);
       // indicarDiaSemana(Dias.JUEVES);
        System.out.println("Continente numero 4 " + Continentes.AMERICA);
        System.out.println("Numero de paises de este continente: " + Continentes.AMERICA.getPaises());

        System.out.println("Continente numero 4 " + Continentes.AFRICA);
        System.out.println("Numero de paises de este continente: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias){
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

        }

    }
}

