package espm.aula09;

import espm.banco.*;

public class TesteConta {
    public static void main(String[] args) {
        
        Cliente c1 = new PessoaFisica("123.321.123.21");
        Conta cc1 = new ContaCorrente(c1);

        cc1.sacar(800);
        System.out.println(cc1);

    }
}
