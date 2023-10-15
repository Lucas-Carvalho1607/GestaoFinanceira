package Menus.Sub_Menu;

import java.util.Scanner;

import Login.Login;

public class Faturamento {

    public void exibirMenuFaturamento() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("          MENU FATURAMENTO");
            System.out.println("===================================");

            System.out.println("1 - Faturamento por cliente");
            System.out.println("2 - Faturamento por fornecedor");
            System.out.println("3 - Faturamento por produto");
            System.out.println("4 - Faturamento por mês");
            System.out.println("5 - Faturamento por ano");
            System.out.println("6 - Faturamento total");
            System.out.println("7 - Sair");

            System.out.print("===================================");
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                case 6:

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

}
