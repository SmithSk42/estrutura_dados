import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        double[] medias = new double[10];
        int alunosAprovados = 0;

        for (int i = 0; i < 10; i++) {
            double somaNotas = 0;
            System.out.printf("/n--- Aluno ", (i + 1), " ---");
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota %d ", (j + 1), "/4:...");
                double nota = om.nextDouble();
                somaNotas += nota;
            }

            medias[i] = somaNotas/4;
            System.out.println("O aluno " + (i+1) + " obteve a media: "+ medias[i]);

            if (medias[i] >= 7.0){
                alunosAprovados++;
            }
        }
        System.out.println("O número de alunos aprovados com média >= 7 é:" +  alunosAprovados);
    }}