package l2_e3_arthurhenrique;
import java.util.Scanner;

/**
 * Lista 02 Exercicio 03
 * Autor: Arthur Henrique
 * Data: 01/08/2021
 */

public class Retangulo {
    
    float base;
    float altura;
    
    Scanner ler = new Scanner(System.in);
       
    void intervalo(){
        while(base<=0){
            System.out.println("Insira um número maior que 0 para a base.");
            base = ler.nextFloat();
        }
        while(altura<=0){
            System.out.println("Insira um número maior que 0 para a altura.");
            altura = ler.nextFloat();
        } 
    }   
    
    float calcularArea(){
        return base*altura;
    }
    
    float calcularPerimetro(){
        return (base*2)+(altura*2);
    }
        
    void status(){
        System.out.printf("Base = %.2f. \n", base);
        System.out.printf("Altura = %.2f. \n", altura);
        System.out.printf("Perímetro = %.2f. \n", calcularPerimetro());
        System.out.printf("Área = %.2f. \n", calcularArea());
    }
}
