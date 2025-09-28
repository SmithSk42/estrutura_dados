import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        ArrayList<Double> salarios = new ArrayList<>();

        System.out.println("Projeção de Gastos com Abono");
        System.out.println("============================");

        double salarioLido;
        while (true) {
            System.out.print("Salário: ");
            salarioLido = om.nextDouble();
            if (salarioLido == 0) break;
            salarios.add(salarioLido);
        }

        ArrayList<Double> abonos = new ArrayList<>();
        int totalAbonoMinimo = 0;
        double totalGastoAbonos = 0;
        double maiorAbono = 0;

        for (double salario : salarios) {
            double abono = salario * 0.20;
            if (abono < 100.0) {
                abono = 100.0;
                totalAbonoMinimo++;
            }
            abonos.add(abono);
            totalGastoAbonos += abono;
            if (abono > maiorAbono) {
                maiorAbono = abono;
            }
        }

        System.out.println("\nSalário    - Abono");
        for (int i = 0; i < salarios.size(); i++) {
            System.out.printf("R$ %8.2f - R$ %8.2f\n", salarios.get(i), abonos.get(i));
        }

        System.out.println("\nForam processados " + salarios.size() + " colaboradores");
        System.out.printf("Total gasto com abonos: R$ %.2f\n", totalGastoAbonos);
        System.out.println("Valor mínimo pago a " + totalAbonoMinimo + " colaboradores");
        System.out.printf("Maior valor de abono pago: R$ %.2f\n", maiorAbono);

        om.close();
    }
}