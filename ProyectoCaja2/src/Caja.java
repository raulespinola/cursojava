package caja;

public class Caja {

       private int alto;
       private int ancho;
       private int profundidad;
// Constructor Vacio
       public  Caja (){
        }
        //Constructor con parametros

    public Caja (int alto, int ancho, int profundidad){
         this.alto = alto ;
         this.ancho = ancho;
         this.profundidad = profundidad;
        }
     int calcularVolumenCaja(){
                         return alto * ancho * profundidad;
        }

     int calcularVolumenCaja(int alto, int ancho, int profundidad) {
           return alto * ancho * profundidad;
     }
}

