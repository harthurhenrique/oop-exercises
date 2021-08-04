package l2_e2_arthurhenrique;

/**
 * Lista 02 Exercicio 01
 * Autor: Arthur Henrique
 * Data: 28/07/2021
 */

public class Impressora {
    
    String modelo;
    String cor;
    boolean ligada;
    boolean digitalizadora;
    boolean copiadora;
    boolean papel;
    
    void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        if(ligada == true){
            System.out.println("Ligada!");
        }
        else if(ligada == false){
            System.out.println("Desligada!");
        }
        if(digitalizadora == true){
            System.out.println("Modelo é Digitalizadora.");
        }
        else if (digitalizadora == false){
            System.out.println("Modelo não é Digitalizadora.");
        }
        if(copiadora == true){
            System.out.println("Modelo é Copiadora.");
        }
        else if (copiadora == false){
            System.out.println("Modelo não é Copiadora.");
        }
        if(papel == true){
            System.out.println("Com papel.");
        }
        else if (papel == false){
            System.out.println("Sem papel.");
        }
        
    }
    
    void ligar(){
        if(ligada == true){
            System.out.println("Impressora ligada.");
        }
        else{
            System.out.println("Impressora desligada, ligando!");
            ligada = true;
        }
    }
    
    void desligar(){
        if(ligada == false){
            System.out.println("Impressora já estava desligada.");
        }
        else{
            System.out.println("Desligando!");
            ligada = false;
        }
    }
    
    void digitalizar(){
        if(digitalizadora == true && ligada == true){
            System.out.println("Impressora pronta, digitlização sendo realizada.");
        }
        else if(digitalizadora == true && ligada == false){
            System.out.println("Essa impressora é uma digitalizadora, mas está desligada.");
        }
        else if(digitalizadora == false && ligada == true){
            System.out.println("Esta impressora não é uma digitalizadora.");
        }
        else{
            System.out.println("Esta impressora não é uma digitalizadora e ainda por cima está desligada.");
        }
    }
    
    void copiar(){
        
        if(copiadora == true){
            if(copiadora==true && papel==true && ligada==true){
            System.out.println("Impressora pronta, Cópia sendo realizada");
            }
            
            else if(papel==false){
            System.out.println("Esta copiadora está sem papel.");
            }
            
            else if(ligada==false){
            System.out.println("Esta copiadora está desligada.");
            }
        }
        
        else if(copiadora == false){
            if(copiadora==false && ligada==true){
            System.out.println("Esta impressora não é uma copiadora.");
            }
        }
       
    }
        
    void imprimir(){
        if(ligada==true){
            System.out.println("Imprimindo");
        }
        else if(ligada==true && papel==false){
            System.out.println("Coloque mais papel.");
        }
        else if(ligada==false){
            System.out.println("Impressora desligada, favor liga-la.");
        }
    }
}
