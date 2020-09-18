package mx.com.gm.peliculas.datos;



import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosExcepciones;
import mx.com.gm.peliculas.excepciones.EscrituraDatosExcepciones;
import mx.com.gm.peliculas.excepciones.LecturaDatosExcepciones;

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
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosExcepciones {
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosExcepciones {
        return nombreArchivo;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosExcepciones {
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosExcepciones {
    }
}