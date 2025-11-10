public class Balanceamento {
    public boolean estaBalanceado(String expressao){

        PilhaEstatica pilhaExp = new PilhaEstatica(expressao.length());

        for(int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            String simbolo = String.valueOf(c);

            if (simbolo.equals(("(")) || simbolo.equals("[") || simbolo.equals("{")) {
                pilhaExp.push(simbolo);
            } else if (simbolo.equals(")") || simbolo.equals("]") || simbolo.equals("}")) {
                if (pilhaExp.estaVazio()) {
                    System.out.println("Erro. Pilha está vazia");
                    return false;
                }
                String top = pilhaExp.pop();

                if (simbolo.equals(")") && !top.equals("(")) {
                    System.out.println("Erro. Esperava ) mas o topo é " + top);
                    return false;
                }
                if (simbolo.equals("]") && !top.equals("[")) {
                    System.out.println("Erro. Esperava ] mas o topo é " + top);
                    return false;
                }
                if (simbolo.equals("}") && !top.equals("{")) {
                    System.out.println("Erro. Esperava } mas o topo é " + top);
                    return false;
                }
            }
        }

                if (pilhaExp.estaVazio()){
                    return true;
                } else {
                    System.out.println("Erro. Sobram símbolos de abertura na pilha");
                    return false;
                }
            }
        }