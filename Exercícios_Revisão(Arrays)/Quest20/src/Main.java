import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        String[] sistemas = {"", "Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};
        int[] votosSO = new int[7]; // Posições de 0 a 6. Usaremos de 1 a 6.
        int totalVotos = 0;

        System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");

        int voto;
        while (true) {
            System.out.print("Digite seu voto (1-6 ou 0 para sair): ");
            voto = om.nextInt();

            if (voto == 0) break;

            if (voto < 1 || voto > 6) {
                System.out.println("Opção inválida!");
                continue;
            }

            votosSO[voto]++;
            totalVotos++;
        }

        System.out.println("\nSistema Operacional    Votos   %");
        System.out.println("-------------------    -----   ---");

        int indiceVencedor = 0;
        int maxVotos = -1;

        for (int i = 1; i <= 6; i++) {
            double percentual = (totalVotos == 0) ? 0 : ((double) votosSO[i] / totalVotos) * 100;
            System.out.printf("%-20s %-8d %.0f%%\n", sistemas[i], votosSO[i], percentual);

            if (votosSO[i] > maxVotos) {
                maxVotos = votosSO[i];
                indiceVencedor = i;
            }
        }

        System.out.println("-------------------    -----");
        System.out.printf("%-20s %-8d\n", "Total", totalVotos);

        if (totalVotos > 0) {
            double percentualVencedor = ((double) maxVotos / totalVotos) * 100;
            System.out.printf("\nO Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.0f%% dos votos.\n",
                    sistemas[indiceVencedor], maxVotos, percentualVencedor);
        } else {
            System.out.println("\nNenhum voto foi computado.");
        }

        om.close();
    }
}