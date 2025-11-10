public class Binario {
    public String decToBin(String elemento){
        int numDecimal = Integer.parseInt(elemento);
        if(numDecimal == 0){
            return "0";
        }
        PilhaEstatica pilhaResto = new PilhaEstatica(numDecimal);

        while(numDecimal > 0){
            int resto = numDecimal % 2;
            pilhaResto.push(String.valueOf(resto));
            numDecimal /= 2;
        }
        return pilhaResto.pop();
    }
}
