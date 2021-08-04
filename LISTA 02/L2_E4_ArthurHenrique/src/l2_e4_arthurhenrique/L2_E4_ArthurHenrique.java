package l2_e4_arthurhenrique;

/**
 * Lista 02 Exercicio 04
 * Autor: Arthur Henrique
 * Data: 01/08/2021
 */

public class L2_E4_ArthurHenrique {

    public static void main(String[] args) {
            
        Radio R[] = new Radio[3];
        
        for(int i=0;i<3;i++){
            R[i] = new Radio();
        }
        
        R[0].ligado = true;
        R[0].volume = 5;
        R[0].frequencia = 10;
        
        R[1].ligado = true;
        R[1].volume = 6;
        R[1].frequencia = 5;
        
        R[2].ligado = true;
        R[2].volume = 8;
        R[2].frequencia = 98;
        
        for(int j=0;j<3;j++){
            System.out.println("Informações Rádio " + j);
            R[j].status();
            R[j].alterarFrequencia();
            R[j].alterarVolume();
            R[j].status();
            System.out.println("");
        }
        
    }
    
}
