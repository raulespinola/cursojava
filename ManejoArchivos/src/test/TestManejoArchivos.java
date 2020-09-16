package test;

import static manejoArchivos.ManejoArchivos.crearArchivo;
import static manejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";
        //crearArchivo(nombreArchivo);
       // escribirArchivo(nombreArchivo ,"Hola desde Java");
       // escribirArchivo(nombreArchivo, "Adios");//Este metodo sobreescribe lo ingresado anteriormente
        //anexarArchivo(nombreArchivo,"Hola desde Java");
       //anexarArchivo(nombreArchivo, "Adios");//Este metos agrega contenido sin borrar el anterior
        leerArchivo(nombreArchivo);
    }
}
