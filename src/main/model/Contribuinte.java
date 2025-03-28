package main.model;

public class Contribuinte {

   private String nome;
   private String profissao;
   private Double rendaBruta;
   private static final double JUROS = 0.17;

   private static final String NOME_CAMPO_NOME = "O campo %s não pode ser vazio!";

    public  Contribuinte(String nome, String profissao, Double rendaBruta){

        this.nome = validationCampos(nome, String.format(NOME_CAMPO_NOME, "Nome"));
        this.profissao = validationCampos(profissao, String.format(NOME_CAMPO_NOME, "Profissão"));
        this.rendaBruta = rendaBruta;
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

    public static double getJuros(){
        return JUROS;
    }
}
