package poo.model;

public class Pessoa {

    public enum tipoPessoa {
        FISICA,
        JURIDICA
    }

    private Integer codigo;
    private String nome;
    public String numDocumento;
    public String tipo;

}
