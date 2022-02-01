package com.JavaBasicoCompilation;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {
    public static void arrayListString(){
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Jamaica");
        paises.add("Guatemala");
        paises.add("Colombia");
        paises.add("Cuba");

        LinkedList<String> otroListado = new LinkedList<String>(paises);

        for (String pais : paises){
            System.out.println(pais);
        }
        for (String element : otroListado){
            System.out.println(element);
        }
    }
}
