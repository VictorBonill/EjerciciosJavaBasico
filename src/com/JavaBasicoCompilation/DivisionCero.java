package com.JavaBasicoCompilation;

public class DivisionCero {
    public static void DividePorCero(int x, int y) throws ArithmeticException {
        try {
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
