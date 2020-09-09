package paquete1;
/*
public class Clase1 {
    public String atributoPublico = "Valor atributo publico";
    //cuando es protected no se aplica a clases pero si a los atributos y metodos

    protected String atributoProtected = "Valor atributo protected";

    public Clase1(){
        System.out.println ("Constructor Publico");
    }

     //aplica a los constructores solo pueden ser usadas por clases hijas
     //siempre es recomendable usar el protected para las clases que heredan (hijas)

    protected Clase1(){
        System.out.println ("Constructor Protected");
    }

    public Clase1 (String arg){
        System.out.println("Constructor Protected");
    }
    public void metodoPublico (){
        System.out.println ("Metodo Publico");
    protected void metodoProtected (){
        System.out.println ("Metodo Protected");
}
}*/
/*
class Clase1{
    String atributoDefault = "valor atributo default o package";

    Clase1() {
        System.out.println("Constructor default o package");
    }
    void metodoDefault(){
        System.out.println("Metodo default o package");
    }*/
class Clase1 {
private String atributoPrivate ="valor atributo private";

 private Clase1(){
     System.out.println("Constructor privado");
 }
 public Clase1(String arg){
     this();
     System.out.println("Constructor publico");
 }
 private void metodoPrivado(){
     System.out.println("Metodo private");
 }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
}
