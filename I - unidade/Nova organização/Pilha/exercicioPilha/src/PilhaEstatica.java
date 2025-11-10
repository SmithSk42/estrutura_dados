public class PilhaEstatica implements MinhaPilha {

    private String [] dados;
    private int tamanhoAtual;

    public PilhaEstatica(int capacidade) {
        this.dados = new String[capacidade];
        this.tamanhoAtual = 0;
    }
    @Override
    public boolean push(String elemento){
        if(this.estaCheio()){
            System.out.println("Erro. Pilha cheia");
            return false;
        }
        this.dados[this.tamanhoAtual] = elemento;
        this.tamanhoAtual++;
        return true;
    }
    @Override
    public String pop(){
        if(this.estaVazio()){
            System.out.println("Erro. Pilha vazia");
            return null;
        }
        int indexTopo = this.tamanhoAtual-1;
        String elementoTop = this.dados[indexTopo];
        this.tamanhoAtual--;
        this.dados[indexTopo] = null;
        return elementoTop;
    }
    @Override
    public String top(){
        if(this.estaVazio()){
            System.out.println("Erro. Pilha vazia");
            return null;
        }
        int indexTopo = this.tamanhoAtual-1;
        return dados[indexTopo];
    }
    @Override
    public int tamanho(){
        return tamanhoAtual;
    }
    @Override
    public boolean estaCheio(){
        return this.tamanhoAtual == this.dados.length;
    }
    @Override
    public boolean estaVazio(){
        return this.tamanho() == 0;
    }
}