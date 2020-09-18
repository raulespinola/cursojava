package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosExcepciones;
import mx.com.gm.peliculas.excepciones.EscrituraDatosExcepciones;
import mx.com.gm.peliculas.excepciones.LecturaDatosExcepciones;

import java.util.List;

public interface IAccesoDatos {

    String nombreArchivo = "peliculas.txt";

     boolean existe(String nombreArchivo) throws AccesoDatosExcepciones;

     List<Pelicula> listar(String nombrePelicula) throws LecturaDatosExcepciones;

     void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosExcepciones;

     String buscar(String nombreArchivo, String buscar) throws LecturaDatosExcepciones;

     void crear(String nombreArchivo) throws AccesoDatosExcepciones;

     void borrar(String nombreArchivo) throws AccesoDatosExcepciones;

}
