package com.journal.validator;

import com.journal.exeption.IncorrectInputException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
    @Deprecated
    public static boolean stringValid(String string) throws IncorrectInputException {
        if( string != null && (string.length() > 1) ){
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
@Deprecated
    public static boolean numberValid(String string) throws IncorrectInputException {
        if( string != null && (string.length() > 1) ){
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
    private static Pattern regexPattern;
    private static Matcher regMatcher;

    public static boolean validateEmailAddress(String emailAddress) throws IncorrectInputException {

        regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return true;
        } else {
            throw new IncorrectInputException("Incorrectly input email");
        }
    }

    public static boolean validateMobileNumber(String mobileNumber) throws IncorrectInputException {
        regexPattern = Pattern.compile("^\\+[0-9]{2}+-[0-9]{10}$");
        regMatcher   = regexPattern.matcher(mobileNumber);
        if(regMatcher.matches()) {
            return true;
        } else {
            throw new IncorrectInputException("Incorrectly input mobile number");
        }
    }
@Deprecated
    public static boolean groupName(String string) throws IncorrectInputException {
        if( string != null && (string.length() > 1) && (string.length() > 15)){
            String str = "abcdefghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ-0123456789";
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
    public static boolean validateGroup(String group) throws IncorrectInputException {
        regexPattern = Pattern.compile("[a-zA-Z-а-яА-Я]{1,3}[0-9]{1,2}");
        regMatcher   = regexPattern.matcher(group);
        if(regMatcher.matches()) {
            return true;
        } else {
            throw new IncorrectInputException("Incorrectly input Group");
        }
    }
    public static boolean validateText(String str) throws IncorrectInputException {
        regexPattern = Pattern.compile("^[A-ZА-ЯІ][a-z-а-яії]{1,15}",Pattern.UNICODE_CHARACTER_CLASS);
        regMatcher   = regexPattern.matcher(str);
        if(regMatcher.matches()) {
            return true;
        } else {
            throw new IncorrectInputException("Incorrectly input Text.");
        }
    }

    public static boolean validateFullText(String str) throws IncorrectInputException {
        regexPattern = Pattern.compile("^[A-ZА-ЯІ][a-z-а-яії\\.\\-\\+#_:;\\/()]+",Pattern.UNICODE_CHARACTER_CLASS);
        regMatcher   = regexPattern.matcher(str);
        if(regMatcher.matches()) {
            return true;
        } else {
            throw new IncorrectInputException("Incorrectly input Text.");
        }
    }
}
