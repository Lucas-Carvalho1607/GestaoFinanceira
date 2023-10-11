package Menus;

import java.util.LinkedList;
import java.util.Scanner;

import Classes.Endereco;
import Classes.Funcionario;
import Login.Login;

public class Menu_Gerente {

    public void exibirMenuGerente() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("     ");
            System.out.println("===================================");
            System.out.println("          MENU GERENTE");
            System.out.println("===================================");
            System.out.println("1 - Incluir Funcionários");
            System.out.println("2 - Editar Funcionário");
            System.out.println("3 - Excluir Funcionário");
            System.out.println("4 - Sair:");
            System.out.print("===================================");

            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            System.out.println("      ");
            System.out.println("      ");

            switch (escolha) {
                case 1:
                cadastrarFuncionario();

        break;
        case 2:
        System.out.println();
        
        break;
        case 3:
        System.out.println();
        
        break;
        case 4:
        Login lg = new Login();
        lg.LoginGeral();
        
        break;
        default:
        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
    }
}
}
public void cadastrarFuncionario() {
    String nome, cpf, dataNasc, ctps, telefone;
    Endereco endereco;
    Scanner leia = new Scanner(System.in);

    System.out.println("Nome Funcionário: ");
    nome = leia.nextLine();
    System.out.println("Cpf: ");
        cpf = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Endereço: ");
        endereco;
        System.out.println("Ctps: ");
        ctps = leia.nextLine();
        System.out.println("Telefone: ");
        telefone = leia.nextLine();
        
        LinkedList<Funcionario> lista_Funcionário = new LinkedList<>();
        
        Funcionario novo_funcionario = new Funcionario(nome, cpf, dataNasc, ctps, telefone, endereco);
        lista_Funcionário.add(novo_funcionario);
    }
}
