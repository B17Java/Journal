package com.journal.validator;

import com.journal.IncorrectInputException;

public class Validador {
    public static boolean stringValid(String string) throws IncorrectInputException {
        string = string.trim();
        if(string != null && !string.isEmpty()){
            int flag;
            char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'
                    ,'t','u','v','w','x','y','z','A','B','C','D','I','F','G','H','I','J','K','L','M','N','O','P','Q','R','S'
                    ,'T','U','V','W','X','Y','Z','-'};
            for (int i = 0; i < string.length(); i++){
                flag = 0;
                for (char letter : letters){
                    if ( string.charAt(i) == letter ){
                        flag = 1;
                        break;
                    }
                }
                if (flag != 1)
                    throw new IncorrectInputException("Incorrectly input litter");
            }
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean numberValid(String string) throws IncorrectInputException {
        string = string.trim();
        if(string != null && !string.isEmpty()){
            int flag;
            char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+'};
            for (int i = 0; i < string.length(); i++){
                flag = 0;
                for (char number : numbers){
                    if ( string.charAt(i) == number ){
                        flag = 1;
                        break;
                    }
                }
                if (flag != 1)
                    throw new IncorrectInputException("Incorrectly input number");
            }
            return true;
        }
        else{
            return false;
        }
    }
}
