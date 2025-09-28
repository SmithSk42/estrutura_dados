import java.util.ArrayList;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        while (true) {
            System.out.print("\nAtleta: ");
            String nome = om.nextLine();

            if (nome.isEmpty()) {
                break;
            }
            double[] saltos = new double[5];
            double somaSaltos = 0;

            for (int i = 0; i < saltos.length; i++) {
                System.out.printf("Catalogue o salto ", (i + 1), ":");
                saltos[i] = om.nextDouble();
                somaSaltos += saltos[i];
            }

            double media = somaSaltos / 5;

            System.out.println("\nResultado final:");
            System.out.println("Atleta: " + nome);
            System.out.println("Saltos: " + saltos);
            for (int i = 0; i < saltos.length; i++) {
                System.out.println(saltos[i]);
                if (i < 4) {
                    System.out.println(" - ");
                }
            }
            System.out.println("\nMédia de saltos: %.f m\n" + media);
        }
        System.out.println("\nPrograma finalizado");
    }
}