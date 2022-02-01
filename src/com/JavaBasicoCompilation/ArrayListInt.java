package com.JavaBasicoCompilation;

import java.util.ArrayList;

public class ArrayListInt {
    public static void arrayListInt(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        for(int j=1; j<=numbers.size(); j++){
            if (numbers.get(j)%2==0){
                numbers.remove(j);
            }
        }
        System.out.println(numbers);
    }
}
