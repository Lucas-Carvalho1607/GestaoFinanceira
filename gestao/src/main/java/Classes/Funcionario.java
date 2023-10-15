package Classes;



import ClassesAbstratas.Pessoa;
import Enum.Cargo;
import Interface.Cadastro;


public class Funcionario extends Pessoa implements Cadastro{
    private String ctps;
    private Cargo cargo;
    
    
    public Funcionario(String nome, String cpf, String dataNasc, String telefone, Endereco endereco, String ctps,
            Cargo cargo) {
        super(nome, cpf, dataNasc, telefone, endereco);
        this.ctps = ctps;
        this.cargo = cargo;
    }
    

    public String getCtps() {
        return ctps;
    }


    public void setCtps(String ctps) {
        this.ctps = ctps;
    }


    public Cargo getCargo() {
        return cargo;
    }


    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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
    
}