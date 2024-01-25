package org.example;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private float promedio;

    public Alumno(String nombre, String apellido, int edad, float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public float getPromedio() {
        return promedio;
    }
}
