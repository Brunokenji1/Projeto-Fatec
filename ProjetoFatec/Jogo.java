package com.mycompany.colecaoenari;


public class Jogo {
    
    private String pessoa;
    private String jogo;
    private String recomendo;
    private String review;

    public void setPessoa(String pessoa){
        this.pessoa=pessoa;
    }
    public String getPessoa(){
        return pessoa;
    }
    
    public void setJogo(String nome){
        this.jogo=nome;
    }
    public String getJogo(){
        return jogo;
    }
    
    public void setRecomendo(String recomendacao){
        this.recomendo=recomendacao;
    }
    public String getRecomendo(){
        return recomendo;
    }
    
    public void setReview(String opniao){
        this.review=opniao;
    }
    public String getReview(){
        return review;
    }
    
}
        
