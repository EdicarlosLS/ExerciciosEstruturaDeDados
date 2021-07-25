package listas;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println(lista);        
        System.out.println(lista.estaVazia());
        System.out.println(lista.tamanho());
        
        lista.adicionar("Amarelo");        
        lista.adicionar("Azul");
        lista.adicionar("Verde");
        
        System.out.println(lista);
        System.out.println(lista.estaVazia());
        System.out.println(lista.tamanho());
        
        lista.remover(0);
        
        System.out.println(lista);
        System.out.println(lista.estaVazia());
        System.out.println(lista.tamanho());
        
    }
            
}
