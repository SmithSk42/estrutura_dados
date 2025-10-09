import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        int caracter[] = new int[20];
        int par[] = new int[20];
        int impar[] = new int[20];
        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite " + (i + 1) + "/20 dos numeros: ");
            caracter[i] = om.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (caracter[i] % 2 == 0) {
                par[qtdPar] = caracter[i];
                qtdPar++;
            } else {
                impar[qtdImpar] = caracter[i];
                qtdImpar++;
            }
        }
            System.out.println("Números gerais digitadas: ");
            for (int i = 0; i < 20; i++){
                System.out.println(caracter[i]);
            }
            System.out.println("Números pares digitadas: ");
            for (int i = 0; i < qtdPar; i++){
                System.out.println(par[i]);
            }
            System.out.println("Números impares digitadas: ");
            for (int i = 0; i < qtdImpar; i++){
                System.out.println(impar[i]);
            }
        }
    }