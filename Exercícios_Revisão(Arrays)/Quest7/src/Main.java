import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om =  new Scanner(System.in);

        int numeros[] = new int [5];
        int soma = 0;
        int multi = 1;

        System.out.println("Introduza 5 números a seguir:...");
            for (int i = 0; i < numeros.length; i++){
                System.out.println(i +" / 5");
                numeros [i] = om.nextInt();
                soma += numeros [i];
                multi *= numeros [i];
                System.out.println("Número processado!");
            }
        System.out.println("Resultados: ");
            for (int numero : numeros){
                System.out.println(numero + " ");
            }

        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplivcação: " + multi);
    }
}