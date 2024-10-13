package Ex1;

import java.util.Scanner;

public class FibonacciCheck {

    public static boolean isSeqFibonacci(int number){

        int x1 = 0;
        int x2 = 1;

        if (number == x1 || number == x2){
            return true;
        }

        int prox = x1+x2;
        while (prox <= number){
            if(prox == number){
                return true;
            }
            x1 = x2;
            x2 = prox;
            prox = x1 + x2;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = scanner.nextInt();

        if (isSeqFibonacci(num) == true){
            System.out.println("O número " + num +  " pertence a sequência Fibonacci ");
        } else{
            System.out.println("O número" + num +  " não pertence a sequência Fibonacci");
        }

        scanner.close();
    }
}
