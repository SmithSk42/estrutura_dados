public class FilaEstaticaCircular implements MyFilaECircular{

    private String[] dados;
    private int inicio;
    private int fim;
    private int tamanhoAtual;
    private int capacidade;

    public FilaEstaticaCircular(int capacidade){
        this.capacidade = capacidade;
        this.dados = new String[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanhoAtual = 0;
    }

    //adicionar/enfileirar no final da fila
    @Override
    public boolean enqueue(String elemento){
        if(this.isFull()){
            System.out.println("Erro. Está cheio");
            return false;
        }
        this.dados[this.fim] = elemento;
        this.tamanhoAtual++;
        this.fim = (this.fim + 1) % this.capacidade;
        return true;
    }

    //remover/desenfileirar no inicio da fila
    @Override
    public String dequeue(){
        if(this.isFull()){
            System.out.println("Erro. Fila está cheio");
            return null;
        }
        String elementoQueSaiu = this.dados[this.inicio];
        this.dados[this.inicio] = null;
        this.tamanhoAtual--;
        this.inicio = (this.inicio + 1) % this.capacidade;
        return elementoQueSaiu;
    }
    @Override
    public String peek(){
        if(this.isEmpty()){
            System.out.println("Erro. Fila está vazia");
            return null;
        }
        return this.dados[this.inicio];
    }
    @Override
    public boolean isEmpty(){
        return this.tamanhoAtual == 0;
    }
    @Override
    public boolean isFull(){
        return this.tamanhoAtual == this.capacidade;
    }
    @Override
    public int size(){
        return this.tamanhoAtual;
    }
}