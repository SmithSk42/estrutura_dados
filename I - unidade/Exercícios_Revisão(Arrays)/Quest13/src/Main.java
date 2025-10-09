import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

        double somaTemperatura = 0;
        double[] temperaturaMes =  new double[12];
        String [] meses = {" 1 -Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril",
                            " 5 -Maio", " 6 - Junho"," 7 - Julho"," 8 - Agosto"," 9 - Setembro",
                            " 10 - Outubro", "11 - Novembro", " 12 -Dezembro"};

        System.out.println("Digite a temperatura média de cada mês durante um ano:");
        for (int i = 0; i < temperaturaMes.length; i++) {
            System.out.println( (i+1) + " - " + meses[i]);
            temperaturaMes[i] = om.nextDouble();
            System.out.println( meses[i] + " - " + temperaturaMes[i] +" catalogado!");
            somaTemperatura += temperaturaMes[i];
        }
        double temperaturaMedia = somaTemperatura / temperaturaMes.length;
        System.out.println("A média anual da temperatura é: " + temperaturaMedia);

        for(int i = 0; i < temperaturaMes.length; i++){
            if (temperaturaMes[i] > temperaturaMedia){
                System.out.println(meses[i] + " teve temperatura maior que a média anual. Com média de " + temperaturaMes[i]);
            }
        }
    }
}