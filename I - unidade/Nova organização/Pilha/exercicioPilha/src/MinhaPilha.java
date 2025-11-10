public interface MinhaPilha {
    boolean push(String elemento);
    String pop();
    String top();
    int tamanho();
    boolean estaCheio();
    boolean estaVazio();

}
