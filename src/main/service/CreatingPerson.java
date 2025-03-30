package main.service;

import main.model.Contribuinte;
import java.util.ArrayList;
import java.util.List;

public class CreatingPerson {

    private List<Contribuinte> contribuintes = new ArrayList<>();

    public void adicionarPessoa(String nome, String profissao, Double rendaBruta, String CPF, String dataNascimento, String endereco, String telefone, String email) {
        Contribuinte novaPessoa = new Contribuinte(nome, profissao, rendaBruta, CPF, dataNascimento, endereco, telefone, email);
        contribuintes.add(novaPessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarPessoas() {
        if (contribuintes.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("Lista de Pessoas:");
            for (Contribuinte pessoa : contribuintes) {
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Profissão: " + pessoa.getProfissao());
                System.out.println("Renda Bruta: " + pessoa.getRendaBruta());
                System.out.println("CPF: " + pessoa.getCPF());
                System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
                System.out.println("Endereço: " + pessoa.getEndereco());
                System.out.println("Telefone: " + pessoa.getTelefone());
                System.out.println("Email: " + pessoa.getEmail());
                System.out.println("-----------------------------");
            }
        }
    }
}