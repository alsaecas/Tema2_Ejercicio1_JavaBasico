package com.alsaecas;

import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Escribe el precio sin IVA: ");
        double preciosin = input.nextDouble();
        input.close();

        System.out.println("El precio con IVA es: " + calculaIva(preciosin));


    }

    static double calculaIva(double precio){

        return precio*1.21;
    }
}
