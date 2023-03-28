package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        /*
        1-
        Declarar dos variables enteras y cargar sus valores por teclado.
        Informar su suma, diferencia, producto y cociente.
        int num1, num2;

        System.out.println( "Ingrese el numero 1");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numer 2");
        num2 = sc.nextInt();
        System.out.println( "Suma = "+ (num1 + num2));
        System.out.println("Resta = " + (num1 - num2));
        System.out.println("Producto = "+ (num1 * num2));
        System.out.println("Cociente = "+ num1 / num2);*/

        /*
        2-
        Hacer un programa que ingrese el precio de un artículo a la venta y calcule el precio con IVA.

        System.out.println("Ingrese el precio del articulo");
        int precioArt = sc.nextInt();
        System.out.println("Precio + IVA "+ precioArt*1.21);


        3-
        Hacer un programa que ingrese los datos de una factura en la cual haya tres artículos vendidos.
        De cada artículo ingresar el precio unitario y la cantidad.
        Finalmente imprimir el total de la factura

        float art1,art2,art3, total;
        int cantArt1, cantArt2, cantArt3;
        System.out.println("Precio Art1: ");
        art1 = sc.nextFloat();
        System.out.println("Cantidad Art1: ");
        cantArt1 = sc.nextInt();
        System.out.println("Precio Art2: ");
        art2 = sc.nextFloat();
        System.out.println("Cantidad Art2: ");
        cantArt2 = sc.nextInt();
        System.out.println("Precio Art3: ");
        art3 = sc.nextFloat();
        System.out.println("Cantidad Art3: ");
        cantArt3 = sc.nextInt();
        total = (art1*cantArt1)+(art2*cantArt2)+(art3*cantArt3);
        System.out.println("El total de la factura es: "+ total);

        4-
        Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
         */

        String nombre1 = "", nombre2 = "";
        float altura1 = 0, altura2 = 0;
        for (int i = 0; i < 2 ; i++)
        {
            System.out.println("Ingrese el nombre de la persona "+ (i+1) );
            if (i == 0)
            {
                nombre1 = sc.next();
                System.out.println("Altura: ");
                altura1 = sc.nextFloat();
            }
            else
            {
                nombre2 = sc.next();
                System.out.println("Altura: ");
                altura2 = sc.nextFloat();
            }
        }
        System.out.println("La persona mas alta es:");
        if (altura1 > altura2)
        {
            System.out.println(nombre1);
        }
        else
        {
            System.out.println(nombre2);
        }
    }


}