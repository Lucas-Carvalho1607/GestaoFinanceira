package Menus.Sub_Menu;

import java.util.Scanner;

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
            System.out.println("4 -Voltar ao Menu Principal");
            System.out.println("5 - Sair:");
            System.out.print("===================================");

            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            System.out.println("      ");
            System.out.println("      ");

            switch (escolha) {
                case 1:

                    break;
                case 2:
                    System.out.println();

                    break;
                case 3:
                    System.out.println();

                    break;
                case 4:
                    Menu_Funcionario func = new Menu_Funcionario();
                    func.exibirMenuFuncionario();

                    break;

                case 5:
                    Login lg = new Login();
                    lg.LoginGeral();

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
