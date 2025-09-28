import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int[] contadoresDefeitos = new int[5]; // Posição 0 ignorada, usamos 1 a 4
        String[] descricoesDefeitos = {
                "", // Posição 0 ignorada
                "necessita da esfera",
                "necessita de limpeza",
                "necessita troca do cabo ou conector",
                "quebrado ou inutilizado"
        };
        int totalMouses = 0;

        System.out.println("Digite o ID e o tipo de defeito (1 a 4). ID 0 para encerrar.");

        while (true) {
            System.out.print("\nIdentificação do Mouse: ");
            int id = om.nextInt();
            if (id == 0) break;

            System.out.print("Tipo de defeito (1-esfera, 2-limpeza, 3-cabo, 4-quebrado): ");
            int defeito =om.nextInt();

            if (defeito >= 1 && defeito <= 4) {
                contadoresDefeitos[defeito]++;
                totalMouses++;
            } else {
                System.out.println("Tipo de defeito inválido. Mouse não contabilizado.");
            }
        }

        System.out.println("\nQuantidade de mouses: " + totalMouses);
        System.out.println("\nSituação                             Quantidade    Percentual");

        for (int i = 1; i <= 4; i++) {
            double percentual = (totalMouses == 0) ? 0 : ((double) contadoresDefeitos[i] / totalMouses) * 100;
            System.out.printf("%d- %-35s %-14d %.0f%%\n",
                    i, descricoesDefeitos[i], contadoresDefeitos[i], percentual);
        }

        om.close();
    }
}