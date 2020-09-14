package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada , String marca){
     super(tipoEntrada, marca);
        this.idRaton = ++contadorRaton;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" +
                "idRaton=" + idRaton +
                '}';
    }
}
