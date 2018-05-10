package com.journal.validator;

import com.journal.exeption.IncorrectInputException;

public class Validador {
    public static boolean stringValid(String string) throws IncorrectInputException {
        if(string != null && !string.isEmpty()){
            String str = "abcdefghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ-";
            for (int i = 0; i < string.length(); i++){
                int index = str.indexOf(string.charAt(i));
                if (index == -1)
                    throw new IncorrectInputException("Incorrectly input litter");
            }
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean numberValid(String string) throws IncorrectInputException {
        if(string != null && !string.isEmpty()){
            String str = "0123456789+";
            for (int i = 0; i < string.length(); i++){
                int index = str.indexOf(string.charAt(i));
                if (index == -1)
                    throw new IncorrectInputException("Incorrectly input number");
            }
            return true;
        }
        else{
            return false;
        }
    }
}
