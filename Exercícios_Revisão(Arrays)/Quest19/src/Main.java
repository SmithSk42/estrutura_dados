import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Main {

    public static double calcularPercentual(int votosDoJogador, int totalDeVotos) {
        if (totalDeVotos == 0) {
            return 0.0;
        }
        return ((double) votosDoJogador / totalDeVotos) * 100.0;
    }

    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int[] votosPorJogador = new int[24];
        int totalDeVotos = 0;
        int voto;

        System.out.println("Enquete: Quem foi o melhor jogador?");

        while (true) {
            System.out.print("Número do jogador (0=fim): ");
            voto = om.nextInt();

            if (voto == 0) break;

            if (voto < 1 || voto > 23) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
                continue;
            }

            votosPorJogador[voto]++;
            totalDeVotos++;
        }

        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Resultado da votação:\n\n");
        relatorio.append("Foram computados ").append(totalDeVotos).append(" votos.\n\n");
        relatorio.append("Jogador   Votos   %\n");

        int melhorJogador = 0;
        int maxVotos = 0;

        for (int i = 1; i <= 23; i++) {
            if (votosPorJogador[i] > 0) {
                double percentual = calcularPercentual(votosPorJogador[i], totalDeVotos);
                relatorio.append(String.format("%-10d%-8d%.1f%%\n", i, votosPorJogador[i], percentual));

                if (votosPorJogador[i] > maxVotos) {
                    maxVotos = votosPorJogador[i];
                    melhorJogador = i;
                }
            }
        }

        double percentualMelhor = calcularPercentual(maxVotos, totalDeVotos);
        relatorio.append(String.format("\nO melhor jogador foi o número %d, com %d votos, correspondendo a %.1f%% do total de votos.",
                melhorJogador, maxVotos, percentualMelhor));

        System.out.println("\n" + relatorio.toString());

        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado_enquete.txt"))) {
            writer.print(relatorio.toString());
            System.out.println("\nRelatório salvo com sucesso em 'resultado_enquete.txt'");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        om.close();
    }
}