import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MenuFuncionario {

        Scanner scanner = new Scanner(System.in);

        String menu = "===================================\n" +
                      "          MENU FUNCIONÁRIO\n" +
                      "===================================\n" +
                      "1 - Funcionários\n" +
                      "2 - Produtos\n" +
                      "3 - Clientes\n" +
                      "4 - Compras\n" +
                      "5 - Estoque\n" +
                      "6 - Faturamento\n" +
                      "7 - Sair\n" +
                      "Escolha uma opção:\n" +
                      "===================================";

        while (true) {
            System.out.println(menu);
            String escolha = scanner.nextLine();

            // Usando expressões regulares para validar a entrada do usuário
            if (Pattern.matches("[1-7]", escolha)) {
                int opcao = Integer.parseInt(escolha);

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a opção Funcionários.");
                        // Adicione aqui o código para Funcionários
                        break;
                    case 2:
                        System.out.println("Você escolheu a opção Produtos.");
                        // Adicione aqui o código para Produtos
                        break;
                    case 3:
                        System.out.println("Você escolheu a opção Clientes.");
                        // Adicione aqui o código para Clientes
                        break;
                    case 4:
                        System.out.println("Você escolheu a opção Compras.");
                        // Adicione aqui o código para Compras
                        break;
                    case 5:
                        System.out.println("Você escolheu a opção Estoque.");
                        // Adicione aqui o código para Estoque
                        break;
                    case 6:
                        System.out.println("Você escolheu a opção Faturamento.");
                        // Adicione aqui o código para Faturamento
                        break;
                    case 7:
                        System.out.println("Saindo do programa...");
                        scanner.close();
                        System.exit(0);
                        break;
                }
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 7.");
            }
        }
    }
}
