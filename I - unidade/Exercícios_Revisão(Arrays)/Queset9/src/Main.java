import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om =  new Scanner(System.in);

        int numeros[] = new int[10];
        int exponencial[] = new int [10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduza os 10 números: " + (i+1) + " / 10");
            numeros[i] = om.nextInt();
        }
        System.out.println("Catalogados com sucesso!");
        for (int i = 0; i < numeros.length; i++) {
            exponencial[i] = numeros[i]*numeros[i];
            System.out.print(exponencial[i] + " ");
        }
    }
}