package l1_e1_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 1 Exercicio 1
 * Author Arthur Henrique
 * Data: 24/07/2021
 */
public class L1_E1_ArthurHenrique {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int a=0, b=0;
        while(a>=0 && b>=0){
            System.out.println("Insira um valor negativo para A:");
            a = ler.nextInt();
            System.out.println("Insira um valor negativo para B:");
            b = ler.nextInt();
        }
        
        /*NÃO TEM COMO OS NUMERO SEREM MAIORES DO QUE 0*/
        
        if(a>b){
            a = b;
            b = a;
        }        
        
        System.out.println("Valor de A = " + a);
        System.out.println("Valor de B = " + b);
        
        
    
    }
    
}
