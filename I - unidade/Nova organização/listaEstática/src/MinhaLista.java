public interface MinhaLista {
    boolean adicionar (String elementos);
    String obter(int posicao);
    boolean adicionar(String elemento, int posicao);
    String remover(int posicao);
    int tamanho();
    boolean estaVazio();
    boolean estaCheia();

}
