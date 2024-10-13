package Ex2;

public class StringCheck {

    private String inputString;

    public StringCheck(String inputString){
        this.inputString = inputString;
    }

    public int countString(){

        int cont = 0;
        for (int i =0; i< inputString.length(); i++){
           if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A'){
               cont++;
           }
        }
        return cont;
    }


}
