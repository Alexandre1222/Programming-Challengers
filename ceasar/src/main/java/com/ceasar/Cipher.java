package com.ceasar;

public class Cipher {

    public static void main(String[] args) {
        String texto = "Teste";
        String mesclado = "";
        for(int i = 0; i < texto.length(); i++){
            int convert = ((int)texto.charAt(i)) + 3;
            if(convert > 122){
                convert -= 25;
            }
            if(convert > 90 && convert < 96){
                convert -= 25;
            }
            
            char desconv = (char) convert;
            mesclado = String.valueOf(desconv);
            mesclado.concat(mesclado);
            
           
        }
        System.out.print(mesclado);
    }

    public String descriptar(String n){
        return "Teste";
        
    }
}
