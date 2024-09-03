package espm.aula09;

import java.util.ArrayList;
import java.util.List;

import espm.banco.*;

public class TestarRendimento {
    public static void main(String[] args) {
        
        Cliente paulo = new PessoaFisica("123.563.423.53");

        Conta cp = new ContaPoupanca(paulo);
        Conta ci = new ContaInvestimento(paulo);

        cp.depositar(100);
        ci.depositar(100);


        List<Conta> contas = new ArrayList<>();
        contas.add(cp);
        contas.add(ci);

        System.out.println(cp);
        System.out.println(ci);


        for(Conta c : contas){
            ((Rendimento) c).aplicar();
        }

        
        for(int i = 0 ; i < contas.size() ; i++){
            Conta c = contas.get(i);
            ((Rendimento) c).aplicar();
            }
        

        System.out.println(cp);
        System.out.println(ci);




    }

}
