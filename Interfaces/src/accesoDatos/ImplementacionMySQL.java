package accesoDatos;

public class ImplementacionMySQL implements IAccesoDatos {
    @Override
    public void insertar() {// metodos implementados por primera vez NO se estan sobreescribiendo
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
    }//implements palabra reservada
    // para el comportamiento de una interface

}
