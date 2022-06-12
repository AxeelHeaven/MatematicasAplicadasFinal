package com.axeelheaven.promat;

import java.util.Scanner;

/**
 * @author Axel Tristan
 * @date Miercoles 8 de Junio de 2022
 * @description Este programa realiza operaciones de las opciones ya disponibles.
 */

public class Exa1 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Para comprar cual es \"mayor que\" usa la opción 1");
        System.out.println("Para calcular el valor absoluto usa el opción 2");
        System.out.println("Para calcular la distancia entre dos puntos en una recta usa la opción 3");

        switch (scanner.nextInt()) {
            /*
                CALCULA QUE NUMERO ES MAYOR
            */
            case 1:
                System.out.println("Ingresa los numeros que quieras comparar...");
                double
                        valor1 = scanner.nextDouble(),
                        valor2 = scanner.nextDouble();

                if (valor1 == valor2) {
                    System.out.println("Son iguales");
                } else if (valor1 > valor2) {
                    System.out.println(valor1 + " es mayor que " + valor2);
                } else {
                    System.out.println(valor2 + " es mayor que " + valor1);
                }
                break;
            /*
                CALCULA EL VALOR ABOSULUTO
            */
            case 2:
                System.out.println("Ingresa el numero para calcular el valor absoluto...");
                double v1 = scanner.nextDouble();
                if (v1 < 0) {
                    v1 = -v1;
                }
                System.out.println("Valor absouluto es=" + v1);
                break;
            /*
                CALCULA LA DISTANCIA DE DOS PUNTOS EN UNA RECTA
            */
            case 3:
                System.out.println("Ingresa los dos puntos de la recta...");
                valor1 = scanner.nextDouble();
                valor2 = scanner.nextDouble();

                double resultado = (valor1 < 0 ? -valor1 : valor1) + (valor2 < 0 ? -valor2 : valor2);

                if (resultado < 0)
                    resultado = -resultado;

                System.out.println("La distancia es="+resultado);
                break;
            default:
                System.out.println("Esa función no esta disponible");
        }
    }

}

