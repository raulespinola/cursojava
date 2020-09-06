package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado (String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idTeclado = ++contadorTeclados;

    }
    @Override
    public String toString() {
        return  " N° ID : " + idTeclado +
                " Tipo de entrada: " + getTipoEntrada() +
                " Marca:" + getMarca()+
                '\n';
    }
}
