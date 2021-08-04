package l2_e2_arthurhenrique;

/**
 * Lista 02 Exercicio 02
 * Autor: Arthur Henrique
 * Data: 28/07/2021
 */

public class L2_E2_ArthurHenrique {

    public static void main(String[] args) {
        
        Impressora I[] = new Impressora[5];
        
        for(int j=0; j<5; j++){
            I[j] = new Impressora();
        }
        
        I[0].ligada = false;
        I[0].modelo = "HP";
        I[0].cor = "Branca";
        I[0].copiadora = true;
        I[0].digitalizadora = true;
        I[0].papel = true;
        
        I[1].ligada = true;
        I[1].modelo = "Epson";
        I[1].cor = "Preta";
        I[1].copiadora = false;
        I[1].digitalizadora = false;
        I[1].papel = true;
        
        I[0].ligar();
        I[0].imprimir();
        I[0].digitalizar();
        I[0].copiar();
        I[0].desligar();
        I[0].status();
        
        System.out.println("");
        
        I[1].ligar();
        I[1].imprimir();
        I[1].digitalizar();
        I[1].copiar();
        I[1].desligar();
        I[1].status();
        
    }
    
}
