package com.gm.mundopc;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private double precio;


    private Computadora(){

    }

    public Computadora (String nombre, Monitor monitor, Teclado teclado, Raton raton, double precio){

        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
       /* this.monitor = new Monitor(monitor.getMarca(),monitor.getTamaño());
        this.teclado = new Teclado(teclado.getTipoEntrada(), teclado.getMarca()) ;
        this.raton = new Raton(raton.getTipoEntrada(),raton.getMarca());*/
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor= new Monitor(monitor.getMarca(),monitor.getTamaño());
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
        /*this.teclado = new Teclado(teclado.getMarca(),teclado.getTipoEntrada());*/
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = new Raton(raton.getTipoEntrada(),raton.getMarca());
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio (double precio){
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "Computadora" + '\n' +
                /*"idComputadora=" + idComputadora*/
                ", Nombre:' " + nombre + '\n' +
                ", Monitor: " + monitor +
                ", Teclado: " + teclado +
                ", Raton: " + raton +
                '\n';
    }
}
