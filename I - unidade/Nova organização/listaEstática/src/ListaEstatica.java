public class ListaEstatica implements MinhaLista {

    //atributos necessários
    private String[] dados;
    private int tamanhoAtual;

    //até aqui, dado e cont == 0
    //o que estou construindo? uma lista estatica, LIST

    //construtor
    public ListaEstatica (int capacidade){
        this.dados = new String[capacidade];
        this.tamanhoAtual = 0;
    }

    @Override
    public int tamanho(){
        return this.tamanhoAtual;
    }

    @Override
    public  boolean estaVazio(){
        return this.tamanhoAtual == 0;
    }

    @Override
    public boolean estaCheia(){
        return this.tamanhoAtual == this.dados.length;
    }

    @Override
    public boolean adicionar (String elemento){
        if(this.estaCheia()){
            System.out.println("Erro. Lista está cheia");
            return false;
        }
            this.dados[this.tamanhoAtual] = elemento;
            this.tamanhoAtual++;
            return true;
    }

    @Override
    public String obter(int posicao){
        if(posicao < 0 || posicao >= this.tamanhoAtual){
            throw new IllegalArgumentException("Erro. Posição invalida");
        }
        return this.dados[posicao];
    }

    //adicionar fazendo movimentação dos elementos
    @Override
    public boolean adicionar (String elemento, int posicao){
        if (this.estaCheia()){
            System.out.println("Erro: Lista está cheia");
            return false;
        }
        if(posicao <0 || posicao > this.tamanhoAtual){
            System.out.println("Erro: Posição de adição invalida");
            return false;
        }

        for (int i = this.tamanhoAtual-1; i >= posicao; i--){
            this.dados[i+1] = this.dados[i];
        } this.dados[posicao] = elemento;
        this.tamanhoAtual++;
        return true;
    }

    @Override
    public String remover (int posicao){
        if(posicao < 0 || posicao >= this.tamanhoAtual){
            System.out.println("Erro: Possição de remoção invalida");
            return null;
        }

        String elementoRemovido = this.dados[posicao];
        for (int i = posicao; i < this.tamanhoAtual-1; i++) {
            this.dados[i] = this.dados[i + 1];
        }
        tamanhoAtual--;
        System.out.println("Tamanho atual: " + tamanhoAtual);
            //this.dados[this.tamanhoAtual] = null;
            return elementoRemovido;
    }
}