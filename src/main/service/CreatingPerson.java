package main.service;

import main.model.Contribuinte;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingPerson {

    private List<Contribuinte> contribuintes = new ArrayList<>();
    Scanner info = new Scanner(System.in);
    int opcao;

    public void adicionarPessoa(String nome, String profissao, Double rendaBruta, String CPF, String dataNascimento, String endereco, String telefone, String email) {
        Contribuinte novaPessoa = new Contribuinte(nome, profissao, rendaBruta, CPF, dataNascimento, endereco, telefone, email);
        contribuintes.add(novaPessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarPessoas() {

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar pessoas cadastradas");
            System.out.println("2. listar profissão");
            System.out.println("3. Listar renda bruta");
            System.out.println("4. Listar CPF");
            System.out.println("5. Listar data de nascimento");
            System.out.println("6. Sair");

            while (!info.hasNextInt()) {
                System.out.println("Opção inválida. Digite novamente:");
                info.next();
            }

            opcao = info.nextInt();

            if (contribuintes.isEmpty()) {
                System.out.println("Nenhum contribuinte cadastrado.");
                break;
            }
            switch (opcao) {
                case 1:
                    for (Contribuinte contribuinte : contribuintes) {
                        System.out.println(contribuinte);
                    }
                    break;
                case 2:
                    for (Contribuinte contribuinte : contribuintes) {
                        System.out.println("Profissão: " + contribuinte.getProfissao());
                    }
                    break;
                case 3:
                    for (Contribuinte contribuinte : contribuintes) {
                        System.out.println("Renda Bruta: " + contribuinte.getRendaBruta());
                    }
                    break;
                case 4:
                    for (Contribuinte contribuinte : contribuintes) {
                        System.out.println("CPF: " + contribuinte.getCPF());
                    }
                    break;
                case 5:
                    for (Contribuinte contribuinte : contribuintes) {
                        System.out.println("Data de Nascimento: " + contribuinte.getDataNascimento());
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

    }
}