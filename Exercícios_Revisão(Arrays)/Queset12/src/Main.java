import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int []vetorIdade = new int[30];
        double [] vetorAltura = new double[30];
        double somaAltura = 0;
        int qtdAlunos = 0;

        System.out.println("Idades dos alunos:");
        for (int i = 0; i < vetorIdade.length; i++) {
            System.out.println(i + " / 30");
            vetorIdade[i] = om.nextInt();
        }
        System.out.println("Idades catalogadas!");

        System.out.println("Altura dos alunos:");

        for (int i = 0; i < vetorAltura.length; i++) {
            System.out.println(i + " / 30");
            vetorAltura[i] = om.nextDouble();
            somaAltura += vetorAltura[i];
        }
        System.out.println("Alturas catalogadas!");


        double mediaAltura = somaAltura / vetorIdade.length;
        System.out.println("Média de altura: " + mediaAltura);
        for (int i = 0; i < vetorIdade.length; i++) {
            if (vetorIdade[i] > 13 && vetorAltura[i] > mediaAltura) {
                qtdAlunos ++;
            }
        }
        System.out.println("Quantidades de aluno que são maiores que 13 anos e tem altura maior que a média: " + qtdAlunos);

    }
}