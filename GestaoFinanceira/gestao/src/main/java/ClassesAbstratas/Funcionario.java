package ClassesAbstratas;


import java.util.LinkedList;

import Classes.Endereco;
import Classes.Interface.Cadastro;


public abstract class Funcionario extends Pessoa implements Cadastro{
    
    LinkedList<Funcionario>add_funcionario = new LinkedList<>();

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

    public Funcionario(String nome, String cpf, String dataNasc, String endereco, String ctps,
            String telefone) {
        super(nome, cpf, dataNasc, endereco);
        this.ctps = ctps;
        this.telefone = telefone;
        
    }
    
    public LinkedList<Funcionario> getListaFuncionario () {
        return add_funcionario;
        }

    

    




   /* cadastraFuncionario
    editaFuncionario
    excluiFuncionario
    listaFuncionario */

    
}