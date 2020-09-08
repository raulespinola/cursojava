
public class TestArgumentosVariables {
    public static void main(String[] args) {
          imprimirNumeros(3,4,5);
          imprimirNumeros(2,1,5,3);
          variosParametros("Juan",2,3,4,5,6);
    }
    //se debe definir primero los demas argumentos y dejar al final VarArg
    private static void  variosParametros (String nombre, int... numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    //al definir el tipo de dato mas ... estamos creando un array sin determinar el maximo de los datos
    private  static void imprimirNumeros (int... numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento: " + numeros [i]);
        }
    }
}
