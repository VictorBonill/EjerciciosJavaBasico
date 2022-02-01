package com.JavaBasicoCompilation;
/*
*
1. Dada la función: public static String reverse(String texto) {} Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
8. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
10. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
*/
public class Main {
    public static void main(String[] args) {
        //Solución ejercicio 1.
        //Backwards.getSentence();
        //Solución ejercicio 2.
        //ArrayOneDimension.showArray();
        //Solución ejercicio 3.
        //ArrayBidirectional.fillArrayInt();
        //Solución ejercicio 4.
        //Vectores.vectorElements();
        //Solución ejercicio 5.
        /*El problema de utilizar un vector con la capacidad por defecto, para añadirle 1000 elementos
        * radica en el coste de procesamiento que tendrá, al estar creando copias de vectores, cada vez que
        * se llegue a la capacidad maxima. Lo ideal seria crear al vector de una vez con la capacidad presupuestada
        * de 1000 elementos y ponerle un incremento de acuerdo a los elementos que se van a añadir.*/
        //Solución ejercicio 6.
        //ArrayListString.arrayListString();
        //Solución ejercicio 7.
        //ArrayListInt.arrayListInt();
        //Solución ejercicio 8.
        /*try{
            DivisionCero.DividePorCero(100,0);
        }
        catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de código");
        }*/
        //Solución ejercicio 9.
        //CopiarFicheros.CopiarArchivo("C:\\Users\\vboni\\Desktop\\Casas.txt","C:\\Users\\vboni\\Desktop\\prueb.txt");
        //Solución ejercicio 10.
        Calculadora.Calculadora();
       /* Ventana ventana;
        ventana = new Ventana();
        ventana.setVisible(true);*/

    }
}
