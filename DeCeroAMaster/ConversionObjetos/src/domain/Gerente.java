package domain;

public class Gerente extends Empleado {

   private String departamento;

   public Gerente(String nombre, double sueldo, String departamento){
       super(nombre, sueldo);
       this.departamento = departamento;
   }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override// sobreescribo el metodo para agregar el atributo departamento
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
    @Override// sobreescribo el metodo para agregar el atributo departamento
    public String determinarTipo(){
        return super.determinarTipo() + ", departamento: " + this.departamento ;

    }
}
