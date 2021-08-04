package l2_e4_arthurhenrique;
import java.util.Scanner;

/**
 * Lista 02 Exercicio 04
 * Autor: Arthur Henrique
 * Data: 01/08/2021
 */

public class Radio {
    
    Scanner ler = new Scanner(System.in);
    boolean ligado;
    float frequencia;
    int volume;
    
    void status(){
        if(ligado == true){
            System.out.println("Rádio ligado");
            System.out.println("Volume: " + volume);
            System.out.println("Frequência: " + frequencia);
        }
        else{
            System.out.println("Rádio desligado");
        }
    }
    
    void ligar(){
        ligado = true;
    }
    
    void desligar(){
        ligado = false;
    }
    
    void alterarFrequencia(){
        if(ligado == true){
            System.out.println("Insira uma nova frequência.");
            frequencia = ler.nextFloat();
        }
        else{
            System.out.println("Primeiramente ligue o rádio.");
        }
    }
    
    void alterarVolume(){
        if(ligado == true){
            System.out.println("Insira um novo volume.");
            volume = ler.nextInt();

            while(volume<0 || volume>10){
                System.out.println("Valor inválido, insira um valor entre 0 e 10.");
                volume = ler.nextInt();
            }
        }
        else{
           System.out.println("Com o rádio desligado não da pra fazer nada..."); 
        }
    }
}
