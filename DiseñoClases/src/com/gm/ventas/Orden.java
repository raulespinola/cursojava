package com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrden;
    private int contadorProductos;
    private static final int MAXPRODUCTOS = 10;


    public Orden() {
        this.idOrden = ++contadorOrden;
        productos = new Producto[MAXPRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        //si los productos agregardos no superan al maxpro
        if (contadorProductos < MAXPRODUCTOS) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Ya se supero el maximo de productos " + MAXPRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();//obtengo el precio y lo sumo en una variable
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden N°: " + idOrden);
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println("Detalle de la orden: "+ productos[i]);
        }
        System.out.println("TOTAL: $ " + calcularTotal());

    }
}