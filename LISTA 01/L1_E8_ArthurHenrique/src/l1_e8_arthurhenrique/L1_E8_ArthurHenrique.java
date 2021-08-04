package l1_e8_arthurhenrique;

import java.util.Scanner;

/**
 * Exercicio 8 Lista 1
 * Data: 24/07/2021
 * Author: Arthur Henrique
 */
public class L1_E8_ArthurHenrique {
  
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira as dimensões da matriz A.");
        int m = ler.nextInt();
        int n = ler.nextInt();
        System.out.println("Insira as dimensões da matriz B.");
        int p = ler.nextInt();
        
        int A[][] = new int[m][n];
        int B[][] = new int[n][p];
        int C[][] = new int[m][p];
    
        System.out.println("\nInsira os valores da matriz A.");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Insira um valor na posição: [%d][%d]\n", i, j);
                A[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("\nInsira os valores da matriz B.");
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                System.out.printf("Insira um valor na posição: [%d][%d]\n", i, j);
                B[i][j] = ler.nextInt();
            }
        }
       
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                C[i][j] = A[i][j] * B[i][j];
            }
        }
        
        System.out.println("\nMatriz resultante do produto de A com B.\nMatriz C:");
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                System.out.printf("|%d|", C[i][j]);
            }
            System.out.println("");
        }
    }
    
}
