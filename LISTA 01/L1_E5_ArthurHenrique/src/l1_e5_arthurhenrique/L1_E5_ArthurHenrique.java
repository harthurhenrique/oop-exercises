package l1_e5_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 1 Exercicio 5
 * Author Arthur Henrique
 * Data 24/07/2021
 */

public class L1_E5_ArthurHenrique {

    
    public static void main(String[] args) {
        
        int inicial, razao;
        int V[] = new int [10];
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira um valor inicial para a PG:");
        inicial = ler.nextInt();
        System.out.println("Agora insira a razao da PG:");
        razao = ler.nextInt();
        V[0] = inicial;
        
        for(int i=1;i<10;i++){
            inicial = inicial*razao;    
            V[i] = inicial;
        }
        
        System.out.printf("Valores da PG: [");
        for(int j=0;j<10;j++){
            System.out.printf("%d", V[j]);
            if(j!=9){
                System.out.printf(", ");
            }
            else if(j==9){
                System.out.printf("]");
            }
        }
        
    }
    
}
