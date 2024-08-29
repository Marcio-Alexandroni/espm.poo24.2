package espm.aula08;

import java.util.*;

public class ListaEstatica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros[] = { 40 , 12 , 56 };

        System.out.println(numeros[0]);

        
        int n = entrada.nextInt();
        double[] ns = new double[n];
        for (double x : ns){
            System.out.println("aqui: " + x);
        }

        // Notação Lambda Java
        Arrays.stream(ns).forEach(System.out::println);
        //Arrays.stream(ns).forEach(x -> System.out.println(x));

        entrada.close();

    }
}
