package ClassesAbstratas;


import Classes.Endereco;


public abstract class Funcionario extends Pessoa{
    
    private String ctps;
    private String telefone;

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Funcionario(String nome, String cpf, String dataNasc, Endereco endereco, String ctps,
            String telefone) {
        super(nome, cpf, dataNasc, endereco);
        this.ctps = ctps;
        this.telefone = telefone;
        
    }

    
    




   /* cadastraFuncionario
    editaFuncionario
    excluiFuncionario
    listaFuncionario */

    
}