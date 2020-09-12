package domain;

public class Rectangulo extends FiguraGeometrica {

public Rectangulo (String tipoFigura){
    super(tipoFigura);
}
//al implementar ya no se aplica el abstract

    @Override
    public void dibujar(){
    //getclass obtenemos el tipo  de la clase
        //simplename obtenemos el nombre de la clase
        System.out.println("figura: " + this.getClass().getSimpleName());
}

}
