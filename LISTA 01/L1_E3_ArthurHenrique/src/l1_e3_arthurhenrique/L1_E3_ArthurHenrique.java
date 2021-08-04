package l1_e3_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 1 Exercicio 3
 * Author Arthur Henrique
 * Data 24/07/2021
 */
public class L1_E3_ArthurHenrique {

    public static void main(String[] args) {
        
        int V[] = new int [9];
        Scanner ler = new Scanner (System.in);
        System.out.println("Insira um número: ");
        V[0] = ler.nextInt();
        int maior = V[0];
        int seg_maior = V[0];
        int i = 1;
        int j = 1;
        
       while(i<9){
            System.out.println("Insira outro número: ");
            V[i] = ler.nextInt(); 
            
            if(V[i]>maior){
                maior = V[i];
            }
            i++;
        }
       
       while(j<9){
            if(V[j]>seg_maior && V[j]<maior){
                seg_maior = V[j];
            }
            j++;
        }
        
        System.out.printf("O maior numero é %d.\n", maior);
        System.out.printf("O segundo maior é %d.\n", seg_maior);
    }
    
}
