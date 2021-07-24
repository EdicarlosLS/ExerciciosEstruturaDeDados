package com.projeto.Fila;

import com.projeto.No;

public class Fila<C> {

    private No<C> inicio = null;
    private No<C> fim = null;

    private int tamanho = 0;
    
    public C inicio(){
        if(!estaVazia()){
            return inicio.getConteudo();
        }
        
        return null;
    }

    public void enfileirar(C conteudo) {
        No<C> no = new No<>(conteudo);
        if (!estaVazia()) {
            fim.setProximo(no);
            fim = no;
        } else {
            inicio = no;
            fim = no;
        }

        tamanho++;
    }

    public C desenfileirar() {
        if (!estaVazia()) {
            inicio = inicio.getProximo();
            tamanho--;
        } else {
            fim = null;
        }

        return inicio();
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }
    
    @Override
    public String toString() {
        String saida = "\n _ _ _ _ _ _\n|Fila - (tamanho : " + tamanho + ")";
        saida += "\n|_ _ _ _ _ _";
        No<C> no = inicio;
        while(no != null){
            saida += "\n| * " + no.getConteudo();
            no = no.getProximo();
        }
        saida += "\n|_ _ _ _ _ _";
        
        return saida;
    }
}
