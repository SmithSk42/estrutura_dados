import  java.util.Scanner;
public class consoante {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        char caracters [] = new char[5];
        char consoante [] = new char[5];
        int qtdConsoantes = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce caracter " + (i + 1) + ": ");
            caracters[i] = om.next().toUpperCase().charAt(0);
        }
        for (int i = 0; i < caracters.length; i++) {
            if (caracters[i] != 'A' && caracters[i] != 'E' &&
                    caracters[i] != 'I' && caracters[i] != 'O' &&
                    caracters[i] != 'U') {
                consoante[qtdConsoantes] = caracters[i];
                qtdConsoantes++;
            }
        }
            System.out.println("\nConsoantees digitadas: ");
            for(int i=0; i < qtdConsoantes; i++){
                System.out.print("Caracter " + (i + 1) + ": ");
                System.out.println(consoante[i]);
        }
    }
}