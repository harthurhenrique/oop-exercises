package l1_e2_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 1 Exercicio 2
 * Author Arthur Henrique
 * Data 24/07/2021
 */
public class L1_E2_ArthurHenrique {

    public static void main(String[] args) {
        
        int V[] = new int [6];
        Scanner ler = new Scanner (System.in);
        System.out.println("Insira um número: ");
        V[0] = ler.nextInt();
        int maior = V[0];
        int i = 1;
        
       while(i<6){
            System.out.println("Insira outro número: ");
            V[i] = ler.nextInt(); 
            
            if(V[i]>maior){
                maior = V[i];
            }
            i++;
        }
        
        System.out.printf("O maior numero é %d.\n", maior);
    }
    
}
