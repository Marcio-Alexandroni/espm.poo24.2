package espm.aula08;

import java.util.*;;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("A: ");
        int a = Integer.parseInt(entrada.nextLine());

        System.out.print("B: ");
        int b = Integer.parseInt(entrada.nextLine());

        double c = Math.pow(a*a + b*b, .5);
        System.out.println("C: " + c);
        int d = (int) c;
        System.out.println("C: " + d);

        entrada.close();

    }
}