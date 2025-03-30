package main.model;

public class Contribuinte {

   private String nome;
   private String profissao;
   private Double rendaBruta;
   private String CPF;
   private String dataNascimento;
   private String endereco;
   private String telefone;
   private String email;


   private static final String NOME_CAMPO_NOME = "O campo %s não pode ser vazio!";

    public  Contribuinte(String nome, String profissao, Double rendaBruta, String CPF, String dataNascimento, String endereco, String telefone, String email) {

        this.nome = validationCampos(nome, String.format(NOME_CAMPO_NOME, "Nome"));
        this.profissao = validationCampos(profissao, String.format(NOME_CAMPO_NOME, "Profissão"));
        this.rendaBruta = rendaBruta;
        this.CPF = validationCampos(CPF, String.format(NOME_CAMPO_NOME, "CPF"));
        this.dataNascimento = validationCampos(dataNascimento, String.format(NOME_CAMPO_NOME, "Data de Nascimento"));
        this.endereco = validationCampos(endereco, String.format(NOME_CAMPO_NOME, "Endereço"));
        this.telefone = validationCampos(telefone, String.format(NOME_CAMPO_NOME, "Telefone"));
        this.email = validationCampos(email, String.format(NOME_CAMPO_NOME, "Email"));
    }

    private String validationCampos(String campo, String nomeCampo) {
        if (campo == null || campo.trim().isEmpty()) {
            throw new IllegalArgumentException(nomeCampo + " não pode ser vazio!");
        }
        return campo;
    }


    public String getNome(){
        return nome;
    }

    public String getProfissao(){
        return profissao;
    }

    public Double getRendaBruta(){
        return rendaBruta;
    } // realizando o encapsulamento

    public String getCPF(){
        return CPF;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
}
