import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[20];

        System.out.println("insira os valores da array A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("número %d: ", (i + 1), " / 10");
            vetorA[i] = om.nextInt();

        }
        System.out.println("Vetor A concluído");

        System.out.println("insira os valores da array B:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("número %d: ", (i + 1), " / 10");
            vetorB[i] = om.nextInt();
            System.out.println((i + 1) + " / 10");
        }
        System.out.println("Vetor B concluído");
        System.out.println("A seguir, os valores da array C construída:");

        int j = 0;
        for(int i = 0; i < vetorC.length; i++) {
            if(i % 2 == 0) {
                vetorC[i] = vetorA[j];
            } else {
                vetorC[i] = vetorB[j];
                j++;
            }
        }

        for(int i = 0; i < vetorC.length; i++) {
            System.out.println("Valor: " + vetorC[i]);
        }
    }
}
