package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {

    /*public ClaseHija (){
        super();
        this.atributoProtected=("modificar atributo protected");
        System.out.println(" Atributo Protegido : " + this.atributoProtected);
         this.metodoProtected();
    }*/
    //se debe hacer extends de la clase padre para poder acceder a los atributos y metodos
    /*public ClaseHija (){
        super();
        this.atributoDefault=("modificar atributo protected");
        System.out.println(" Atributo Protegido : " + this.atributoDefault);
        this.metodoDefault();
    }*/
    //acceso private
    public ClaseHija (){
        super("public");
    }
}


