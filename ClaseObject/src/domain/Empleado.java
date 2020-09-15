package domain;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + " , sueldo: " + this.sueldo;
    }

    public String determinarTipo(){
        return "Nombre: " + this.nombre + " , Sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  "Nombre='" + nombre + '\'' +
                ", Sueldo=" + sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.getSueldo(), getSueldo()) == 0 &&
                getNombre().equals(empleado.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getSueldo());
    }
}
