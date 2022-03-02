package ro.ase.csie.cts.g1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static class LowerCaseException extends Exception {

        @Override
        public String getMessage() {
            return "all characters are lower case";
        }
    }

    public static class UpperCaseException extends Exception {

        @Override
        public String getMessage() {
            return "all characters are upper case";
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("write something");

        // console readline - mediu de dezv (null)  vs linie de comanda (da)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String text = br.readLine();
            char[] textToChar = text.toCharArray();

            int nr = 0 ;
            for(int i = 0; i< textToChar.length; i++){
                if(Character.isLowerCase(textToChar[i])){
                    nr ++;
                } else {
                    nr --;
                }
            }

            if( nr == textToChar.length){
                throw new LowerCaseException();

            } else if(nr == -textToChar.length){
                throw new UpperCaseException();
            }
            else{
                System.out.println("word contains both lower and upper case characters ");

            }

        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}
