package org.example;
import java.util.Scanner;

public class Distribuidora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o faturamento de SP: R$");
        double sp = input.nextDouble();
        System.out.print("Digite o faturamento de RJ: R$");
        double rj = input.nextDouble();
        System.out.print("Digite o faturamento de MG: R$");
        double mg = input.nextDouble();
        System.out.print("Digite o faturamento de ES: R$");
        double es = input.nextDouble();
        System.out.print("Digite o faturamento de Outros: R$");
        double outros = input.nextDouble();

        double total = sp + rj + mg + es + outros;

        double pctSp = (sp / total) * 100;
        double pctRj = (rj / total) * 100;
        double pctMg = (mg / total) * 100;
        double pctEs = (es / total) * 100;
        double pctOutros = (outros / total) * 100;

        System.out.printf("SP representa %.2f%% do faturamento total.%n", pctSp);
        System.out.printf("RJ representa %.2f%% do faturamento total.%n", pctRj);
        System.out.printf("MG representa %.2f%% do faturamento total.%n", pctMg);
        System.out.printf("ES representa %.2f%% do faturamento total.%n", pctEs);
        System.out.printf("Outros representam %.2f%% do faturamento total.%n", pctOutros);

        input.close();
    }
}