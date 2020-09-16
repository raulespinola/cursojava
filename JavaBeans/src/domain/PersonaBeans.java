package domain;

import java.io.Serializable;// implementara la interface Serializable desde el paquete java.io

public class PersonaBeans implements Serializable {

    private String nombre;// Para usar JavaBeans los atributos deben ser private
    private String apellido;// deben tener sus setter y getters

    public PersonaBeans(){// Un requisito para utilizar JavaBeans es crear un constructor vacio dentro de la clase
    }

    public PersonaBeans(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

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

    @Override
    public String toString() {
        return "PersonaBeans{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

