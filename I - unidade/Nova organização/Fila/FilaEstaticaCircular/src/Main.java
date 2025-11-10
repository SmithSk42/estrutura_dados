public class Main {
    public static void main(String[] args) {

        FilaEstaticaCircular filaC1 = new FilaEstaticaCircular(5);

        filaC1.enqueue("Aninha");
        filaC1.enqueue("Pedro Henrique");
        filaC1.enqueue("Maria Joaquina");
        filaC1.enqueue("João");
        System.out.println(filaC1.peek());
        filaC1.dequeue();
        System.out.println(filaC1.peek());
        System.out.println("Quem será o próximo a sair? " + filaC1.peek());
        filaC1.dequeue();
        System.out.println(filaC1.peek());
        filaC1.enqueue("Julio Cesar");
        filaC1.enqueue("Daniel Paulo");
        filaC1.enqueue("Ana Caroline");
        filaC1.enqueue("Antonio Augusto");
    }
}