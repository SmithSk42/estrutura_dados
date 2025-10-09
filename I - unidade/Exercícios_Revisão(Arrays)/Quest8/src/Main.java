import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int idade[]= new int[5];
        double altura[]= new double[5];

        for (int i = 0; i < idade.length; i++) {
        System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
        idade[i] = om.nextInt();
        System.out.print("Informe a altura da pessoa " + (i+1) + ": ");
        altura[i] = om.nextDouble();
        System.out.print("Catalogado!");
        }

        for (int i = 4; i > 0; i--) {
            System.out.println("Apresentação das idades e alturas na ordem inversa");
            System.out.println("Pessoa " + i + " - " + i + ":");
            System.out.println("Idade: " + idade[i] + " - Altura: " + altura[i]);
        }
    }
}