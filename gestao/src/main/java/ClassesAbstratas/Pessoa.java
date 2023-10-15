package ClassesAbstratas;

import Classes.Endereco;

public abstract class Pessoa{
    private String nome;
    private String cpf;
    private String dataNasc;
    private String telefone;
    private Endereco endereco;
    
    
    public Pessoa(String nome, String cpf, String dataNasc, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getDataNasc() {
        return dataNasc;
    }


    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    
    
    
    
    


}
    
    

