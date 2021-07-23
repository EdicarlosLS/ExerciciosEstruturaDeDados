package com.projeto;

public class Main {
    public static void main(String[] args) {
        No<String> n1 = new No<>("nó 1");
        
        System.out.println(n1);
        
        No<String> n2 = new No<>("nó 2");
        n1.setProximo(n2);
        
        System.out.println(n1);        
    }
}
