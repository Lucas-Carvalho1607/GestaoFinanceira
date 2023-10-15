package Classes;

import Enum.Cargo;
import java.util.Scanner;

public class Gerente extends Funcionario {
    
    
      public Gerente(String nome, String cpf, String dataNasc, Endereco endereco, String telefone, String ctps,
            Cargo cargo) {
        super(nome, cpf, dataNasc, telefone, endereco, ctps, cargo);
        
    }

    Scanner leia = new Scanner(System.in);
    
    
    
    
    

    
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
