package Ventas;
import com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Remera",30);
        Producto producto3 = new Producto("Pantalon",100);
        Producto producto4 = new Producto("Buzo",40);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden1.mostrarOrden();
        orden1.calcularTotal();
        orden2.mostrarOrden();
        orden2.calcularTotal();
    }
}
