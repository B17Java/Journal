package com.journal.validator;

public class Validador {
    public static boolean nameValid(String name){
        String temp = name;
        if(name != null && name.isEmpty()){

            //to do

            return true;
        }
        else{
            return false;
        }
    }
}
