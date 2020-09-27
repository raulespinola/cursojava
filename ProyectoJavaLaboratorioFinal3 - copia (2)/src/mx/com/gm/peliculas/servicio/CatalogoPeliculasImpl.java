package mx.com.gm.peliculas.servicio;

import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl(){

        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_ARCHIVO);
            datos.escribir(pelicula,NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosExcepciones accesoDatosExcepciones) {
            accesoDatosExcepciones.printStackTrace();
            System.out.println("Se ha producido un error. No ha sido posible agregar la Pelicula");
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = datos.listar(NOMBRE_ARCHIVO);
            for (var pelicula: peliculas){
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (LecturaDatosExcepciones lecturaDatosExcepciones) {
            lecturaDatosExcepciones.printStackTrace();
            System.out.println("Se ha producido un error. No ha sido posible Listar");
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(NOMBRE_ARCHIVO, buscar);

        } catch (LecturaDatosExcepciones lecturaDatosExcepciones) {
            lecturaDatosExcepciones.printStackTrace();
            System.out.println("Se ha producido un error. No es posible buscar la pelicula");
        }
        System.out.println("Resultado: " + resultado);

    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)) {
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            }
            else{
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosExcepciones accesoDatosExcepciones) {
            accesoDatosExcepciones.printStackTrace();
            System.out.println("Se ha producido un error. No es posible iniciar el catalogo");
        }
    }
}
