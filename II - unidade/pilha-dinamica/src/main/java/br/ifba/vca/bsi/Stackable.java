package br.ifba.vca.bsi;

public interface Stackable <T> {
    
    /**tirar resultado do topo da pilha */
    T pop();

    //**Colocar nova informação no topo da pilha */
    T push (T data);

    /** atuallizar resultado na questão de topo, pois estamos falndo de pilha */
    void update(T newData);
    
    /**mostrar qual informaç~ao está em cima da pilha */
    T peek ();


    /**codigo separado para que possa ser feita a verificação para  que haja informmação de estar vazio! */
    boolean isEmpty ();

    /** Verificar se pilha esta cheia */
    boolean isFull ();


    String print();
}
