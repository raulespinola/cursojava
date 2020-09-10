package domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente (String nombre, double sueldo, String departamento){
    super(nombre, sueldo);
    this.departamento=departamento;
    }
    @Override // modifica de cierta manera los comportamientos del metodo desde la clase hija
    public String obtenerDetalles(){
         return super.obtenerDetalles() + ", Departamento: " + this.departamento;

  }
}
