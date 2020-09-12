package domain;


import java.io.Serializable;

//para ser considerado java bean debe primero poseer la caracteristica
//Serializable esto significa convertir el objeto a CEROS y UNOS (bits)
//para que las demas tecnologias puedan hacer uso del mismo
public class PersonaBean implements Serializable {
//los atributos deben ser Private
     private String nombre;
     private String apellido;

     //es obligatorio tener el constructor vacio

    public PersonaBean (){

    }
   public PersonaBean (String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
   }
   // debe tener los getter and setter por cada atributo
    //privado


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //es opcional agregar hash and equals

    @Override
    public String toString() {
        return "PersonaBean{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
