public class Main {
    public static void main(String[] args) {

        ListaEstatica vetor1 = new ListaEstatica(7);

        System.out.println("Lista criada com tamanho " + vetor1.tamanho());
        System.out.println("Lista está vazia? "+vetor1.estaVazio());
        vetor1.adicionar("Ninha");
        System.out.println(vetor1.obter(0));
        System.out.println("Tamanho apos adicionar 1 elemento: "+ vetor1.tamanho());
        vetor1.adicionar("Osmir");
        vetor1.adicionar("Dulcineide");
        System.out.println("Tamanho após adicionar +2 elementos: "+vetor1.tamanho());
        vetor1.adicionar("Juninho");
        System.out.println("Lista 1 está cheia? " +vetor1.estaCheia());
        vetor1.adicionar("Andreia");

        System.out.println("\nApresentar lista criada:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor1.obter(i));
        }
        System.out.println("Tamanho apos adicionar 5 elemento: "+ vetor1.tamanho());

        System.out.println("A lista está cheia?" +vetor1.estaCheia());
        System.out.println("\nTentando adicionar mais um elemento");


        System.out.println("Teste para saber se o tamanho se comporta corretamente:" +vetor1.tamanho()+". Tamanho = 5? " + (vetor1.tamanho()==5));

        //System.out.println("\nTeste de apresentação erro, vetor negativo:"+vetor1.obter(-1));

        //level2: gerenciamento do contador lógico (tamanhoAtual)
        //"abrir espaços" & "fechar buracos"
        vetor1.adicionar("Osmar", 2);
        System.out.println("Lista está cheia? "+vetor1.estaCheia());
        vetor1.adicionar("Bode", 4);

        for(int i = 0; i < vetor1.tamanho(); i++){
            System.out.println(vetor1.obter(i));
        }

        vetor1.remover(2);
        vetor1.remover(vetor1.tamanho()-1);

        System.out.println("\nteste pós remoção");

        for(int i = 0; i < vetor1.tamanho(); i++){
            System.out.println(vetor1.obter(i));
        }
    }
}