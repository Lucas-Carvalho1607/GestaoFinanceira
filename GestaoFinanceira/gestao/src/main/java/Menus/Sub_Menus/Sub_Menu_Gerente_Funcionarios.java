package Menus.Sub_Menus;

import java.util.Scanner;

public class Sub_Menu_Gerente_Funcionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========================================");
            System.out.println("SUB-MENU EDIÇÃO DE FUNCIONÁRIOS (GERENTE)");
            System.out.println("=========================================");
            System.out.println("1 - ADICIONAR FUNCIONÁRIO");
            System.out.println("2 - EDITAR FUNCIONÁRIO");
            System.out.println("3 - EXCLUIR FUNCIONÁRIO");
            System.out.println("4 - FUNCIONÁRIOS INSCRITOS");
            System.out.println("5 - Sair:");

            System.out.println("Escolha uma opção: ");
            System.out.print("===========================================");
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
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 4.");
            }
        }
    }
}
