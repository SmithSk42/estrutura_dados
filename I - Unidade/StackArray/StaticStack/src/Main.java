//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StaticStack stack = new StaticStack(8);
        stack.push("Cavalo");
        stack.push("Cachorro");
        System.out.println("Espiar:" + stack.peek());
        stack.push("Gato");
        stack.push("Lagarto");
        System.out.println("Espiar:" + stack.peek());
        Object conteudo = stack.pop();
        stack.pop();
        stack.push("Tartaruga");
        stack.update("Tartaruga Marinha");
        stack.push(stack.pop());
        System.out.println("Espiar:" + stack.peek());
        stack.push(conteudo);
        System.out.println("Pilha=" + stack.print());
    }
}