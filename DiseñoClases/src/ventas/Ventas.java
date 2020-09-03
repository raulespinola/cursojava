package ventas;
import com.gm.ventas.*;
import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        String respuesta = "no";
        String respuestaOrden = "no";
        char respuestaPedido = 0;
        Scanner scanner = new Scanner(System.in);
        //se crea el objeto orden
        Orden orden1 = new Orden();

        System.out.println("Ingrese la opcion que desea realizar ");
        System.out.println("1: Cargar Orden.-");
        System.out.println("2: Salir.- ");

        respuestaPedido = scanner.next().charAt(0);
        //verificacion de ingreso de datos
        if (respuestaPedido == '1' || respuestaPedido == '2') {
            if (respuestaPedido == '1') {
                do {
                    System.out.println("Desea cargar la Orden ");
                    respuesta = scanner.next();
                    while (respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("S") || respuesta.equals("si")|| (respuesta.equals("s"))) {
                        //si su8 repuesta es arfimativa  solicita el ingreso de los datos del producto
                        System.out.println("Ingrese el nombre del producto y el precio ");
                        String nombre = scanner.next();
                        double precio = scanner.nextDouble();
                        //se crea el objeto producto
                        Producto p1 = new Producto(nombre, precio);
                        //se agregan los productos a la orden
                        orden1.agregarProducto(p1);
                        System.out.println("Desea ingresar otro producto? ");
                        respuesta = scanner.next();
                    }

                    orden1.mostrarOrden();


                    System.out.println("Desea Continuar");
                    respuestaOrden = scanner.next();
                } while (respuestaOrden.equals("si") || respuestaOrden.equals("Si") || respuestaOrden.equals("SI") || respuestaOrden.equals("sI") || respuestaOrden.equals("s") || respuestaOrden.equals("S"))
                        ;
                System.out.println("SALIR");

            } else System.out.println("SALIR");

        } else System.out.println("INGRESO ERRONEO VUELVA A INTENTAR ");

        }
    }
