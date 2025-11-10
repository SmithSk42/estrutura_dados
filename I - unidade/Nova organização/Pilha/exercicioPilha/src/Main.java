public class Main {
    public static void main(String[] args) {

        PilhaEstatica parenteses = new PilhaEstatica(10);
        parenteses.push("(");
        parenteses.push("[");
        parenteses.push("]");
        parenteses.push(")");
        System.out.println(parenteses.top());
        parenteses.pop();
        parenteses.pop();
        parenteses.push("]");
        parenteses.push(")");
        System.out.println(parenteses.top());

        Balanceamento v = new Balanceamento();

        String exp1 = " ( { } ) ";

        System.out.println("A expressão1: " + v.estaBalanceado(exp1));
    }
}