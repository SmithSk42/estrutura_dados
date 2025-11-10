public class Main{
    public static void main(String[] args){

        FilaEstaticaSimples fila1 = new FilaEstaticaSimples(3);

        System.out.println(fila1.peek());
        fila1.dequeue();
        fila1.enqueue("Aninha");
        fila1.enqueue("Andreia");
        fila1.enqueue("Osmir");
        fila1.enqueue("Dulcineide");
        System.out.println(fila1.peek());
        fila1.dequeue();
        System.out.println(fila1.peek());
        fila1.dequeue();
        System.out.println(fila1.peek());
        fila1.dequeue();
        System.out.println(fila1.peek());
    }
}