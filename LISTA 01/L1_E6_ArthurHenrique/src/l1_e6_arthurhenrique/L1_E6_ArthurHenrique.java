package l1_e6_arthurhenrique;

import java.util.Scanner;

/**
 * Exercicio 6 Lista 1
 * Data: 24/07/2021
 * Author: Arthur Henrique
 */
public class L1_E6_ArthurHenrique {

    public static void main(String[] args) {
        
        int V[] = new int [13];
        int primeiro = 0, qtd_p = 0;
        int segundo = 0, qtd_s = 0;
        
        Scanner ler = new Scanner (System.in);
        
         for(int i=0;i<13;i++){
            System.out.printf("Quantidade de problemas resolvidos pela aluna %d:\n", i+1);
            V[i] = ler.nextInt();
            while(V[i]>50){
                System.out.println("Valor inválido!");
                V[i] = ler.nextInt();
            }
            if(V[i]>=primeiro){
                primeiro = V[i];
            }
            else if(V[i]<primeiro && V[i]>=segundo){
                segundo = V[i];
            }
        }
         
        
        for(int j=0;j<13;j++){
            if(V[j] == primeiro){
                qtd_p++;
            }
            else if(V[j] == segundo){
                qtd_s++;
            }
        }
        
        System.out.printf("Primeiro lugar: %d problemas (%d alunas)\n", primeiro, qtd_p);
        System.out.printf("Segundo lugar: %d problemas (%d alunas)\n", segundo, qtd_s);
         
    }
    
}
