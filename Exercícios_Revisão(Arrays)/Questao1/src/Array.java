import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner om =  new Scanner(System.in);

        int[]  vetor = new int[5];

        System.out.println("Insira 5 números inteiros: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vetor[i] = om.nextInt();
        }
        System.out.println("/nOs números inseridos foram:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        om.close();
    }
}
