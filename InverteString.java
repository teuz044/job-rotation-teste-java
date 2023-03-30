package org.example;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String texto = input.nextLine();
        String invertido = "";

        for(int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("A string invertida é: " + invertido);
    }

}