package l2_e1_arthurhenrique;

import java.util.Scanner;

/**
 * Lista 02 Exercicio 01
 * Autor: Arthur Henrique
 * Data: 28/07/2021
 */

public class L2_E1_ArthurHenrique {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Livro L1;
        L1 = new Livro();
        
        System.out.println("Título: ");
        L1.titulo = ler.nextLine();
        System.out.println("Autor: ");
        L1.autor = ler.nextLine();
        System.out.println("Editora: ");
        L1.editora = ler.nextLine();
        System.out.println("Ano: ");
        L1.ano = ler.nextInt();
        L1.aberto = false;
        
        L1.abrir();
        L1.anotar();
        L1.estudar();
        L1.fechar();
        L1.status();
    }
    
}
