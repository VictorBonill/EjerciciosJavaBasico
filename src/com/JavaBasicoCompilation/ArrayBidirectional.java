package com.JavaBasicoCompilation;

import java.util.Random;

public class ArrayBidirectional {
    static int FILES = 38;
    static int[][] arrayBi = new int[10][8];
    static Random rd = new Random();
    public static void fillArrayInt(){
        for (int i = 0; i <= arrayBi.length-1; i++){
            for (int k = 0; k<= FILES;k++){
                System.out.print("_");
            }
            System.out.println();
            for (int j = 0; j<= arrayBi[i].length-1; j++){
                try{
                    arrayBi[i][j] = rd.nextInt(100);
                    System.out.print(arrayBi[i][j] + " | ");
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println();
        }
    }

}
