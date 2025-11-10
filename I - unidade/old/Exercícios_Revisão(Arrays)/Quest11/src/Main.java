import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        int vetorD[] = new int[30];

        System.out.println("insira os valores da array A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("número %d: ", (i + 1), " / 10");
            vetorA[i] = om.nextInt();

        }
        System.out.println("Vetor A concluído");

        System.out.println("insira os valores da array B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("número %d: ", (i + 1), " / 10");
            vetorB[i] = om.nextInt();
            System.out.println((i + 1) + " / 10");
        }
        System.out.println("Vetor B concluído");

        System.out.println("insira os valores da array C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("número %d: ", (i + 1), " / 10");
            vetorC[i] = om.nextInt();
            System.out.println((i + 1) + " / 10");
        }
        System.out.println("Vetor C concluído");
        System.out.println("A seguir, os valores da array C construída:");

        int j = 0;
        for(int i = 0; i < vetorD.length; i++) {
            vetorD[i] = vetorA[j];
            vetorD[i+1] = vetorB[j];
            vetorD[i+2] = vetorC[j];

            i = i+2;
            j++;
        }

        for(int i = 0; i < vetorD.length; i++) {
            System.out.println("Valor: " + vetorD[i]);
        }
    }
}
