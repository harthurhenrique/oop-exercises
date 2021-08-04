package l2_e3_arthurhenrique;
import java.util.Scanner;

/**
 * Lista 02 Exercicio 03
 * Autor: Arthur Henrique
 * Data: 01/08/2021
 */

public class L2_E3_ArthurHenrique {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Retangulo R[] = new Retangulo[2];
        
        for(int i=0;i<2;i++){
            R[i] = new Retangulo();
            System.out.println("Base do retângulo " + i);
            R[i].base = ler.nextFloat();
            System.out.println("Altura do retângulo " + i);
            R[i].altura = ler.nextFloat();
            R[i].intervalo();
            R[i].status();
            System.out.println("");
        }
        
    }
    
}
