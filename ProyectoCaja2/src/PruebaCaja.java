package caja;

 public class PruebaCaja {
    public static void main (String args []){

        int medidaAlto = 3;
        int medidaAncho = 2;
        int medidaProfundidad = 6;

        Caja caja1 = new Caja();

        int volumenCaja = caja1.calcularVolumenCaja(medidaAlto,medidaAncho, medidaProfundidad);
        System.out.println("volumen Caja 1 = " + volumenCaja);

        Caja caja2 = new Caja(3,1,3);
        System.out.println("volumen Caja 2 = " + caja2.calcularVolumenCaja());

        Caja caja3 = new Caja(2, 4, 3);
        System.out.println("Volumen Caja 3: " + caja3.calcularVolumenCaja());
    }
}
