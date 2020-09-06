package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int  contadorRaton;

    public  Raton (String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idRaton= ++contadorRaton;
    }

    @Override
    public String toString() {
        return
                " N° ID: " + idRaton +
                " Tipo de entrada: "+ super.getTipoEntrada() +
                " Marca: "+ super.getMarca() +
                '\n';

    }
}
