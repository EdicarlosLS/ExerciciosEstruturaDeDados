package com.projeto.listas.encadeada;

import com.projeto.No;

public class ListaEncadeada<C> {

    private No<C> inicio = null;
    private int tamanho = 0;

    public void adicionar(C conteudo) {
        No<C> no = new No<>(conteudo);
        if (estaVazia()) {
            inicio = no;
        } else {
            No<C> aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(no);
        }

        tamanho++;
    }

    public C pegar(int posicao) {
        return pegarNo(posicao).getConteudo();
    }

    private No<C> pegarNo(int posicao) {
        if (posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        No<C> aux = inicio;
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
        } else {
            No<C> anterior = pegarNo(posicao - 1);
            No<C> selecionado = pegarNo(posicao);

            anterior.setProximo(selecionado.getProximo());
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

        No<C> aux = inicio;
        while (aux != null) {
            saida += aux.getConteudo() + " , ";
            aux = aux.getProximo();
        }

        saida += "]";

        return saida;
    }

}
