package main.service;
import main.model.Banco;
import java.util.ArrayList;
import java.util.List;

public class CreatingBank {

    private List<Banco> bancos = new ArrayList<>();

    public void adicionarBanco(String banco, String gerente, String endereco, String telefone, String email, String CNPJ) {
        Banco novoBanco = new Banco(banco,gerente, endereco, telefone, email, CNPJ);
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
            }
        }
    }
    public Banco getBanco(String banco) {
        for (Banco b : bancos) {
            if (b.getBanco().equalsIgnoreCase(banco)) {
                return b;
            }
        }
        System.out.println("Banco não encontrado.");
        return null;
    }
}
