package espm.banco;

import java.util.*;

public class Banco {
    
    private final String nome;

    // Criação dos Maps
    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, PessoaFisica> clientesByCPF = new HashMap<>();
    private Map<String, PessoaJuridica> clientesByCNPJ = new HashMap<>();
 

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    // Metodo para adicionar clientes;
    public void add(Cliente cliente){
        clientes.put(cliente.getId(), cliente);
        if (cliente instanceof PessoaFisica pf) clientesByCPF.put(pf.getCpf(), pf);
        if (cliente instanceof PessoaJuridica pj) clientesByCNPJ.put(pj.getCnpj(), pj);
    }


    // Retorno da Lista de Clientes
    public Set<Cliente> getClientes(){
        return new HashSet<>(Collections.unmodifiableCollection(clientes.values()));
    }


}
