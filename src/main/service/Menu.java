package main.service;
import main.model.Banco;
import main.model.Contribuinte;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.awt.SystemColor.info;

public class Menu {

    private  final CreatingBank criandoBanco = new CreatingBank();
    private  final CreatingPerson criandoPessoa = new CreatingPerson();

    public void exibirMenu() {
        Scanner info = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Cadastro ---");
            System.out.println("1 - Cadastrar Contribuinte");
            System.out.println("2 - Cadastrar Banco");
            System.out.println("3 - Listar bancos cadastrados");
            System.out.println("4 - Listar contribuintes cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (info.hasNextInt()) {
                opcao = info.nextInt();
                info.nextLine(); // Consumir quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.println();
                        CadastrarContribuinte();
                        break;
                    case 2:
                        System.out.println();
                        cadastrarBanco();
                        break;
                    case 3:
                        System.out.println();
                        criandoBanco.listarBancos();
                        break;
                    case 4:
                        System.out.println();
                        criandoPessoa.listarPessoas();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                info.next(); // Descarta a entrada inválida
                opcao = -1; // Continua no loop
            }

        } while (opcao != 0);

        info.close();
    }

    private void cadastrarBanco() {
        Scanner info = new Scanner(System.in);
        System.out.print("Digite o nome do banco: ");
        String banco = info.nextLine();
        System.out.print("Digite o nome do gerente: ");
        String gerente = info.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = info.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = info.nextLine();
        System.out.print("Digite o email: ");
        String email = info.nextLine();
        System.out.print("Digite o CNPJ: ");
        String CNPJ = info.nextLine();

        criandoBanco.adicionarBanco(banco, gerente , endereco, telefone, email, CNPJ);
    }

    private void CadastrarContribuinte() {

        Scanner info = new Scanner(System.in);

        System.out.println("Bancos disponíveis:");
        criandoBanco.listarBancos(); // Exibe os bancos cadastrados

        Banco bancoEscolhido = null;
        while (bancoEscolhido == null) {
            System.out.print("Digite o nome do banco onde deseja abrir a conta: ");
            String nomeBanco = info.nextLine();
            bancoEscolhido = criandoBanco.getBanco(nomeBanco);

            if (bancoEscolhido == null) {
                System.out.println("Banco não encontrado! Digite um nome válido.");
            }
        }
        System.out.print("Digite o nome: ");
        String nome = info.nextLine();
        System.out.print("Digite a profissão: ");
        String profissao = info.nextLine();
        System.out.print("Digite a renda bruta: ");
        Double rendaBruta = info.nextDouble();
        info.nextLine(); // Consumir quebra de linha
        System.out.print("Digite o CPF: ");
        String CPF = info.nextLine();
        System.out.print("Digite a data de nascimento: ");
        String dataNascimento = info.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = info.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = info.nextLine();
        System.out.print("Digite o email: ");
        String email = info.nextLine();
        System.out.print("Digite o número da conta: ");
        String conta = info.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = info.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoFormatada;
        try {
            dataNascimentoFormatada = LocalDate.parse(dataNascimento, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido! Use o formato dd/MM/yyyy.");
            return;
        }

        criandoPessoa.adicionarPessoa(nome, profissao, rendaBruta, CPF, LocalDate.parse(dataNascimento), endereco, telefone, email, conta, agencia);
    }

}