import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.println("Insira a nota: De forma indeterminada. Finaliza quando nota = -1.");
            double notaLida = om.nextDouble();
            if (notaLida == -1) {
                break;
            }
            notas.add(notaLida);
        }
        System.out.println("Catalogação finalizada!");

        int qtdNotas = notas.size();
        System.out.println("Notas catalogadas: " + qtdNotas);

        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i) + " ;");
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println("Soma: " + soma);

        double media = 0;
        if (qtdNotas == 0) {
            System.out.println("Não houveram notas catalogadas!");
            System.out.println("Fim do programa.");
            om.close();
        } else {
            media = soma / qtdNotas;
            System.out.printf("Media: %.2f\n", media);
        }

        int acimaDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Acima da media: " + acimaDaMedia);

        int abaixoDe7 = 0;
        for (double nota : notas) {
            if (nota < 7.0) {
                abaixoDe7++;
            }
            System.out.println("Abaixo de 7: " + abaixoDe7);

            System.out.println("-----------------");
            System.out.println("Fim do programa.");
            System.out.println("-----------------");

            om.close();
        }
    }
}