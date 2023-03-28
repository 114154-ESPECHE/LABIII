package org.example;
//ctrl + alt + l IDENTAR LINEAS
//ctrl + / PARA COMENTAR
//alt + insert PARA ATAJOS
public class Main {
    public static void main(String[] args) {
        Persona a = new Persona();
        Persona b = new Persona();
        a.setNombre("Agustin");
        a.setEdad(32);
        a.setDocumento(3216548);

        b.setNombre("Carla");
        b.setEdad(35);
        b.setDocumento(321574);

        System.out.println("La persona: " + a.getNombre() + " tiene " + a.getEdad() + " años");

        a.incremetarEdad();
        System.out.println(a.getNombre() + "tiene ahora " + a.getEdad() + " años");
    }
}