package com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (contadorProductos < MAX_PRODUCTOS){
            //agregamos el producto
            //incrementamos el contador
            productos[contadorProductos++]= producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos " + MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total = total + productos[i].getPrecio();
        }
            return total;

    }
    public void mostrarOrden(){
        System.out.println("Nummero de Orden: " + idOrden );
        System.out.println("Total de la Orden: $ " + calcularTotal() );
        System.out.println("Lista de Productos de la Orden");

        for(int i = 0; i < contadorProductos; i++){
            System.out.println(productos[i]);

        }
    }
}