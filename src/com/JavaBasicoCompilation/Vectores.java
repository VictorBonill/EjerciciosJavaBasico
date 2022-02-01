package com.JavaBasicoCompilation;

import java.util.Vector;

public class Vectores {
    public static void vectorElements(){
        Vector<String> marcasCoches = new Vector();
        marcasCoches.add("Mazda");
        marcasCoches.add("BMW");
        marcasCoches.add("Toyota");
        marcasCoches.add("Ford");
        marcasCoches.add("Audi");
        System.out.println(marcasCoches);

        marcasCoches.remove(1);
        marcasCoches.remove(2);
        System.out.println(marcasCoches);
    }

}
