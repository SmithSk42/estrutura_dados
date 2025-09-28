
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        float array[] = new float[10];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            array[i] = om.nextFloat();
        }
        System.out.println("\nValores digitados: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        om.close();
    }
}