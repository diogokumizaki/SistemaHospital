package br.unipar.model;

public class Pessoa {
    
    private String nome;
    private String email;
    private int telefone;
    private int cpf;
    private Endereco endereco;
    private int idPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

   
   
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", endereco=" + endereco +  ", idPessoa=" + idPessoa + '}';
    }

}
