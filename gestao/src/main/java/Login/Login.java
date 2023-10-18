package Login;

import java.util.Scanner;

import Classes.Endereco;
import Classes.Gerente;
import Enum.Cargo;
import Menus.Menu_Cliente;
import Menus.Menu_Funcionario;
import Menus.Menu_Gerente;

public class Login {

    Scanner leia = new Scanner(System.in);

    private String loginGerente = "admin";
    private String senhaGerente = "admin";
    private String loginFuncionario = "func";
    private String senhaFuncionario = "func";
    private String loginCliente = "cl";
    private String senhaCliente = "cl";
    private String loginDigitado;
    private String senhaDigitada;

    Endereco enderecoGerente = new Endereco();
    Gerente gerente = new Gerente("Coxinha", "15465156", "20/10/1500", enderecoGerente, "21656466", "(24)99545646",
            Cargo.GERENTE);

    public void LoginGeral() {

        while (loginDigitado != loginGerente || loginDigitado != loginFuncionario || loginDigitado != loginCliente) {
            System.out.println("Login ou senha incorretos, tente novamente");
            System.out.println(" ");

            System.out.println("===============================\nMENU LOGIN\n===============================\n");
            System.out.println("Login: ");
            loginDigitado = leia.nextLine();
            System.out.println("Senha: ");
            senhaDigitada = leia.nextLine();

            if (loginDigitado.equalsIgnoreCase(loginGerente) && senhaDigitada.equals(senhaGerente)) {
                System.out.println("\n" + "\n" + "Seja bem vindo gerente " + gerente.getNome() + "!!");

                Menu_Gerente menuGerente = new Menu_Gerente();
                menuGerente.exibirMenuGerente();

            } else if (loginDigitado.equalsIgnoreCase(loginFuncionario) && senhaDigitada.equals(senhaFuncionario)) {
                System.out.println("Seja bem vindo funcionário!!");
                Menu_Funcionario menuFuncionario = new Menu_Funcionario();
                menuFuncionario.exibirMenuFuncionario();

            } else if (loginDigitado.equalsIgnoreCase(loginCliente) && senhaDigitada.equals(senhaCliente)) {
                System.out.println("Seja bem vindo cliente!!");
                Menu_Cliente menuCliente = new Menu_Cliente();
                menuCliente.exibirMenuCliente();

            } else {
                System.out.println("Acesso negado, login ou senha incorretos!");
            }
        }
    }
}
