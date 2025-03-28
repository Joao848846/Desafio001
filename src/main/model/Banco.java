package main.model;

public class Banco {

    private String banco;
    private String agencia;
    private String conta;
    private String gerente;

    private static final String NOME_CAMPO_NOME = "O campo %s não pode ser vazio!";


    public  Banco (String banco, String agencia, String conta, String gerente){

        this.banco = validationCampos(banco, String.format(NOME_CAMPO_NOME, "Banco"));
        this.agencia = validationCampos(agencia, String.format(NOME_CAMPO_NOME, "Agência"));
        this.conta = validationCampos(conta, String.format(NOME_CAMPO_NOME, "Conta"));
        this.gerente = validationCampos(gerente, String.format(NOME_CAMPO_NOME, "Gerente"));
    }

    private String validationCampos(String campo, String nomeCampo) {
        if (campo == null || campo.trim().isEmpty()) {
            throw new IllegalArgumentException(nomeCampo + " não pode ser vazio!");
        }
        return campo;
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
