package main.model;

public class Banco {

    private String banco;
    private String agencia;
    private String conta;
    private String gerente;

    public  Banco (String banco, String agencia, String conta, String gerente){

        if (banco == null || banco.trim().isEmpty()) {
            throw new IllegalArgumentException("Banco não pode ser vazio!");
        }
        if (agencia == null || agencia.trim().isEmpty()) {
            throw new IllegalArgumentException("Agência não pode ser vazia!");
        }
        if (conta == null || conta.trim().isEmpty()) {
            throw new IllegalArgumentException("Conta não pode ser vazia!");
        }
        if (gerente == null || gerente.trim().isEmpty()) {
            throw new IllegalArgumentException("Gerente não pode ser vazio!");
        }

        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.gerente = gerente;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getBanco() {
        return banco;
    }

    public String getConta() {
        return conta;
    }

    public String getGerente() {
        return gerente;
    }
}
