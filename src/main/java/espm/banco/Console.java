package espm.banco;

import java.util.Scanner;

public class Console{

    private static Banco banco = new Banco("ESPM Bank");
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bem-Vindo ao " + banco.getNome());

        while (true) {
            System.out.print(" -> ");
            String linha = entrada.nextLine().trim();
            if (linha.equals("exit")) break;
            else if (linha.equals("help")) help();
            else if (linha.equals("1")) listCostumers();
            else if (linha.equals("2")) insertCostumer();
            else if (linha.length() == 0) continue;
            else System.err.println("Comando Inválido");
            return;
        }

        System.out.println("Até logo!");
        entrada.close();

    }


    private static void help(){

        System.out.println(
            "---" + banco.getNome() + "---" +
            "\n 1. Listar clientes" +
            "\n 2. Cadastrar clientes"
        );
        System.out.println("------------------");
    }


    private static void listCostumers() {
        banco.getClientes().forEach(cliente -> {
            System.out.println(cliente);

        });
    }


    private static void insertCostumer(){
        System.out.println("Tipo: [F | J]");
        boolean isFisica = entrada.nextLine().trim().equalsIgnoreCase("f");
        final Cliente cliente;
        System.out.println("Nome: ");
        String nome = entrada.nextLine().trim();
        if (isFisica) {
            System.out.println("CPF: ");
            String cpf = entrada.nextLine().trim();
            cliente = new PessoaFisica(cpf , nome);
        } else {
            System.out.println("CNPJ: ");
            String cnpj = entrada.nextLine().trim();
            cliente = new PessoaJuridica(cnpj, nome);
        }

        banco.add(cliente);

    }



}
