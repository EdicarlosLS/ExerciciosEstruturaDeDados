package com.projeto.Fila;

public class TesteFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        System.out.println(fila);

        fila.enfileirar("Primeiro Livro");

        System.out.println(fila);

        fila.enfileirar("Segundo Livro");

        System.out.println(fila);
        
        System.out.println("\nInicio (" + fila.inicio() + ")\n");

        fila.enfileirar("Terceiro Livro");

        System.out.println(fila);

        fila.desenfileirar();

        System.out.println(fila);
    }
}
