package Estruturas_de_repetição.codigosDoProf;
public class ExemploVarAcumuladora {
    public static void main(String[] args) {
     double termo;
     double num1 = 1, num2 = 1;
     double soma = 0;
    for (int i = 0; i < 50; i++) {
     termo = num1 / num2;
     soma = soma + termo;
     num1 = num1 + 2;
     num2 = num2 + 1;
     }
     System.out.println("O resultado do somatório é: " + soma);
     }
    }