package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras= 10 ;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
    }

    public  void agregarComputadoras(Computadora computadora) {
        if (contadorComputadoras < maxComputadoras) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("ya se supero el maximo de productos " + maxComputadoras);
        }
    }
        public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorComputadoras; i++ ){
            total += computadoras[i].getPrecio();
        }
        return total;
        }
        public void mostrarOrden(){
            System.out.println("Orden N°: " + idOrden);
            for (int i = 0; i < contadorComputadoras; i++){

                System.out.println("Detalle de la orden: " + computadoras[i]);

            }
            System.out.println("PRECIO FINAL: "+ "$"+calcularTotal());
        }
    }

