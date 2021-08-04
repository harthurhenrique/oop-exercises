package l2_e1_arthurhenrique;

/**
 * Lista 02 Exercicio 01
 * Autor: Arthur Henrique
 * Data: 28/07/2021
 */
public class Livro {
    
    String titulo;
    String editora;
    int ano;
    String autor;
    boolean aberto;
    
    void estudar(){
        if(aberto == true){
            System.out.println("Bons estudos!");
        }
        else{
            System.out.println("Você não pode estudar, o livro está fechado.");
        }
    }
    
    void abrir(){
        aberto = true;
    }
    
    void fechar(){
        aberto = false;
    }
    
    void anotar(){
        if(aberto == true){
            System.out.println("Anotando...!");
        }
        else{
            System.out.println("Você precisa abrir antes de anotar!");
        }
    }
    
    void status(){
        System.out.println("Título: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Autor(a): " + autor);
        System.out.println("Ano de lançamento: " + ano);
        if(aberto == true){
            System.out.println("Livro aberto!");
        }
        else{
            System.out.println("Livro fechado!");
        }
    }
    
}
