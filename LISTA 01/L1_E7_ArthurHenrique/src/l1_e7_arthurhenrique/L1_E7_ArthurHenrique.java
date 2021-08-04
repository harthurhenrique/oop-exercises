package l1_e7_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 1 Exercicio 7
 * Author Arthur Henrique
 * Data 24/07/2021
 */

public class L1_E7_ArthurHenrique {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira um valor para a base do triângulo:");
        float base = ler.nextFloat();
        System.out.println("Insira um valor para a altura do triângulo:");
        float altura = ler.nextFloat();
        
        float area = (base*altura)/2;
        
        System.out.println("A area do triângulo é " + area);
        
    }
    
}
