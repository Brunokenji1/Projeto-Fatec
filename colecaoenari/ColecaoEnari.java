package com.mycompany.colecaoenari;

import java.util.Scanner;

public class ColecaoEnari {

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
                j1.pessoa = sc.next();
                
                
                System.out.println(" ");
                System.out.println("Está fazendo uma review de qual jogo?");
                String nome=sc.next();
                j1.setjogo(nome);
                
                System.out.println(" ");
                System.out.println("Recomendo jogo?");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                recomendacao = sc.nextInt();
                if(recomendacao == 1){
                    j1.recomendo = "Recomendo";
                }
                else {
                    j1.recomendo = "Não recomendo";
                }
                
                System.out.println(" ");
                System.out.println("Escreva a sua review: ");
                j1.review = sc.next();
                
                
            }
            
            
            
            
            if (x == 2) {
                System.out.println("Menu pra ver uma review");
                System.out.println(j1.pessoa);
                System.out.println(j1.getjogo());
                System.out.println(j1.recomendo);
                System.out.println(j1.review);
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