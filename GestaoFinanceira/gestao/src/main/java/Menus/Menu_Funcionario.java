package Menus;

import java.util.Scanner;

import Login.Login;
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
            System.out.println("5 - Estoque");
            System.out.println("6 - Sair");

            System.out.print("===================================");
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println();

                    break;
                case 2:
                    System.out.println();

                    break;
                case 3:
                    System.out.println();

                    break;
                case 4:

                    break;
                case 5:
                    MenuEstoque estoque = new MenuEstoque();
                    estoque.SubEstoque();

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
}
