package mundopc;
import com.gm.mundopc.*;

import java.util.Scanner;

public class MundoPc {
    public static void main(String[] args) {
      /*  String nombre = "ASUS";
        double precio = 255000;
        Monitor m1 = new Monitor("LG",25.5);
        Raton r1 = new Raton ("USB1", "GENIUS");
        Teclado t1 = new Teclado("USB2","novatech");
        Computadora c1 = new Computadora(nombre,m1,t1,r1,precio);
        Orden o1 = new Orden();
        o1.agregarComputadoras(c1);
        o1.mostrarOrden();

    }
}*/
       double tamañoMonitor = 0;
        String marcaMonitor ="NINGUNO";
        String tipoEntradaR = "NINGUNO";
        String marcaRaton = "NINGUNO";
        String tipoEntradaTeclado = "NINGUNO";
        String marcaTeclado = "NINGUNO";
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
                    while (respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("S") || respuesta.equals("si") || (respuesta.equals("s"))) {
                        //si su repuesta es arfimativa  solicita el ingreso de los datos del producto
                        System.out.println("Ingrese el nombre de la computadora ");
                        String nombre = scanner.next();
                        //se crea el objeto producto
                        System.out.println("Desea agregar perifericos de entrada y salida?");
                        String respPerifercos = scanner.next();
                        if ((respPerifercos.equals("Si") || respPerifercos.equals("SI") || respPerifercos.equals("S") || respPerifercos.equals("si") || (respPerifercos.equals("s")))) {

                            System.out.println("Ingrese el nombre del monitor y tamaño");
                            marcaMonitor = scanner.next();
                            tamañoMonitor = scanner.nextDouble();
                            Monitor m1 = new Monitor(marcaMonitor, tamañoMonitor);
                            System.out.println("ingrese el tipo de entrada del raton y su marca");
                            tipoEntradaR = scanner.next();
                            marcaRaton = scanner.next();
                            Raton r1 = new Raton(tipoEntradaR, marcaRaton);
                            System.out.println("Ingrese el tipo de entrada del Telcado y su marca");
                            tipoEntradaTeclado = scanner.next();
                            marcaTeclado = scanner.next();
                            Teclado t1 = new Teclado(tipoEntradaTeclado, marcaTeclado);
                            System.out.println("ingrese el precio final ");
                            double precio = scanner.nextDouble();
                            Computadora c1 = new Computadora(nombre, m1, t1, r1,precio);
                            orden1.agregarComputadoras(c1);
                            orden1.mostrarOrden();
                            System.out.println("Desea ingresar otro producto? ");
                            respuesta = scanner.next();

                        } else {
                            System.out.println("Ingrese el precio final");
                            double precio = scanner.nextDouble();
                            Monitor m1 = new Monitor(marcaMonitor, tamañoMonitor);
                            Teclado t1 = new Teclado(tipoEntradaTeclado, marcaTeclado);
                            Raton r1 = new Raton(tipoEntradaR, marcaTeclado);
                            Computadora c1 = new Computadora(nombre, m1, t1, r1, precio);
                            orden1.agregarComputadoras(c1);
                            //se agregan los productos a la orden
                            orden1.mostrarOrden();
                            System.out.println("Desea ingresar otro producto? ");
                            respuesta = scanner.next();
                        }



                    }
                    System.out.println("Desea Continuar");
                    respuestaOrden = scanner.next();
                }while (respuestaOrden.equals("si") || respuestaOrden.equals("Si") || respuestaOrden.equals("SI") || respuestaOrden.equals("sI") || respuestaOrden.equals("s") || respuestaOrden.equals("S"))
                        ;
                System.out.println("SALIR");

            } else System.out.println("SALIR");

        } else System.out.println("INGRESO ERRONEO VUELVA A INTENTAR ");

    }
}
