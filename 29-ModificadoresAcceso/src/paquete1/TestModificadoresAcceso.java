package paquete1;
import paquete1.ClaseHija;
import paquete1.Clase1;
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Private");
        //no se puede acceder al ser protected,solo atravez de una clase hija
        //al ser publico se puede acceder libremente
        /*System.out.println("clase 1 = " + clase1.atributoPublico);
        clase1.metodoPublico();*/

        //Protected nos brinda seguridad al usar herencia sobre los atributos y metodos ya
        //que los protegemos para que puedan ser modificados y accedidos
        //desde la clase hija

        /*ClaseHija clasehija = new ClaseHija();
        System.out.println("clase Hija = " + clasehija);*/

        //acceso por default nos brinda mas seguridad ya que solamente
        //se puede acceder a los atributos y metodos desde el mismo
        //paquete
        /*clase1.atributoDefault = "cambio desde la prueba";
        System.out.println("clase1 atributo default: "+clase1.atributoDefault );
        clase1.metodoDefault();*/

        //Private la unica manera de acceder es atravez de los getter y setter
        clase1.setAtributoPrivate("cambio de valor");
        System.out.println("Clase1 =" + clase1.getAtributoPrivate());


    }
}
