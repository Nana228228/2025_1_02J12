package Estruturas_de_repetição;
import java.util.Scanner;

public class curtidas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas publicações você quer analisar?");
        int publicacoes = entrada.nextInt();

        int cont = 0;
        for(int i=1;i<= publicacoes;i++){
            System.out.printf("Quantas curtidas a publicação %d tem ?", i);
            int curtidas = entrada.nextInt();
            cont = cont + curtidas;
            if(curtidas>=100){
                System.out.println("Publicação popular");
            }
            else{
                System.out.println("Flopou");
            }
    }
    double media = cont/publicacoes;
         System.out.printf("A média de curtidas foi %.2f", media);
    }}