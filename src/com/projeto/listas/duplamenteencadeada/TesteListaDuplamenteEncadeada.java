package com.projeto.listas.duplamenteencadeada;

public class TesteListaDuplamenteEncadeada {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();
		System.out.println(lista);
		
		lista.adicionar("Primeiro");
		System.out.println(lista);
		
		lista.remover(0);
		lista.adicionar("Segundo");
		lista.adicionar("Terceiro");
		System.out.println(lista);
		
		lista.remover(1);
		lista.adicionar("Quarto");
		System.out.println(lista);
		
		lista.adicionar("Quinto");
		lista.adicionarEm("Sexto", 0);
		System.out.println(lista);
    }
}
