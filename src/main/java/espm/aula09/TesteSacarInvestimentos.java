package espm.aula09;

import espm.banco.*;

public class TesteSacarInvestimentos {
    public static void main(String[] args) {
        
        Cliente marcio = new PessoaFisica("232.231.123.32");
        Conta ci = new ContaInvestimento(marcio);

        ci.depositar(100);
        System.out.println(ci);


    }
}
