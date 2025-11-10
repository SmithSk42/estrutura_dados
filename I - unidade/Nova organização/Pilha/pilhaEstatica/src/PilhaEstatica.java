public class PilhaEstatica implements MyPilha {

    /* principio da pilha - LIFO. Portanto, top controla
     */
    private String[] dados;
    private int tamanhoAtual;

    public PilhaEstatica(int capacidade) {
        this.dados = new String[capacidade];
        this.tamanhoAtual = 0;
    }
    @Override
    public boolean push(String elemento) {
        if (this.estaCheio()) {
            System.out.println("Erro. A pilha está cheia");
            return false;
        }
        this.dados[this.tamanhoAtual] = elemento;
        this.tamanhoAtual++;
        return true;
    }
    @Override
    public String pop() {
        if (this.estaVazio()){
            System.out.println("Erro. Pilha está vazia");
            return null;
        }
        int indexDoTop =  this.tamanhoAtual - 1;
        String elementoTop= this.dados[indexDoTop];
        tamanhoAtual--;
        this.dados[indexDoTop] = null;
        return elementoTop;
    }

    @Override
    public String top(){
        if (this.estaVazio()){
            System.out.println("Erro. Pilha está vazia");
            return null;
        }
        return this.dados[this.tamanhoAtual-1];
    }
        @Override
        public boolean estaCheio () {
            return this.tamanhoAtual == this.dados.length;
        }
        @Override
        public boolean estaVazio () {
        return this.tamanhoAtual == 0;
        }
        @Override
        public int tamanho(){
        return this.tamanhoAtual;
        }
}