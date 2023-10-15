package Menus;

import java.util.LinkedList;
import java.util.Scanner;

import Classes.Endereco;
import Classes.Funcionario;
import Enum.UnidadeFederal;
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
            System.out.println("4 - Lista de Funcionários");
            System.out.println("5 - Sair:");
            System.out.print("===================================");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            System.out.println("      ");
            System.out.println("      ");

            switch (escolha) {
                case 1:
                    cadastrarFuncionario();
                    break;

                case 2:
                    editarFuncionario();
                    break;

                case 3:
                    excluirFuncionario();
                    break;

                case 4:
                    exibirListaFuncionarios();
                    break;

                case 5:
                    Login lg = new Login();
                    lg.LoginGeral();
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    LinkedList<Funcionario> lista_Funcionario = new LinkedList<>();

    public LinkedList<Funcionario> exibiListaFunc() {
        return lista_Funcionario;
    }

    public void exibirListaFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : lista_Funcionario) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            // System.out.println("Endereço:");
            // System.out.println("Rua: " + funcionario.getEndereco().getRua());
            // System.out.println("Bairro: " + funcionario.getEndereco().getBairro());
            // System.out.println("Número: " + funcionario.getEndereco().getNumero());
            // System.out.println("Complemento: " +
            // funcionario.getEndereco().getComplemento());
            // System.out.println("UF: " + funcionario.getEndereco().getUf());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("\n");
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
        System.out.println("Endereço:");
        System.out.println("Digite seu cep: ");

        System.out.println("Ctps: ");
        ctps = leia.nextLine();
        System.out.println("Telefone: ");
        telefone = leia.nextLine();

        endereco = new Endereco("Rua", "Bairro", "123", "Complemento", UnidadeFederal.SP);

        Funcionario novo_funcionario = new Funcionario(nome, cpf, dataNasc, telefone, endereco, ctps, null);
        lista_Funcionario.add(novo_funcionario);

    }

    public void editarFuncionario() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Lista de Funcionários:");
        for (int i = 0; i < lista_Funcionario.size(); i++) {
            Funcionario funcionario = lista_Funcionario.get(i);
            System.out.println((i + 1) + ". " + funcionario.getNome());
        }

        System.out.print("Escolha o número do funcionário que deseja editar: ");
        int escolhaFuncionario = leia.nextInt();

        Funcionario funcionarioSelecionado = lista_Funcionario.get(escolhaFuncionario - 1);

        System.out.println("Editando funcionário: " + funcionarioSelecionado.getNome());
        System.out.print("Novo nome: ");
        String novoNome = leia.nextLine();
        System.out.println();

        System.out.print("Novo CPF: ");
        String novoCpf = leia.nextLine();
        System.out.println();

        System.out.println("Data de Nascimento: ");
        String novaDataNasc = leia.nextLine();
        System.out.println();

        // System.out.println("Endereço:");
        // System.out.println("Digite seu cep: ");

        System.out.println("Ctps: ");
        String novoCtps = leia.nextLine();
        System.out.println();

        System.out.println("Telefone: ");
        String novoTelefone = leia.nextLine();
        System.out.println();

        funcionarioSelecionado.setNome(novoNome);
        funcionarioSelecionado.setCpf(novoCpf);
        funcionarioSelecionado.setDataNasc(novaDataNasc);
        funcionarioSelecionado.setCtps(novoCtps);
        funcionarioSelecionado.setTelefone(novoTelefone);

        System.out.println("Funcionário editado com sucesso!");
    }

    public void excluirFuncionario() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Lista de Funcionários:");
        for (int i = 0; i < lista_Funcionario.size(); i++) {
            Funcionario funcionario = lista_Funcionario.get(i);
            System.out.println((i + 1) + ". " + funcionario.getNome());
        }

        System.out.print("Escolha o número do funcionário que deseja excluir: ");
        int escolhaFuncionario = leia.nextInt();

        Funcionario funcionarioExcluir = lista_Funcionario.get(escolhaFuncionario - 1);

        System.out.print("Tem certeza de que deseja excluir " + funcionarioExcluir.getNome() + "? (S/N): ");
        String confirmacao = leia.next();

        if (confirmacao.equalsIgnoreCase("S")) {
            lista_Funcionario.remove(funcionarioExcluir);
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }
}