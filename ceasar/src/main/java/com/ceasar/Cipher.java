package com.ceasar;

import java.lang.reflect.Array;

public class Cipher {

    public static void main(String[] args) {
        String texto = "Teste";
        char[] str = new char[texto.length()];
        String concatenar = new String();
           // int convert = ((int)texto.charAt(i)) + 3;
           for(int i = 0; i < texto.length(); i++){

               int convert = ((int)texto.charAt(i)) + 3;
                str[i] = (char)convert;
                 concatenar = new String(str);
               System.out.println(concatenar);
           }
    }

    public String descriptar(String n){
        char[] str = new char[n.length()];
        String concatenar = new String();
           // int convert = ((int)texto.charAt(i)) + 3;
           for(int i = 0; i < n.length(); i++){

               int convert = ((int)n.charAt(i)) + 3;
                str[i] = (char)convert;
                 concatenar = new String(str);
           }
        return concatenar;
        
    }
}
