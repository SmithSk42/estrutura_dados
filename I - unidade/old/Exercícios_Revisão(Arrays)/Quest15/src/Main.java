import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om =  new Scanner(System.in);

        int contadorRespostaP = 0;
        String resposta;

        System.out.println("Responta com 's' ou 'n'.");
        System.out.println("Perguntas sobre um suposto crime:");
        resposta = om.nextLine().toLowerCase();
            if (resposta.equals("s")) {
            contadorRespostaP++;
        }

        System.out.println("Telefonou para a vítima?");
        resposta = om.nextLine().toLowerCase();
        if (resposta.equals("s")) {
            contadorRespostaP++;
        }
        System.out.println("Mora perto da vítima?");
            resposta = om.nextLine().toLowerCase();
            if (resposta.equals("s")) {
                contadorRespostaP++;
            }
        System.out.println("Devia à vítima?");
                resposta = om.nextLine().toLowerCase();
                if (resposta.equals("s")) {
                    contadorRespostaP++;
                }
        System.out.println("Já trabalhou com a vítima?");
                    resposta = om.nextLine().toLowerCase();
                    if (resposta.equals("s")) {
                        contadorRespostaP++;
                    }

        if (contadorRespostaP == 0){
            System.out.println("Inocente.");
        } else if(contadorRespostaP == 2){
            System.out.println("Suspeito.");
        } else if ( contadorRespostaP == 3 ||  contadorRespostaP == 4){
            System.out.println("Cumplice");
        } else {
            System.out.println("Assassino.");
        }
    }
}