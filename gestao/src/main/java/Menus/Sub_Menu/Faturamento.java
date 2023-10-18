package Menus.Sub_Menu;

import java.util.Scanner;


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
                    faturamentoPorCliente();
                    break;
                case 2:
                    faturamentoPorFornecedor();
                    break;
                case 3:
                    faturamentoPorProduto();
                    break;
                case 4:
                    faturamentoPorMes();
                    break;
                case 5:
                    faturamentoPorAno();
                    break;
                case 6:
                    faturamentoTotal();
                    break;
                case 7:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    public int lerEscolha(Scanner scanner) {
        int escolha = 0;
        try {
            escolha = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            scanner.nextLine();
        }
        return escolha;
    }

    public void faturamentoPorCliente() {

        double faturamentoClienteA = 5000.0;
        double faturamentoClienteB = 7000.0;

        System.out.println("Faturamento por Cliente:");
        System.out.println("Cliente A: R$" + faturamentoClienteA);
        System.out.println("Cliente B: R$" + faturamentoClienteB);
    }

    public void faturamentoPorFornecedor() {

        double faturamentoFornecedorX = 3000.0;
        double faturamentoFornecedorY = 4500.0;

        System.out.println("Faturamento por Fornecedor:");
        System.out.println("Fornecedor X: R$" + faturamentoFornecedorX);
        System.out.println("Fornecedor Y: R$" + faturamentoFornecedorY);
    }

    public void faturamentoPorProduto() {

        double faturamentoProdutoA = 1500.0;
        double faturamentoProdutoB = 2000.0;

        System.out.println("Faturamento por Produto:");
        System.out.println("Produto A: R$" + faturamentoProdutoA);
        System.out.println("Produto B: R$" + faturamentoProdutoB);
    }

    public void faturamentoPorMes() {

        double faturamentoJaneiro = 10000.0;
        double faturamentoFevereiro = 12000.0;

        System.out.println("Faturamento por Mês:");
        System.out.println("Janeiro: R$" + faturamentoJaneiro);
        System.out.println("Fevereiro: R$" + faturamentoFevereiro);
    }

    public void faturamentoPorAno() {

        double faturamentoAno2022 = 150000.0;
        double faturamentoAno2023 = 180000.0;

        System.out.println("Faturamento por Ano:");
        System.out.println("Ano 2022: R$" + faturamentoAno2022);
        System.out.println("Ano 2023: R$" + faturamentoAno2023);
    }

    public void faturamentoTotal() {

        double faturamentoTotal = 50000.0;

        System.out.println("Faturamento Total: R$" + faturamentoTotal);

    }
}
