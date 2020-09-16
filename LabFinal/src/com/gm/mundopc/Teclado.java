package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada , String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" +
                "idTeclado=" + idTeclado +
                '}';
    }
}
