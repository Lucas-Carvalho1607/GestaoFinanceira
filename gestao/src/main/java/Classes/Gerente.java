package Classes;

import ClassesAbstratas.Funcionario;

import java.util.LinkedList;
import java.util.Scanner;

public class Gerente extends Funcionario {

    Scanner leia = new Scanner(System.in);

    Endereco enderecoGerente;
    LinkedList<Funcionario> lista_Gerente = new LinkedList<>();

    public Gerente(String nome, String cpf, String dataNasc, String endereco, String ctps, String telefone) {
        super(nome, cpf, dataNasc, endereco, ctps, telefone);

    }

    public LinkedList<Funcionario> getListaFuncionario() {
        return lista_Gerente;
    }

    @Override
    public void cadastro() {
        String nome, cpf, dataNasc, endereco, ctps, telefone;

        System.out.println("Nome Funcionário: ");
        nome = leia.nextLine();
        System.out.println("Cpf: ");
        cpf = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Enedereço: ");
        endereco = leia.nextLine();
        System.out.println("Ctps: ");
        ctps = leia.nextLine();
        System.out.println("Telefone: ");
        telefone = leia.nextLine();

        Gerente novo_Gerente = new Gerente(nome, cpf, dataNasc, endereco, ctps, telefone); {
            lista_Gerente.add(novo_Gerente);
        }
        
        

    }

    @Override
    public void editar() {

    }

    @Override
    public void excluir() {

    }
}
