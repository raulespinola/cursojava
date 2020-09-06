package com.gm.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private  static int contadorMonitor;

    private Monitor (){
        this.idMonitor = ++contadorMonitor;
    }
    public Monitor (String marca, double tamaño){
       this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return
                "N° ID : " + idMonitor +
                ", Marca: '" + marca + '\'' +
                ", Tamaño: " + tamaño + "' "+
                '\n';
    }
}
