package Estruturas_de_repetição;

public class exemplo7 {
    public static void main(String[] args){
        double soma = 0;
        double cima = 0;
        double termo = 0;
        double baixo = 1;
        for(;cima <= 50; ){
            soma = soma + termo;
            termo = cima/baixo;
            cima = cima + 1;
            baixo = baixo + 2;
        }
        System.out.println(soma);
    }
}
