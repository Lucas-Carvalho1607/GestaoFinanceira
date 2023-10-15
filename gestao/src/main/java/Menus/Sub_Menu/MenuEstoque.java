package Menus.Sub_Menu;

import java.util.LinkedList;
import java.util.Scanner;
import Classes.Produto;
import Login.Login;
import Menus.Menu_Funcionario;

public class MenuEstoque {

    public void SubEstoque() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("   ");
            System.out.println("===================================");
            System.out.println("          ESTOQUE");
            System.out.println("===================================");
            System.out.println("1 - Incluir Produtos");
            System.out.println("2 - Editar Produtos");
            System.out.println("3 - Excluir Produtos");
            System.out.println("4 - Lista Produtos");
            System.out.println("5 - Voltar ao Menu Principal");
            System.out.println("6 - Sair:");
            System.out.print("===================================");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            System.out.println("      ");
            System.out.println("      ");

            switch (escolha) {
                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    editarProduto();
                    break;

                case 3:
                    excluirProduto();
                    break;

                case 4:
                    exibirListaProduto();
                    break;

                case 5:
                    Menu_Funcionario func = new Menu_Funcionario();
                    func.exibirMenuFuncionario();
                    break;

                case 6:
                    Login lg = new Login();
                    lg.LoginGeral();
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    LinkedList<Produto> lista_Produto = new LinkedList<>();

    public LinkedList<Produto> exibiListaProduto() {
        return lista_Produto;
    }

    public void exibirListaProduto() {
        System.out.println("Lista de Produtos:");
        System.out.println();
        for (Produto produto : lista_Produto) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("\n");
        }
    }

    public void cadastrarProduto() {
        String nome, quantidade, valor;

        Scanner leia = new Scanner(System.in);

        System.out.println("Produto: ");
        nome = leia.nextLine();
        System.out.println("Quantidade: ");
        quantidade = leia.nextLine();
        System.out.println("Valor: ");
        valor = leia.nextLine();


        Produto novo_Produto = new Produto(nome, quantidade, valor);
        lista_Produto.add(novo_Produto);

    }

    public void editarProduto() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Lista de Produtos:");
        for (int i = 0; i < lista_Produto.size(); i++) {
            Produto produto = lista_Produto.get(i);
            System.out.println((i + 1) + ". " + produto.getNome());
        }

        System.out.print("Escolha o número do produto que deseja editar: ");
        int escolhaProduto = leia.nextInt();

        Produto produtoSelecionado = lista_Produto.get(escolhaProduto - 1);

        System.out.println("Editando Produto: " + produtoSelecionado.getNome());
        System.out.print("Produto: ");
        String novoNome = leia.nextLine();
        System.out.println();

        System.out.print("Quantidade: ");
        String novaQuantidade = leia.nextLine();
        System.out.println();

        System.out.println("Valor: ");
        String novoValor = leia.nextLine();
        System.out.println();

        produtoSelecionado.setNome(novoNome);
        produtoSelecionado.setQuantidade(novaQuantidade);
        produtoSelecionado.setValor(novoValor);

        System.out.println("Produto editado com sucesso!");
    }

    public void excluirProduto() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Lista de Produto:");
        for (int i = 0; i < lista_Produto.size(); i++) {
            Produto produto = lista_Produto.get(i);
            System.out.println((i + 1) + ". " + produto.getNome());
        }

        System.out.print("Escolha o número do Produto que deseja excluir: ");
        int escolhaProduto = leia.nextInt();

        Produto produtoExcluir = lista_Produto.get(escolhaProduto - 1);

        System.out.print("Tem certeza de que deseja excluir " + produtoExcluir.getNome() + "? (S/N): ");
        String confirmacao = leia.next();

        if (confirmacao.equalsIgnoreCase("S")) {
            lista_Produto.remove(produtoExcluir);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
    }
}