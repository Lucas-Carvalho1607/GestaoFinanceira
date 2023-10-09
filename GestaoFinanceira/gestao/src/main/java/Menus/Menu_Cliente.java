package Menus;

import java.util.Scanner;

public class Menu_Cliente {
    public void exibirMenuCliente () {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("          MENU CLIENTE");
            System.out.println("===================================");

            System.out.println("1 - Produtos");
            System.out.println("2 - Sair");

            System.out.println("Escolha uma opção: ");
            System.out.print("===================================");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Saindo do programa...");

                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 2.");
            }
        }
    }
}
