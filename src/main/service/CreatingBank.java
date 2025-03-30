package main.service;
import main.model.Banco;
import java.util.ArrayList;
import java.util.List;

public class CreatingBank {

    private List<Banco> bancos = new ArrayList<>();

    public void adicionarBanco(String banco, String agencia, String conta, String gerente, String endereco, int telefone, String email, String CNPJ) {
        Banco novoBanco = new Banco(banco, agencia, conta, gerente, endereco, telefone, email, CNPJ);
        bancos.add(novoBanco);
        System.out.println("Banco cadastrado com sucesso!");
    }
    public void listarBancos() {
        if (bancos.isEmpty()) {
            System.out.println("Nenhum banco cadastrado.");
        } else {
            System.out.println("Lista de Bancos:");
            for (Banco banco : bancos) {
                System.out.println("Banco: " + banco.getBanco());
                System.out.println("Agência: " + banco.getAgencia());
                System.out.println("Conta: " + banco.getConta());
                System.out.println("Gerente: " + banco.getGerente());
                System.out.println("Endereço: " + banco.getEndereco());
                System.out.println("Telefone: " + banco.getTelefone());
                System.out.println("Email: " + banco.getEmail());
                System.out.println("CNPJ: " + banco.getCNPJ());
                System.out.println("-----------------------------");
            }
        }
    }
}
