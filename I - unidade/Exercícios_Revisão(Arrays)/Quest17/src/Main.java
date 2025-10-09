import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om =  new Scanner(System.in);

        int [] faixaSalarial = new int[9];

        double valorBruto = 0.0;
        while(true){
            System.out.println("Insira o valor que cada vendedor vendeu ultimo mês:");
            System.out.println("Insira -1 para encerrar a contagem");
            double valorLido = om.nextDouble();
            if(valorLido < 0){
                break;
            } else {
                double salario = valorBruto * 0.09 + 200;
                if (salario > 200 && salario < 299) {
                    faixaSalarial[0]++;
                } else if (salario > 300 && salario < 399) {
                    faixaSalarial[1]++;
                } else if (salario > 400 && salario < 499) {
                    faixaSalarial[2]++;
                } else if (salario > 500 && salario < 599) {
                    faixaSalarial[3]++;
                } else if (salario > 600 && salario < 699) {
                    faixaSalarial[4]++;
                } else if (salario > 700 && salario < 799) {
                    faixaSalarial[5]++;
                } else if (salario > 800 && salario < 899) {
                    faixaSalarial[6]++;
                } else if (salario > 900 && salario < 999) {
                    faixaSalarial[7]++;
                } else if (salario >= 1000) {
                    faixaSalarial[8]++;
                }
            }}
                System.out.println("Contagem vendedores por faixa salarial:");
                System.out.println(faixaSalarial[0]);
                System.out.println(faixaSalarial[1]);
                System.out.println(faixaSalarial[2]);
                System.out.println(faixaSalarial[3]);
                System.out.println(faixaSalarial[4]);
                System.out.println(faixaSalarial[5]);
                System.out.println(faixaSalarial[6]);
                System.out.println(faixaSalarial[7]);
                System.out.println(faixaSalarial[8]);
            }
        }