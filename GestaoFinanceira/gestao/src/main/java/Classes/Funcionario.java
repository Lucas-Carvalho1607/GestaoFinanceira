package Classes;



import Classes.Interface.Cadastro;
import ClassesAbstratas.Pessoa;


public class Funcionario extends Pessoa implements Cadastro{
    
    private String ctps;
    private String telefone;
    private Endereco endereco;
    
    public Funcionario(String nome, String cpf, String dataNasc, String ctps, String telefone, Endereco endereco) {
        super(nome, cpf, dataNasc);
        this.ctps = ctps;
        this.telefone = telefone;
        this.endereco = endereco;
    }

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
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public void cadastro() {
        
        
    }

    @Override
    public void excluir() {
        
        
    }

    @Override
    public void editar() {
        
    }
    

    
    

    

    




   /* cadastraFuncionario
    editaFuncionario
    excluiFuncionario
    listaFuncionario */

    
}