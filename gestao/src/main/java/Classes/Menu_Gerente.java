package Classes;

import java.util.Scanner;

public class Menu_Gerente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println("          MENU GERENTE");
            System.out.println("===================================");
            System.out.println("1 - Funcionários");
            System.out.println("2 - Produtos");
            System.out.println("3 - Clientes");
            System.out.println("4 - Compras");
            System.out.println("5 - Estoque");
            System.out.println("6 - Faturamento");
            System.out.println("7 - Sair:");

            System.out.println("Escolha uma opção: ");
            System.out.print("===================================");
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
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Saindo do programa...");

                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 7.");
            }
        }
    }
}
