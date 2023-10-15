package Classes;

import ClassesAbstratas.Pessoa;

public class Cliente extends Pessoa {

    
    public Cliente(String nome, String cpf, String dataNasc, String telefone, Endereco endereco) {
        super(nome, cpf, dataNasc, telefone, endereco);
       
    }

}
