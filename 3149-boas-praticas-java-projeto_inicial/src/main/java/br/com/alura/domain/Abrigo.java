package br.com.alura.domain;

public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet pet;

    public Abrigo() {
    }

    public Abrigo(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }
}
