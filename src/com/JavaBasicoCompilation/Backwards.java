package com.JavaBasicoCompilation;

import java.util.Scanner;

public class Backwards {
    public static void getSentence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase!!");
        String sentence = scanner.nextLine();
        System.out.println(reverse(sentence));
    }
    public static String reverse(String texto){
        String result="";
        for ( int i=texto.length(); i >=0; i--){
            try{
                result += texto.charAt(i-1);
            }catch(Exception e){
                break;
            }
        }
        return result;
    }
}
