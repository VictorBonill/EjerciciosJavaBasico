package com.JavaBasicoCompilation;

import java.io.*;

public class CopiarFicheros {
    public static void CopiarArchivo(String fileIn, String fileOut){
        StringBuilder texto = new StringBuilder();
        try{
            InputStream in = new FileInputStream(fileIn);
            try {
                byte[] data = in.readAllBytes();
                for (byte b : data) {
                    System.out.print((char)b);
                    texto.append((char)b);
                }
            } catch (IOException e) {
                System.out.println("Hubo un problema: " + e.getMessage());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }
        try{
            PrintStream out = new PrintStream(fileOut);
            out.println(texto);
            out.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
