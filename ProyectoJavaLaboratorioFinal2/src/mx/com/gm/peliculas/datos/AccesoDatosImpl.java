package mx.com.gm.peliculas.datos;



import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosExcepciones {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosExcepciones {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
           while(linea != null){
               Pelicula pelicula = new Pelicula(linea);
               peliculas.add(pelicula);
               linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException a) {
            a.printStackTrace();
            throw new LecturaDatosExcepciones("Se produjo una excepcion al listar peliculas:" + a.getMessage());
        } catch (IOException a) {
            a.printStackTrace();
            throw new LecturaDatosExcepciones("Se produjo una excepcion al listar peliculas:" + a.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosExcepciones {
        File archivo = new File(nombreArchivo);
                try {
            PrintWriter salida = new PrintWriter (new FileWriter(archivo, anexar));
                    salida.println(pelicula.toString());
                    salida.close();
                    System.out.println("Se ha escrito nueva informacion dentro del archivo: " + pelicula);
                } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosExcepciones("Se produjo una excepcion al escribir peliculas:" + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosExcepciones {
        File archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;

            while (linea != resultado) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    return "La pelicula: " + linea + ". Ha sido  encontrada en el numero de indice: " + indice;
                }
                linea = entrada.readLine();
                indice = indice + 1;
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones ("Se produjo una excepcion al buscar peliculas:" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosExcepciones ("Se produjo una excepcion al buscar peliculas:" + e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosExcepciones {
        File archivo = new File(nombreArchivo);
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosExcepciones("Se produjo una excepcion crear el archivo: " + e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosExcepciones {

        File archivo = new File(nombreArchivo);
        if (archivo.exists()){
            archivo.delete();
            System.out.println("El archivo ha sido borrado");

        }
    }
}