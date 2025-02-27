package Aula_02;

import java.util.Scanner;

public class Espetaculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Diga-me o custo Preço da entrada");
        float precoDaEntrada = entrada.nextFloat();
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Diga-me o custo de produção");
        float custo = entrada2.nextFloat();

        float x = custo/precoDaEntrada;
        float  y = custo * 1.23f/precoDaEntrada; 

        System.out.printf("A quantidade de igressos para não tomar prejuizo é de %f e para lucrar 23%%20 %f", x, y);
    }
}

