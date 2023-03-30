package org.example;

import java.util.Scanner;

public class FaturamentoMensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de dias do mês: ");
        int n = scanner.nextInt();

        double[] faturamentoDiario = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o faturamento do dia " + (i + 1) + ": ");
            faturamentoDiario[i] = scanner.nextDouble();
            soma += faturamentoDiario[i];
        }

        double mediaMensal = soma / n;
        int diasAcimaDaMedia = 0;
        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];

        for (int i = 1; i < n; i++) {
            if (faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        System.out.println("Número de dias em que o faturamento foi superior à média mensal: " + diasAcimaDaMedia);
    }
}
