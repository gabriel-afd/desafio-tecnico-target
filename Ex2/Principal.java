package Ex2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma string: ");
        String in = scanner.nextLine();

        //Instanciando o objeto
        StringCheck contLetter = new StringCheck(in);

        int times = contLetter.countString();

        if (times > 0){
            System.out.println("A letra 'a' ou 'A' aparece " + times + " vezes ");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece nenhuma vez! ");
        }




    }
}
