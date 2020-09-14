package test;

import accesoDatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        //IAccesoDatos datos = new IAccesoDatos(); No se puede instanciar una clase abstracta ni crear objetos
        IAccesoDatos datos = new ImplementacionMySQL();
       // datos.listar();
        datos.insertar();
        datos.actualizar();
        datos.eliminar();
       // imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        datos.insertar();
        datos.actualizar();
        datos.eliminar();
        imprimir(datos);
    }
        public static void imprimir(IAccesoDatos datos){
            datos.listar();
        }

    }

