package com.projeto.pilha;

import com.projeto.No;

public class Pilha<C> {
    
    private No<C> topo = null;
    private int tamanho = 0;
    
    public C topo(){
        if(!estaVazia()){
            return topo.getConteudo();
        }
        return null;
    }
    
    public C desempilhar(){
        if(!estaVazia()){
            topo = topo.getProximo();
            tamanho--;
        }
        
        return topo();
    }
    
    public void empilhar(C conteudo){
        No<C> no = new No<>(conteudo);
        no.setProximo(topo);
        topo = no;
        tamanho++;
    }
    
    public boolean estaVazia(){
        return topo == null;
    }
    
    public int tamanho(){
        return tamanho;
    }

    @Override
    public String toString() {
        String saida = "Pilha - " + tamanho;
        No<C> no = topo;
        while(no != null){
            saida += "\nv - " + no.getConteudo();
            no = no.getProximo();
        }
        
        return saida;
    }
    
    
}
