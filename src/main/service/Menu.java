package main.service;

import java.util.Scanner;

public class Menu {

    private CreatingBank criandoBanco = new CreatingBank();

    public void exibirMenu() {
        Scanner info = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Cadastro ---");
            System.out.println("1 - Cadastrar Contribuinte");
            System.out.println("2 - Cadastrar Banco");
            System.out.println("3 - Listar bancos cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (info.hasNextInt()) {
                opcao = info.nextInt();
                info.nextLine(); // Consumir quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.println("Cadastrar Contribuinte");
                        // Chamar um método para cadastro no futuro
                        break;
                    case 2:
                        System.out.println("Cadastrar Banco");
                        cadastrarBanco();
                        break;
                    case 3:
                        System.out.println("Listar Bancos Cadastrados");
                        criandoBanco.listarBancos();
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
        System.out.print("Digite o número da agência: ");
        String agencia = info.nextLine();
        System.out.print("Digite o número da conta: ");
        String conta = info.nextLine();
        System.out.print("Digite o nome do gerente: ");
        String gerente = info.nextLine();

        criandoBanco.adicionarBanco(banco, agencia, conta, gerente);
    }
}