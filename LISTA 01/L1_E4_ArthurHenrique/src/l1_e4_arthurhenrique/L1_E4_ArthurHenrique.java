package l1_e4_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 1 Exercicio 4
 * Author Arthur Henrique
 * Data 24/07/2021
 */

public class L1_E4_ArthurHenrique {
    
    public static void main(String[] args) {
       
        Scanner ler = new Scanner (System.in);
        float N[] = new float [10];
        int i = 1;
        System.out.println("Insira a nota do Aluno 1:");
        N[0] = ler.nextFloat();
        float maior = N[0];
        float menor = N[0];
        float media = N[0];
        int acima = 0;
        
        while(i<10){
            System.out.println("Insira a nota do Aluno " + (i+1) + ":");
            N[i] = ler.nextFloat();
            
            media = media + N[i];
            
            if(N[i]>maior){
                maior = N[i];
            }
            
            if(N[i]<menor){
                menor = N[i];
            }
            
            i++;
        }
        
        media = media/10;
        
        for(int j=0;j<10;j++){
            if(N[j]>media){
                acima++;
            }
        }
        
        System.out.println("A maior nota é " + maior);
        System.out.println("A menor nota é " + menor);
        System.out.println("A nota média da classe é " + media);
        System.out.println("A quantidade de alunos acima da média é " + acima);
        
    }
    
}
