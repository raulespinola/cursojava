package accesoDatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;// constante public static final (mayuscula y guion bajo)
     void insertar();// metodo de una interface abstracto y publico
     void listar();
     void actualizar();
     void eliminar();

}