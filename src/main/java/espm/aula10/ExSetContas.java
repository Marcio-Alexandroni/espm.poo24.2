package espm.aula10;
import java.util.*;
import espm.banco.*;


public class ExSetContas {
    public static void main(String[] args) {
        
        Set<Cliente> clientes = new HashSet<>();

        Cliente isabella = new PessoaFisica("123.432.342.23");
        Cliente henrique = new PessoaFisica("214.124.124.14");

        clientes.add(isabella);
        clientes.add(henrique);

    }
}
