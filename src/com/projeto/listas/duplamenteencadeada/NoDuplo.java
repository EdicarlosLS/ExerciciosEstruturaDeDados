package com.projeto.listas.duplamenteencadeada;

public class NoDuplo<C> {

    private C conteudo;
    private NoDuplo<C> anterior;
    private NoDuplo<C> proximo;

    public NoDuplo(C conteudo) {
        this.conteudo = conteudo;
        anterior = null;
        proximo = null;
    }

    public C getConteudo() {
        return conteudo;
    }

    public void setConteudo(C conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<C> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<C> anterior) {
        this.anterior = anterior;
    }

    public NoDuplo<C> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<C> proximo) {
        this.proximo = proximo;
    }

}
