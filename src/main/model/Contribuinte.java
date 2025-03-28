package main.model;

public class Contribuinte {

   private String nome;
   private String profissao;
   private Double rendaBruta;
   private static final double JUROS = 0.17;

    public  Contribuinte(String nome, String profissao, Double rendaBruta){

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        if (profissao == null || profissao.trim().isEmpty()) {
            throw new IllegalArgumentException("Profissão não pode ser vazia!");
        }
        if (rendaBruta == null || rendaBruta < 0) {
            throw new IllegalArgumentException("Renda bruta não pode ser negativa!");
        }

        this.nome = nome;
        this.profissao = profissao;
        this.rendaBruta = rendaBruta;
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
