package main.model;

public class Banco {

    private String banco;
    private String agencia;
    private String conta;
    private String gerente;
    private String endereco;
    private String telefone;
    private String email;
    private String CNPJ;


    private static final String NOME_CAMPO_NOME = "O campo %s não pode ser vazio!";


    public  Banco (String banco, String agencia, String conta, String gerente, String endereco, String telefone, String email, String CNPJ) {

        this.banco = validationCampos(banco, String.format(NOME_CAMPO_NOME, "Banco"));
        this.agencia = validationCampos(agencia, String.format(NOME_CAMPO_NOME, "Agência"));
        this.conta = validationCampos(conta, String.format(NOME_CAMPO_NOME, "Conta"));
        this.gerente = validationCampos(gerente, String.format(NOME_CAMPO_NOME, "Gerente"));
        this.endereco = validationCampos(endereco, String.format(NOME_CAMPO_NOME, "Endereço"));
        this.telefone = validationCampos(String.valueOf(telefone), String.format(NOME_CAMPO_NOME, "Telefone"));
        this.email = validationCampos(email, String.format(NOME_CAMPO_NOME, "Email"));
        this.CNPJ = validationCampos(CNPJ, String.format(NOME_CAMPO_NOME, "CNPJ"));

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
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getCNPJ() {
        return CNPJ;
    }
}
