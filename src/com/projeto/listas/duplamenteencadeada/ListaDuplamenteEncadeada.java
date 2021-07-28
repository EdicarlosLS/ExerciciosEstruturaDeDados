package com.projeto.listas.duplamenteencadeada;

public class ListaDuplamenteEncadeada<C> {
    private NoDuplo<C> inicio = null;
	private NoDuplo<C> fim = null;
    private int tamanho = 0;

    public void adicionar(C conteudo) {
        NoDuplo<C> no = new NoDuplo<>(conteudo);
        if (estaVazia()) {
            inicio = no;
			fim = no;
        } else {
			fim.setProximo(no);
            no.setAnterior(fim);
			fim = no;
        }

        tamanho++;
    }
	
	public void adicionarEm(C conteudo, int posicao){
		if(posicao < 0 || posicao > tamanho - 1){
			throw new IndexOutOfBoundsException("Posição inválida!");
		}
		
		NoDuplo<C> no = new NoDuplo<>(conteudo);
		
		if(posicao == 0){
			inicio.setAnterior(no);
			no.setProximo(inicio);
			inicio = no;
		} else {
			NoDuplo<C> selecionado = pegarNo(posicao);
			selecionado.getAnterior().setProximo(no);
			no.setAnterior(selecionado.getAnterior());
			selecionado.setAnterior(no);
			no.setProximo(selecionado);
			
		}
		
		tamanho++;
	}

    public C pegar(int posicao) {
        return pegarNo(posicao).getConteudo();
    }

    private NoDuplo<C> pegarNo(int posicao) {
        if (posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        NoDuplo<C> aux = inicio;
        for (int i = 0; i <= tamanho; i++) {
            if (i == posicao) {
                break;
            }
            aux = aux.getProximo();
        }
        return aux;
    }

    public void remover(int posicao) {
        if (posicao == 0) {
            inicio = inicio.getProximo();
        } else if(posicao == tamanho - 1){
			fim = fim.getAnterior();
			fim.setProximo(null);
		} else{
            NoDuplo<C> selecionado = pegarNo(posicao);
            selecionado.getAnterior().setProximo(selecionado.getProximo());
        }
        tamanho--;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "[]";
        }

        String saida = "[";

        NoDuplo<C> aux = inicio;
        while (aux != null) {
            saida += aux.getConteudo() + " , ";
            aux = aux.getProximo();
        }

        saida += "]";

        return saida;
    }

}
