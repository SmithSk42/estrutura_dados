import java.util.Scanner;
public class notaMedia {
    public static void main(String[] args) {
        Scanner om =  new Scanner(System.in);

        double notas[] = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas:...");
        for(int i= 0; i < 4; i++){
            System.out.println("Nota " + (i+1) + ":");
            notas[i] = om.nextDouble();
            soma += notas[i];
        }

        System.out.println("\nNotas digitadas:...");
        for(int i= 0; i < 4; i++){
            System.out.println("Nota: " + (i+1) +notas[i] + " ");
        }

        System.out.println("Média das notas digitadas:...");
        double media = soma/notas.length;
        System.out.println(media);

        om.close();
    }
}