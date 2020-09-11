package domain;

public class gerente extends Empleado{
    private String departamento;

    public gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento=departamento;
    }

    @Override // modifica de cierta manera los comportamientos del metodo desde la clase hija
    //debe poseer el mismo nombre del metodo padre
    public String obtenerInformacion (){
      return super.obtenerInformacion() + " Departamento: " + this.departamento;
    }
}
