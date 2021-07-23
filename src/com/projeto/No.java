package com.projeto;

public class No<C> {
    private C conteudo;
    private No proximo;
    
    public No(C conteudo){
        this.conteudo = conteudo;
        proximo = null;
    }

    public C getConteudo() {
        return conteudo;
    }

    public void setConteudo(C conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return conteudo.toString() + " ->  " + proximo;
    }
    
    
}
