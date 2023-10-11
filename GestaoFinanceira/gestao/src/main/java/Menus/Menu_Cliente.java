package Menus;

import java.util.Scanner;

import Login.Login;

public class Menu_Cliente {

    public void exibirMenuCliente() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("          MENU CLIENTE");
            System.out.println("===================================");
            System.out.println("1 - Comprar");
            System.out.println("2 - Consultar Compra");
            System.out.println("3 - Sair");

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
                    Login lg = new Login();
                    lg.LoginGeral();

                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
