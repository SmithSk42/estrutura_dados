import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);
        final int NUMERO_CARROS = 5;
        final double DISTANCIA = 1000.0;
        final double PRECO_GASOLINA = 2.25;

        String[] modelos = new String[NUMERO_CARROS];
        double[] consumo = new double[NUMERO_CARROS];

        System.out.println("Comparativo de Consumo de Combustível");
        for (int i = 0; i < NUMERO_CARROS; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.print("Nome: ");
            modelos[i] = om.nextLine();
            System.out.print("Km por litro: ");
            consumo[i] = om.nextDouble();
            om.nextLine(); // Limpa o buffer
        }

        System.out.println("\nRelatório Final");

        int indiceMaisEconomico = 0;
        double maiorConsumo = 0;

        for (int i = 0; i < NUMERO_CARROS; i++) {
            double litros = DISTANCIA / consumo[i];
            double custo = litros * PRECO_GASOLINA;

            System.out.printf("%d - %-10s - %4.1f - %7.1f litros - R$ %.2f\n",
                    (i + 1), modelos[i], consumo[i], litros, custo);

            if (consumo[i] > maiorConsumo) {
                maiorConsumo = consumo[i];
                indiceMaisEconomico = i;
            }
        }

        System.out.println("\nO menor consumo é do " + modelos[indiceMaisEconomico] + ".");
        om.close();
    }
}