package Classes;

import Enum.UnidadeFederal;

import java.util.LinkedList;
import java.util.Scanner;

public class Gerente extends Funcionario {
    
    
    public Gerente(String nome, String cpf, String dataNasc, Endereco endereco, String telefone, String ctps) {
        super(nome, cpf, dataNasc, ctps, telefone, endereco);
    }
    
    Scanner leia = new Scanner(System.in);
    
    
    Endereco enderecoGerente = new Endereco("Rua dos Salgados ", "aaaaaaaaaa", "2000", "Coxinha", UnidadeFederal.RJ);
    Gerente gerente = new Gerente("Coxinha", "15465156", "20/10/1500", enderecoGerente, "21656466", "(24)99545646");
    
    

    
    @Override
    public void cadastro() {
        

        
}
        

    @Override
    public void editar() {

    }

    @Override
    public void excluir() {

    }
}
