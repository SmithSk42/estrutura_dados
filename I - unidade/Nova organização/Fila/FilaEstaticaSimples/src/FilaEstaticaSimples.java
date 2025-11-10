public class FilaEstaticaSimples implements MyFilaSimples{

    private String[] dados;
    private int tamanhoAtual;

    FilaEstaticaSimples(int tamanho){
        this.dados = new String[tamanho];
        tamanhoAtual = 0;
    }
    //enfileirar
    @Override
    public boolean enqueue (String elemento){
        if(this.estaCheio()){
            System.out.println("Erro. Fila está Cheia");
            return false;
        }
        this.dados[tamanhoAtual] = elemento;
        this.tamanhoAtual++;
        return true;
    }

    @Override
    public String peek(){
        if(this.estaVazio()){
            System.out.println("Erro. Fila está vazia");
            return null;
        }
        return this.dados[0];
    }

    //desenfileirar
    @Override
    public String dequeue(){
        if(this.estaVazio()){
            System.out.println("Erro. Fila está vazia");
            return null;
        }
        String primeiroDaFila = this.dados[0];
        for(int i = 0; i < this.tamanhoAtual-1; i++){
            this.dados[i] = this.dados[i+1];
        }
        this.tamanhoAtual--;
        this.dados[this.tamanhoAtual] = null;
        return primeiroDaFila;

    }
    @Override
    public boolean estaVazio(){
        return this.tamanhoAtual == 0;
    }
    @Override
    public boolean estaCheio(){
        return this.tamanhoAtual == this.dados.length;
    }
    @Override
    public int tamanho(){
        return this.tamanhoAtual;
    }
}