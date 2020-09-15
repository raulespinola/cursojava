package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private final Computadora[] computadoras;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Ha excedido el limite de ingresos disponibles " + MAX_COMPUTADORAS);
        }
    }

    public int calcularTotalXOrden() {
        int total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            total = contadorComputadoras;
        }
        return total;

    }

    public void mostrarOrden() {
        System.out.println("NUMERO DE ORDEN: " + idOrden);
        System.out.println("TOTAL DE COMPUTADORAS POR ORDEN " + idOrden + "= " + calcularTotalXOrden() + " UNIDADES");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println("DETALLE:");
            System.out.println(computadoras[i]);
        }
    }

  }

