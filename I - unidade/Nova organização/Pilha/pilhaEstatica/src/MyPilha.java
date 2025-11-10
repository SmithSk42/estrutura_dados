public interface MyPilha {

    boolean push (String elemento);
    String pop();
    String top();
    boolean estaVazio();
    boolean estaCheio();
    int tamanho();
}