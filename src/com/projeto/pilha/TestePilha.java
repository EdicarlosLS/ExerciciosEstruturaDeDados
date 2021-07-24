package com.projeto.pilha;

public class TestePilha {

    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        System.out.println(pilha);

        pilha.empilhar("Primeiro Livro");

        System.out.println(pilha);

        pilha.empilhar("Segundo Livro");

        System.out.println(pilha);
        
        System.out.println("\nTopo (" + pilha.topo() + ")\n");

        pilha.empilhar("Terceiro Livro");

        System.out.println(pilha);

        pilha.desempilhar();

        System.out.println(pilha);

    }
}
