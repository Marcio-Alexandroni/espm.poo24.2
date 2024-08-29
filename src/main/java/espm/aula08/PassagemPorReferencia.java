package espm.aula08;

import java.util.Arrays;

public class PassagemPorReferencia {
    public static void main(String[] args) {
        
        int[] a = {1,2,3};
        soma1(a);
        System.out.println(Arrays.toString(a));

        int b = 5;
        soma1(b);
        System.out.println(b);



    }

    // Passagem do parâmetro por referência --> Por ponteiro de memória
    public static void soma1(int[] ns){
        for (int i = 0 ; i < ns.length ; i++){
            ns[i] += 1;
        }
    }

    // tipo primitivo, copia o conteúdo da variável
    public static void soma1(int b){
        b += 1;
        System.out.println("Dentro: " + b);
    }
}
