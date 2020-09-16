package manejoArchivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();//En este punto se crea el archivo
            System.out.println("Se ha creado el archivo");
            } catch (FileNotFoundException e) {
            e.printStackTrace();//El compilador alerta la posible excepcion y ofrece el bloque tryCatch }
            }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);

         try {
                PrintWriter salida = new PrintWriter(archivo);
                salida.println(contenido);
                salida.close();
                System.out.println("Se ha escrito al archivo");
         } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
        }
    }
    public static void anexarArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));// otra excepcion requiere otro Catch
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado contenido al archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();// posible excepcion agregamos otro Catch
            while(lectura!= null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();//cerramos el flujo
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        // BufferReader permite leer lineas completas del archivo se almacena caracter a caracter.

    }
}
