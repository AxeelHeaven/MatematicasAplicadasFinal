package com.axeelheaven.promat;

import java.util.*;

/**
 * @author Axel Tristan
 * @date Jueves 9 de Junio de 2022
 * @description Este programa desencripta mensajes codificados. https://i.imgur.com/B0b5KpB.png
 */

public class Exa2 {
    /*
     * STUDYMATH
     * 121212121
     * TVVFZOBVI
     *
     * PYTHAGORASLIVES
     * 243243243243243
     * RCWJEJQVDUPLXIV
     *
     * AXEL
     * 2432
     * CBHN
     */

    static String[] alfabeto = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        String numero;

        System.out.println("Escribe el numero decimal");
        numero = sc.nextLine();

        String encriptado;

        System.out.println("Escribe el mensaje encripado");
        encriptado = sc.nextLine();

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < encriptado.length(); i++) {
            String codigo = Character.toString(encriptado.charAt(i));
            int desplazamiento = Integer.parseInt(Character.toString(numero.charAt(i)));

            for (int actual = 0; actual < alfabeto.length; actual++) {
                if (codigo.equalsIgnoreCase(alfabeto[actual])) {
                    int index = actual - desplazamiento;
                    if (index < 0)
                        index += alfabeto.length;
                    System.out.println(stringBuilder.append(alfabeto[index]));
                }
            }
        }
        System.out.println("Palabra desencriptada=" + stringBuilder);

    }
}
