package com.mycompany.colecaoenari;

import java.util.Scanner;

public class ProjetoFilme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int recomendacao = 0;
        int x = 1;
        Jogo j1 = new Jogo();
        while (x != 0) {    
            
            System.out.println("===========================================");            
            System.out.println("Selecione uma opcao: ");
            System.out.println("1- Cadastrar uma review de um jogo ");
            System.out.println("2- Ver uma review ja cadastrada ");
            System.out.println("3- Atualizar informacoes ");
            System.out.println("0- Sair ");
            System.out.println("===========================================");
            x = sc.nextInt();
            
            
            if (x == 1) {
                
                System.out.println(" ");
                System.out.println("Quem está escrevendo a review?");
                j1.setPessoa(sc.next());
                
                sc.nextLine();
                System.out.println(" ");
                System.out.println("Está fazendo uma review de qual jogo?");
                j1.setJogo(sc.nextLine());
                
                System.out.println(" ");
                System.out.println("Recomendo jogo?");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                recomendacao = sc.nextInt();
                if(recomendacao == 1){
                    j1.setRecomendo("Recomendo");
                }
                else {
                    j1.setRecomendo("Não recomendo");
                }
                sc.nextLine();
                System.out.println(" ");
                System.out.println("Escreva a sua review: ");
                j1.setReview(sc.nextLine());
                
                
            }
            
            
            
            
            if (x == 2) {
                j1.review();
            }
            
            
            
            
            if (x == 3) {
                System.out.println("Menu pra atualizar informacoes");
            }

            
            
            
            System.out.println("1- Realizar outra ação");
            System.out.println("0- Sair");
            
            
            
            
            x = sc.nextInt();
        }
    }
}
