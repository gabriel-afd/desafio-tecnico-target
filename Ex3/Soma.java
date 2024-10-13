package Ex3;

public class Soma {
    public static void main(String[] args) {

        int INDICIE = 12;
        double SOMA = 0;
        int K = 1;
        while (K < INDICIE){
            K += 1;
            SOMA += K;
        }
        System.out.println("Valor de SOMA: " + SOMA);
    }
}
