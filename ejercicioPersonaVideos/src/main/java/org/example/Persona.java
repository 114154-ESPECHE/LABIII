package org.example;

public class Persona {
    private int documento;
    private String nombre, apellido;
    private int edad;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String nombreCompleto()
    {
        return nombre + " " + apellido ;
    }

    public boolean esMayorDeEdad()
    {
        return edad >= 18;
//        ok = false;
//        if (edad >= 18)
//        {
//            ok = true;
//        }
//        return ok;
    }
    public void incremetarEdad()
    {
        edad++;
    }



}
