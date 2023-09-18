package Classes;

public class Teste {
    import java.util.ArrayList;
    import java.util.Scanner;

public class Programa {
    

    public static void main(String[] args) {
        ArrayList<Double> recebimentos = new ArrayList<>();
        ArrayList<Double> pagamentos = new ArrayList<>();
        ArrayList<String> descricaoRecebimentos = new ArrayList<>();
        ArrayList<String> descricaoPagamentos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Menu ----");
            System.out.println("1. Inserir Recebimento");
            System.out.println("2. Inserir Pagamento");
            System.out.println("3. Resumo das Contas");
            System.out.println("4. Sair");
            System.out.print("Digite o número da opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    inserirRecebimento(recebimentos, descricaoRecebimentos);
                    break;
                case 2:
                    inserirPagamento(pagamentos, descricaoPagamentos);
                    break;

                case 3:
                    imprimirResumo(recebimentos, pagamentos, descricaoRecebimentos, descricaoPagamentos);
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, digite um número válido.");
            }
        }
    }

    public static void inserirRecebimento(ArrayList<Double> recebimentos, ArrayList<String> descricaoRecebimentos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do recebimento: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após o número
        System.out.print("Digite a descrição do recebimento: ");
        String descricao = scanner.nextLine();
        recebimentos.add(valor);
        descricaoRecebimentos.add(descricao);
    }

    public static void inserirPagamento(ArrayList<Double> pagamentos, ArrayList<String> descricaoPagamentos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do pagamento: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após o número
        System.out.print("Digite a descrição do pagamento: ");
        String descricao = scanner.nextLine();
        pagamentos.add(valor);
        descricaoPagamentos.add(descricao);
    }

    public static void imprimirResumo(ArrayList<Double> recebimentos, ArrayList<Double> pagamentos,
            ArrayList<String> descricaoRecebimentos, ArrayList<String> descricaoPagamentos) {
        System.out.println("----- Recebimentos -----");
        double totalRecebimentos = 0;
        for (int i = 0; i < recebimentos.size(); i++) {
            double valor = recebimentos.get(i);
            String descricao = descricaoRecebimentos.get(i);
            System.out.printf("%s: R$%.2f%n", descricao, valor);
            totalRecebimentos += valor;
        }
        System.out.printf("Subtotal de Recebimentos: R$%.2f%n%n", totalRecebimentos);

        System.out.println("----- Pagamentos -----");
        double totalPagamentos = 0;
        for (int i = 0; i < pagamentos.size(); i++) {
            double valor = pagamentos.get(i);
            String descricao = descricaoPagamentos.get(i);
            System.out.printf("%s: R$%.2f%n", descricao, valor);
            totalPagamentos += valor;
        }
        System.out.printf("Subtotal de Pagamentos: R$%.2f%n%n", totalPagamentos);

        double saldo = totalRecebimentos - totalPagamentos;
        System.out.println("----- Resumo -----");
        System.out.printf("Total de Recebimentos: R$%.2f%n", totalRecebimentos);
        System.out.printf("Total de Pagamentos: R$%.2f%n", totalPagamentos);
        System.out.printf("Saldo: R$%.2f%n", saldo);

        if (saldo < 0) {
            System.out.println("Cuidado! Você está devedor...");
        }
    }

}
}
