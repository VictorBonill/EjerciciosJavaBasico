package com.JavaBasicoCompilation;
import java.io.*;
import java.util.*;

public class Calculadora {
    public static void Calculadora(){
        double x, y;
        String in;
        Scanner scanner = new Scanner(System.in);
        System.out.println("_____________ CALCULADORA MUY MONA!! ________________________");
        System.out.println("Ingrese la operación que desea realizar, ejemplo: '5+8'");
        System.out.println("Presiona Enter para ver el resultado!!");
        System.out.println("Para ver todo el historial de operaciones escriba: h");
        System.out.println("Para terminar de usar la calculadora escriba: fin");
        System.out.println("_____________________________________________________________");
        HashMap<String, Double> historial;
        ArrayList<Double> operacionesResueltas = new ArrayList<>();
        historial=recuperarHistorial();
        do {
            in=scanner.next();
            if(in.contains("h")){
                HashMap<String, Double> registros = recuperarHistorial();
                for(Map.Entry registro: registros.entrySet()){
                    System.out.println(registro.getKey()+"="+registro.getValue());
                }
            }
            if(in.contains("+")){
                String[] parts = in.split("\\+");
                x = Double.parseDouble(parts[0]);
                y = Double.parseDouble(parts[1]);
                operacionesResueltas.add(suma(x,y));
                historial.put(in,operacionesResueltas.get(operacionesResueltas.size() - 1));
                System.out.println(operacionesResueltas.get(operacionesResueltas.size() - 1));
            }
            if(in.contains("*")){
                String[] parts = in.split("\\*");
                x = Double.parseDouble(parts[0]);
                y = Double.parseDouble(parts[1]);
                operacionesResueltas.add(multiplica(x,y));
                historial.put(in,operacionesResueltas.get(operacionesResueltas.size() - 1));
                System.out.println(operacionesResueltas.get(operacionesResueltas.size() - 1));
            }
            if(in.contains("/")){
                String[] parts = in.split("/");
                x = Double.parseDouble(parts[0]);
                y = Double.parseDouble(parts[1]);
                operacionesResueltas.add(divide(x,y));
                historial.put(in,operacionesResueltas.get(operacionesResueltas.size() - 1));
                System.out.println(operacionesResueltas.get(operacionesResueltas.size() - 1));
            }
            if(in.contains("^")){
                String[] parts = in.split("\\^");
                x = Double.parseDouble(parts[0]);
                y = Double.parseDouble(parts[1]);
                operacionesResueltas.add(elevado(x, (int)y));
                historial.put(in,operacionesResueltas.get(operacionesResueltas.size() - 1));
                System.out.println(operacionesResueltas.get(operacionesResueltas.size() - 1));
            }
            if(in.contains("-") && !in.contains("+") && !in.contains("*") && !in.contains("/")) {
                if (in.startsWith("-")) {
                    String negativo = in.substring(1);
                    String[] parts = negativo.split("-");
                    x = Double.parseDouble(parts[0])*-1;
                    y = Double.parseDouble(parts[1]);
                    operacionesResueltas.add(resta(x, y));
                    historial.put(in, operacionesResueltas.get(operacionesResueltas.size() - 1));
                    System.out.println(operacionesResueltas.get(operacionesResueltas.size() - 1));
                } else {
                    String[] parts = in.split("-");
                    x = Double.parseDouble(parts[0]);
                    y = Double.parseDouble(parts[1]);
                    operacionesResueltas.add(resta(x, y));
                    historial.put(in, operacionesResueltas.get(operacionesResueltas.size() - 1));
                    System.out.println(operacionesResueltas.get(operacionesResueltas.size() - 1));
                }
            }
        saveHistorial(historial);
        }while (!in.contains("fin"));
    }
    public static double suma(double x, double y) {
        return x + y;
    }
    public static double resta(double x, double y) {
        return x - y;
    }
    public static double multiplica(double x, double y) {
        return x * y;
    }
    public static double divide(double x, double y) {
        return x / y;
    }
    public static double elevado(double x, int y) {
        return Math.pow(x,y);
    }
    public static HashMap<String, Double> recuperarHistorial(){
        try{
            InputStream history = new FileInputStream("C:\\Users\\vboni\\Desktop\\history.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(history));
            HashMap<String, Double>historialRecuperado= new HashMap<>();
            String line=null;
            try{
                line=br.readLine();
                line=line.substring(1);
                line=line.substring(0, line.length()-1);
                String[] parts= line.split(",");
                for (String part : parts){
                    String[] variable = part.split("=");
                    String clave = variable[0].trim();
                    Double valor = Double.valueOf(variable[1].trim());
                    historialRecuperado.put(clave, valor);
                    //System.out.println(part.trim());
                }
                return historialRecuperado;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void saveHistorial(HashMap<String, Double> historial){
        try{
            PrintStream history = new PrintStream("C:\\Users\\vboni\\Desktop\\history.txt");
            history.println(historial);
            history.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
