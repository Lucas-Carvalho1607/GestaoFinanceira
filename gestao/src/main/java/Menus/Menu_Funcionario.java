package Menus;

import java.util.LinkedList;
import java.util.Scanner;

import Classes.Cliente;
import Classes.Endereco;
import Enum.UnidadeFederal;
import Login.Login;
import Menus.Sub_Menu.Faturamento;
import Menus.Sub_Menu.MenuEstoque;

public class Menu_Funcionario {

    public void exibirMenuFuncionario() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("          MENU FUNCIONÁRIO");
            System.out.println("===================================");

            System.out.println("1 - Incluir Clientes");
            System.out.println("2 - Editar Clientes");
            System.out.println("3 - Excluir Clientes");
            System.out.println("4 - Adicionar Fornecedores");
            System.out.println("5 - Consulta Estoque");
            System.out.println("6 - Consulta Faturamento");
            System.out.println("7 - Sair");
            System.out.print("===================================");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarCliente();

                    break;
                case 2:
                    editarCliente();

                    break;
                case 3:
                    excluirCliente();

                    break;
                case 4:

                    break;
                case 5:
                    MenuEstoque estoque = new MenuEstoque();
                    estoque.SubEstoque();

                    break;

                case 6:
                    Faturamento faturamento = new Faturamento();
                    faturamento.exibirMenuFaturamento();
                    break;

                case 7:
                    Login lg = new Login();
                    lg.LoginGeral();

                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    LinkedList<Cliente> lista_Cliente = new LinkedList<>();

    public LinkedList<Cliente> exibiListaCliente() {
        return lista_Cliente;
    }

    public void exibirListaCliente() {
        System.out.println("Lista de Funcionários:");
        for (Cliente cliente : lista_Cliente) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            // System.out.println("Endereço:");
            // System.out.println("Rua: " + funcionario.getEndereco().getRua());
            // System.out.println("Bairro: " + funcionario.getEndereco().getBairro());
            // System.out.println("Número: " + funcionario.getEndereco().getNumero());
            // System.out.println("Complemento: " +
            // funcionario.getEndereco().getComplemento());
            // System.out.println("UF: " + funcionario.getEndereco().getUf());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("\n");
        }
    }

    public void cadastrarCliente() {
        String nome, cpf, dataNasc, telefone;
        Endereco endereco;
        Scanner leia = new Scanner(System.in);

        System.out.println("Nome Cliente: ");
        nome = leia.nextLine();
        System.out.println("Cpf: ");
        cpf = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Endereço:");
        System.out.println("Digite seu cep: ");
        System.out.println("Telefone: ");
        telefone = leia.nextLine();

        endereco = new Endereco("Rua", "Bairro", "123", "Complemento", UnidadeFederal.SP);

        Cliente novo_cliente = new Cliente(nome, cpf, dataNasc, telefone, endereco);
        lista_Cliente.add(novo_cliente);

    }

    public void editarCliente() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Lista de Funcionários:");
        for (int i = 0; i < lista_Cliente.size(); i++) {
            Cliente cliente = lista_Cliente.get(i);
            System.out.println((i + 1) + ". " + cliente.getNome());
        }

        System.out.print("Escolha o número do funcionário que deseja editar: ");
        int escolhaCliente = leia.nextInt();

        Cliente clienteSelecionado = lista_Cliente.get(escolhaCliente - 1);

        System.out.println("Editando Cliente: " + clienteSelecionado.getNome());
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

        System.out.println("Telefone: ");
        String novoTelefone = leia.nextLine();
        System.out.println();

        clienteSelecionado.setNome(novoNome);
        clienteSelecionado.setCpf(novoCpf);
        clienteSelecionado.setDataNasc(novaDataNasc);
        clienteSelecionado.setTelefone(novoTelefone);

        System.out.println("Cliente editado com sucesso!");
    }

    public void excluirCliente() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Lista de Cliente:");
        for (int i = 0; i < lista_Cliente.size(); i++) {
            Cliente cliente = lista_Cliente.get(i);
            System.out.println((i + 1) + ". " + cliente.getNome());
        }

        System.out.print("Escolha o número do cliente que deseja excluir: ");
        int escolhaCliente = leia.nextInt();

        Cliente clienteExcluir = lista_Cliente.get(escolhaCliente - 1);

        System.out.print("Tem certeza de que deseja excluir " + clienteExcluir.getNome() + "? (S/N): ");
        String confirmacao = leia.next();

        if (confirmacao.equalsIgnoreCase("S")) {
            lista_Cliente.remove(clienteExcluir);
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }
}
