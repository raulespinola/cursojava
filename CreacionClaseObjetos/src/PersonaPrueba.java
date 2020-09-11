public class PersonaPrueba {
    public static void main(String[] args){
//Creacion de un objeto
        Persona persona1 = new Persona();
        //Llamando a un metodo del objeto creado

        System.out.println("Valores por default del objeto Persona");
        //persona1.desplegarNombre();
        //modificar valores de nuestro objeto
        persona1.nombre = "Luisa";
        persona1.apellidoPaterno = "Garin";
        persona1.apellidoMaterno = "Quiriconi";
        persona1.desplegarNombre();
        //Creacion de un segundo objeto
        Persona persona2 = new Persona();
        System.out.println( "Creacion de un nuevo objeto");
        persona2.nombre = "Raul";
        persona2.apellidoPaterno = "Espinola";
        persona2.desplegarNombre();


    }
}
