public interface Questao1 {
    //em lista. temos:
    boolean adicionar(String elemento);
    String remover(int posicao);
    String obter(int posicao);
    int tamanho();
    boolean estaCheio();
    boolean estaVazio();
}
