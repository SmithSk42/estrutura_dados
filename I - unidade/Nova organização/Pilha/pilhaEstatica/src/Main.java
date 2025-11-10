public class Main {
    public static void main(String[] args) {
        PilhaEstatica pilha1 = new PilhaEstatica(5);

        //únicos "botões": push(); pop(); top();
        pilha1.pop();
        pilha1.push("Ninha");
        pilha1.push("Creuza");
        System.out.println(pilha1.top());
        pilha1.pop();
        pilha1.push("Andreia");
        pilha1.push("Osmir");
        System.out.println(pilha1.top());
        pilha1.push("Wendell");
        System.out.println(pilha1.top());
        pilha1.push("Juninho");
        System.out.println(pilha1.top());
        pilha1.push("Erro");
        System.out.println(pilha1.top());
        pilha1.push("Erro");
        System.out.println(pilha1.tamanho());
    }
}
